public class Main {
    public static void main(String[] args) {

        Fighter first = new Fighter("Joe", "Human Warrior", 16, 12);
        Fighter second = new Fighter("Alex", "Elf Lord", 18, 6);

        GameEngine game = new GameEngine();
        game.simulateBattle(first, second);
    }
}
