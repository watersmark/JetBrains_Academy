import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        boolean bool = true;

        for (int i = 0; i < Math.floor(inputStr.length() / 2.0); i++) {

            if(inputStr.charAt(i) != inputStr.charAt(inputStr.length() - 1 - i)){
                System.out.println("no");
                bool = false;
            }

        }

        if(bool) System.out.println("yes");
    }
}