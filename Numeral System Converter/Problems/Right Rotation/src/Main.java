import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> mass = new ArrayList<>();

        String[] list = scanner.nextLine().split(" ");
        int step = scanner.nextInt();

        int[] mass_new = new int[list.length];

        for (int i = 0; i < list.length; i++) {
            int nstep = (i + step) % list.length;
            mass_new[nstep] = Integer.parseInt(list[i]);
        }

        for(int elem : mass_new){
            System.out.print(elem + " ");
        }


    }
}