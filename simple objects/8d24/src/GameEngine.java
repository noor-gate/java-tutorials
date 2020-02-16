public class GameEngine {

    public static void simulateBattle(LuckyFighter first, LuckyFighter second) {
        System.out.println("At start of battle, stats are:");
        printStatus(first);
        printStatus(second);
        System.out.println("------------------------------");

        while (!first.isDead() && !second.isDead()) {
            round(first, second);
        }

        System.out.print("End of battle, ");

        if (first.isDead()) {
            printStatus(second);
        } else {
            printStatus(first);
        }

        System.out.print(" wins!");
    }

    public static void printStatus(LuckyFighter fighter) {
        System.out.print(fighter.getName() + " - " + fighter.getStrategy() + " " + fighter.getType()
                + " - skill: " + fighter.getSkill()
                + "; stamina: " + fighter.getStamina() + "; luck: " + fighter.getLuck() + "\n");
    }

    public static void round(LuckyFighter first, LuckyFighter second) {
        int firstAtt = first.calculateAttackScore();
        int secondAtt = second.calculateAttackScore();

        if (firstAtt == secondAtt) {
            System.out.println(first.getName() + " draws with " + second.getName());
        } else {

            LuckyFighter loser;
            LuckyFighter winner;

            if (firstAtt > secondAtt) {
                winner = first;
                loser = second;
            } else {
                loser = first;
                winner = second;
            }

            loser.takeDamage();

            System.out.println(winner.getName() + " hits " + loser.getName() + ", stats are:");


            if (winner.getStrategy().equals("Aggressive")) {
                if (winner.useLuck()) {
                    loser.takeDamage();
                }
            }

            boolean lose = loser.useLuck();

            if (loser.getStrategy().equals("Defensive")) {
                if (lose) {
                    loser.incrementStamina();
                } else {
                    loser.decrementStamina();
                }
            }

            printStatus(first);
            printStatus(second);
        }
        System.out.println("------------------------------");
    }
}
