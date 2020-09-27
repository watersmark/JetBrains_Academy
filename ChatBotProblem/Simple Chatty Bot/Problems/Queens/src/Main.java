import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        boolean bool = false;

        if(x1 == x2 || y1 == y2){
            System.out.println("YES");
            bool = true;
        }

        if(!bool){

            int step_sum = Math.abs(x1 - x2);

            if((y1 + step_sum == y2) || (y1 - step_sum == y2)){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }



    }
}