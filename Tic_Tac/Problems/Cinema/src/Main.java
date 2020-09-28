import java.util.Scanner;

class Main {

    public static void print(int[][] mass) {

        for (int[] el : mass) {

            for (int elem : el) {
                System.out.print(elem + " ");
            }

            System.out.println();
        }
    }

    public static int find_sit(int[][] mass, int count) {
        int k = 0;

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if(mass[i][j] == 0) k++;

                if(k == count){
                    return i + 1;
                }

                if(mass[i][j] == 1) k = 0;
            }

            k = 0;
        }

        return 0;
    }


    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int row = scanner.nextInt();
        int col = scanner.nextInt();

        int[][] mass = new int[row][col];

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {
                mass[i][j] = scanner.nextInt();

            }

        }

        int sit_count = scanner.nextInt();

        //print(mass);

        System.out.println(find_sit(mass, sit_count));


    }
}