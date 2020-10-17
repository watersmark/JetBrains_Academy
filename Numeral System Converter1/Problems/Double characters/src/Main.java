import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String resStr = "" ;

        for (int i = 0; i < str.length(); i++) {

            resStr += str.charAt(i);
            resStr += str.charAt(i);

        }

        System.out.println(resStr);
    }
}