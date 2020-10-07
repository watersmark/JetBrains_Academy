package converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();

        System.out.println(digit % 8);

    }
}
