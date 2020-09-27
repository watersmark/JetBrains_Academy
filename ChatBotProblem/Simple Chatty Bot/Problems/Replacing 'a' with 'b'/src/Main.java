import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next().replaceAll("a", "b");
        System.out.println(str);
    }
}