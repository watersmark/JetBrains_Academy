import java.util.Scanner;

public class Main {

    public static long factorial(long n) {
        // write your code here
        long fact  = 1;
        for(long i = n; i > 0; i--){
            fact *= i;
        }
        return fact;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}