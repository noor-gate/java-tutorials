public class one {
    static int next(int x) {
        if (x % 2 == 0) {
            return x / 2;
        } else {
            return 3 * x + 1;
        }
    }

    public static void main(String args[]) {
        int posInt = Integer.parseInt(args[0]);
        System.out.print(posInt);
        while (posInt != 1) {
            posInt = next(posInt);
            System.out.print(" " + posInt);
        }
    }
}