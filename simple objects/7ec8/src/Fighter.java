import java.util.Random;

public class Fighter {

    private String name;
    private String type;
    private final int skill;
    private int stamina;
    private final int DAMAGE_POINTS = 2;

    public Fighter(String name, String type, int skill, int stamina) {
        this.name = name;
        this.type = type;
        this.skill = skill;
        this.stamina = stamina;
    }

    public void takeDamage(int damage) {
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

    public boolean isDead() {
        return stamina == 0;
    }
}
