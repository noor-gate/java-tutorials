import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class six {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        ArrayList<String> input = new ArrayList<>();

        while (!line.equals("end")) {
            input.add(line);
            line = br.readLine();
        }

        for (int i = 0; i < input.size(); i++) {
            System.out.print(toPigLatin(input.get(i)) + "\n");
        }

    }

    public static String toPigLatin(String s) {
        String[] sentence = s.split(" ");
        StringBuilder pigString = new StringBuilder();


        for (String word : sentence) {

            char lastLetter = word.charAt(word.length() - 1);

            if (Character.isDigit(word.charAt(0))) {
                pigString.append(word + " ");
            } else if (!Character.isAlphabetic(lastLetter)) {
                pigString.append(translateWord(word.substring(0, word.length() - 1)) + lastLetter + " ");
            } else {
                pigString.append(translateWord(word) + " ");
            }
        }

        return pigString.toString();
    }

    public static String translateWord(String s) {
        String vowels = "aeiouAEIOU";
        if (vowels.contains(Character.toString(s.charAt(0)))) {
            return s + "way";
        } else {
            String str = s.substring(1) + s.charAt(0) + "ay";
            if (Character.isUpperCase(s.charAt(0))) {
                return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
            }
            return str.toLowerCase();
        }
    }


}
