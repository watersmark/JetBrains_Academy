import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int digit = scanner.nextInt();


        if((digit > -15 && digit <= 12) || (digit > 14 && digit < 17) || (digit >= 19)){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

        int a = 32;
        int b =4;

        int max = a < b ? b : a;

        int max1 = a > b !? a : b;

        int max2 = a > b ? a : b;

        int max3= a > b ? b : a;

        int max4 = a : b ? a > b;

    }
}