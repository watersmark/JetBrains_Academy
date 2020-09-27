import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);


        int a = scanner.nextInt();
        int b = scanner.nextInt();


        long multiple = a;


        for(int i = a + 1; i < b; i++){
            multiple = multiple * i;
        }


        System.out.println(multiple);

    }
}