import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class five {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        ArrayList<String> input = new ArrayList<>();
        Deque<String> myDeque = new ArrayDeque<>();

  /*    while (!line.equals("end")) {
            input.add(line);
            line = br.readLine();
        }

        for (int i = input.size() - 1; i >= 0; i--) {
            System.out.println(input.get(i));
        } */

        while (!line.equals("end")) {
            myDeque.push(line);
            line = br.readLine();
        }

        for (int i = myDeque.size() - 1; i >= 0; i--) {
            System.out.println(myDeque.pop());
        }





    }
}
