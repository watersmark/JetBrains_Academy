import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void print_mass(String[][] mass_th) {

        for (String[] el : mass_th) {
            for (String elems : el) {
                if (elems == null) {
                    System.out.print(". ");
                    continue;
                }
                System.out.print(elems + " ");
            }
            System.out.println();
        }
    }

    public static String[][] add_mass(String[][] mass_th, int elem, int average_elem) {

        for (int i = 0; i < average_elem; i++) {

            if (i == average_elem - 1) {
                for (int k = 0; k < elem; k++) {
                    mass_th[i][k] = "*";
                }

                continue;
            }
            mass_th[i][elem - 1 - i] = "*";
            mass_th[i][i] = "*";
            mass_th[i][average_elem - 1] = "*";
        }

        for(int i = 0; i < average_elem - 1; i++){
            mass_th[average_elem + i] = mass_th[average_elem - 2 - i];
        }

        return mass_th;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int elem = scanner.nextInt();
        String[][] mass_th = new String[elem][elem];

        int average_elem = (int) (elem / 2) + 1;

        String[][] mass = add_mass(mass_th, elem, average_elem);
        print_mass(mass);

    }
}



/*

 */