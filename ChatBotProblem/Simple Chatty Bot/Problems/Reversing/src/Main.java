import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();

        int new_int = 0;

        new_int += 100 * (digit % 10);
        new_int += 10 * (digit / 10 % 10);
        new_int += digit/ 100;

        System.out.println(new_int);


    }
}