import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int sum = 0;
        int elem_last = 0;

        for (int i = 0; i < count; i++) {

            if (i == 0) {
                elem_last = scanner.nextInt();
                continue;
            }

            int elem_temp = scanner.nextInt();

            if (sum < elem_last * elem_temp) {
                sum = elem_last * elem_temp;
            }

            elem_last = elem_temp;

        }

        System.out.println(sum);

    }
}