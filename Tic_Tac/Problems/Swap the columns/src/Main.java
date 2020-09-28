import java.util.Scanner;

class Main {

    public static void print_mass(int[][] mass) {

        for (int i = 0; i < mass[0].length; i++) {
            for (int j = 0; j < mass.length; j++) {
                System.out.print(mass[j][i] + " ");
            }

            System.out.println();
        }

    }


    public static int[][] mass_rec(int[][] mass, int first, int second) {
        int[] temp = mass[second];

        mass[second] = mass[first];
        mass[first] = temp;

        return mass;
    }

    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();


        int[][] mass = new int[b][a];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                mass[j][i] = scanner.nextInt();
            }
        }

        // меняем столбцы местами
        int first_col = scanner.nextInt();
        int second_col = scanner.nextInt();

        int[][] rec_mass = mass_rec(mass, first_col, second_col);

        // Выводим на печать
        print_mass(mass);

    }
}