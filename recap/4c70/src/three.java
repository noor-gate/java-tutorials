import java.util.*;

public class three {

    public static Set<Integer> lotto = new HashSet<>();
    public static List<Integer> lottoArray = new ArrayList<>();
    public static Random generator = new Random();

    public static void main(String[] args) {

        while (lotto.size() <= 7) {
            lotto.add(generator.nextInt(49) + 1);
        }

        for (int num : lotto) {
            lottoArray.add(num);
        }

        for (int i = 0; i < 6; i++) {
            System.out.println("Number " + (i + 1) + ": " + lottoArray.get(i));
        }

        System.out.println("Bonus Number: " + lottoArray.get(7));
    }


}
