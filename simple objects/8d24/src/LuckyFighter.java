import java.util.Random;

public class LuckyFighter {

    private String name;
    private String type;
    private final int skill;
    private int stamina;
    private final int DAMAGE_POINTS = 2;
    private int luck;
    private String strategy;

    public LuckyFighter(String name, String type, int skill, int stamina, int luck, String strategy) {
        this.name = name;
        this.type = type;
        this.skill = skill;
        this.stamina = stamina;
        this.luck = luck;
        this.strategy = strategy;
    }

    public void takeDamage() {
        stamina = stamina >= 1 ? stamina -= 2 : 0;
    }

    public int calculateDamage() {
        return DAMAGE_POINTS;
    }

    public int calculateAttackScore() {
        Random diceOne = new Random();
        Random diceTwo = new Random();
        return skill + diceOne.nextInt(7) + diceTwo.nextInt(7);
    }

    public boolean useLuck() {
        Random diceOne = new Random();
        Random diceTwo = new Random();
        boolean lucky = Math.random() < 0.5 && diceOne.nextInt() + diceTwo.nextInt() <= luck;


        if (strategy.equals("Aggressive")) {
            System.out.println(name + " goes for an aggressive hit...");
            System.out.println(name + " tests luck...");
            if (lucky) {
                System.out.println(name + " is lucky!");
                System.out.println("The hit is aggressive!");
                return true;
            }
        } else if (strategy.equals("Defensive")) {
            System.out.println(name + " tries to resist the damage...");
            System.out.println(name + " tests luck...");
            if (lucky) {
                System.out.println(name + " is lucky!");
                System.out.println("The damage is partially resisted!");
                return true;
            }
        }
        System.out.println(name + " is unlucky");
        return false;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getSkill() {
        return skill;
    }

    public int getStamina() {
        return stamina;
    }

    public void incrementStamina() {
        stamina++;
    }

    public void decrementStamina() {
        stamina--;
    }

    public int getLuck() { return luck; }

    public String getStrategy() { return strategy; }

    public boolean isDead() {
        return stamina == 0;
    }
}
