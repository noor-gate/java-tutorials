public class Main {
    public static void main(String[] args) {

        LuckyFighter first = new LuckyFighter("Joe", "Human Warrior", 16, 12, 12, "Aggressive");
        LuckyFighter second = new LuckyFighter("Alex", "Elf Lord", 18, 6, 11, "Defensive");

        GameEngine game = new GameEngine();
        game.simulateBattle(first, second);
    }
}
