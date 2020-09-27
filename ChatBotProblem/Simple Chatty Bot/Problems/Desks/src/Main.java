import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first_class = scanner.nextInt();
        int second_class = scanner.nextInt();
        int third_class = scanner.nextInt();

        int elem1 = (first_class / 2) + (first_class % 2);
        int elem2 = (second_class / 2) + (second_class % 2);
        int elem3 = (third_class / 2) + (third_class % 2);

        System.out.println(elem1 + elem2 + elem3);

    }
}