package correcter;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder line = new StringBuilder(scanner.nextLine());

        //System.out.println(line.length());

        for (int i = 0; i < line.length(); i++) {

            if (i % 3 == 0) {
                String elem = String.valueOf(new Random().nextInt(9));
                line.setCharAt(i, elem.charAt(0));
            }
        }

        System.out.println(line);
    }
}
