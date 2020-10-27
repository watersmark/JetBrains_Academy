import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here



        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int minMax = 0;
        int seeds = A;

        for (int i = A; i <= B; i++) {
            Random random = new Random(i);
            int tempMax = 0;

            for (int j = 0; j < N; j++){
                int elem = random.nextInt(K);

                if(tempMax < elem ){
                    tempMax = elem;
                }
            }

            if(i == A){
                minMax = tempMax;
                continue;
            }

            if(minMax > tempMax){
                minMax= tempMax;
                seeds = i;
            }

        }

        System.out.println(seeds);
        System.out.println(minMax);

    }
}