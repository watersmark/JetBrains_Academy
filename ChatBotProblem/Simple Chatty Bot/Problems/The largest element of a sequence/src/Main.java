import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int max = 0;

        while (true){
            int digit = scanner.nextInt();
            if(digit == 0) break;

            if(digit > max){
                max = digit;
            }
        }

        System.out.println(max);
    }
}