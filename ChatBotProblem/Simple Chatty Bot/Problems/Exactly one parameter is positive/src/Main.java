import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f = scanner.nextInt();
        int s = scanner.nextInt();
        int th = scanner.nextInt();

        int pos = 0;

        if (f > 0) {
            pos++;
        } else {
        }

        if (s > 0) {
            pos++;
        } else {
        }

        if (th > 0) {
            pos++;
        } else {
        }

        if (pos == 1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}