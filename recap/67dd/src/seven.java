import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class seven {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        ArrayList<String> input = new ArrayList<>();

        while (!line.equals("end")) {
            input.add(line);
            line = br.readLine();
        }

        int words = 0, chars = 0;


        for (int i = 0; i < input.size(); i++) {
            char[] inputChars = input.get(i).toCharArray();
            for (int j = 0; j < inputChars.length; j++) {
                char c = inputChars[j];
                if (c == (' ')) {
                    words ++;
                } else {
                    chars ++;
                }
            }
        }

        System.out.println(input.size());
        System.out.println(words + input.size());
        System.out.println(chars);

    }

}
