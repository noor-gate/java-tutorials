public class GameEngine {

    public static void simulateBattle(Fighter first, Fighter second) {
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

    public static void printStatus(Fighter fighter) {
        System.out.print(fighter.getName() + " - " + fighter.getType() + " - skill: " + fighter.getSkill()
                + "; stamina: " + fighter.getStamina() + "\n");
    }

  public static void round(Fighter first, Fighter second) {
    int firstAtt = first.calculateAttackScore();
    int secondAtt = second.calculateAttackScore();

    if (firstAtt == secondAtt) {
      System.out.println(first.getName() + " draws with " + second.getName());
    } else {

      Fighter loser;
      Fighter winner;

      if (firstAtt > secondAtt) {
        winner = first;
        loser = second;
      } else {
        loser = first;
        winner = second;
      }

      loser.takeDamage(loser.calculateDamage());

      System.out.println(winner.getName() + " hits " + loser.getName() + ", stats are:");
      printStatus(first);
      printStatus(second);
    }
      System.out.println("------------------------------");
  }
}
