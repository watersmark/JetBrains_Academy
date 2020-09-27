import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for (int i = 1; ; i++) {
            int elem = i * i;

            if (elem > N) {
                break;
            }

            System.out.println(elem);

        }
    }
}