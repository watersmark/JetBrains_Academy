package correcter;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder line = new StringBuilder(scanner.nextLine());
        StringBuilder line2 = new StringBuilder();

        System.out.println(line);
        for (int i = 0; i < line.length(); i++) {
            for (int j = 0; j < 3; j++) {
                line2.append(line.charAt(i));
            }
        }

        System.out.println(line2);
        for (int i = 0; i < line2.length(); i++) {
            if (i % 3 == 0) {

                String elem = null;
                while (true) {
                    elem = String.valueOf(new Random().nextInt(9));

                    if(elem.charAt(0) != line2.charAt(i)){
                        break;
                    }
                }

                line2.setCharAt(i, elem.charAt(0));
            }
        }

        System.out.println(line2);


        char elNow = line2.charAt(0);
        int countNow = 0;

        StringBuilder line3 = new StringBuilder();

        for (int i = 0, k = 1; i < line2.length(); i++, k++) {

            if (i % 3 == 0) {
                elNow = line2.charAt(i);
                countNow++;
                continue;
            }

            if (elNow == line2.charAt(i)) countNow++;

            if (k % 3 == 0) {

                if (countNow == 1) {
                    line3.append(line2.charAt(k - 1));
                } else {
                    line3.append(elNow);
                }

                countNow = 0;
            }

        }

        System.out.println(line3);
    }
}
