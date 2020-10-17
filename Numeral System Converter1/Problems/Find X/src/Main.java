import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        char[] mass = new char[]{'A', 'B', 'C'};
        String str1 = "This is str";

        char[] mass1 = str1.toCharArray();
        for (char el : mass1) {
            System.out.print(el + " ");
        }

    }
}