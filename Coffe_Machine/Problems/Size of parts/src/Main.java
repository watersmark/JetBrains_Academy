import java.util.Scanner;

interface workable<T extends Integer>{

    void countStr();
}


class Main {
    public static void runs(workable<?> work){

    }


    public static void main(String[] args) {
        workable work = () -> {
            Scanner scanner = new Scanner(System.in);
            int all_count = scanner.nextInt();

            int one = 0;
            int zero = 0;
            int minus = 0;

            for(int i  = 0; i < all_count; i++){
                int elem = scanner.nextInt();
                if(elem > 0) one++;
                if(elem < 0) minus++;
                if(elem == 0) zero++;
            }

            System.out.println(String.format("%d %d %d", zero, one, minus));

        };

        work.countStr();
    }
}