public class two {

    public static void main(String[] args) {
        for (int i = 1; i <= 2000; i++) {
            if (checkPalindrome(String.valueOf(i * i * i))) {
                System.out.println(i + " cubed is " + i * i * i);
            }
        }
    }

    public static boolean checkPalindrome(String cube) {
        for (int i = 0; i < cube.length() / 2; i++) {
            if (cube.charAt(i) != cube.charAt(cube.length() - (i + 1))) {
               return false;
            }
        }
        return true;
    }
}
