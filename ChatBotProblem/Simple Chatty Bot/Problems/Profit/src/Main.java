import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        int money = scanner.nextInt();
        int Per = scanner.nextInt();
        int K = scanner.nextInt();

        double mon = money;

        int years = 0;

        while (true){

            if(mon >= K){
                break;
            }

            mon += (double) (mon / 100.0) * Per;
            years++;

        }

        System.out.println(years);
    }
}