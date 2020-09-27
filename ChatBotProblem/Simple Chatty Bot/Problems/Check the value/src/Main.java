import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();

        if(digit < 10 && digit > 0){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}