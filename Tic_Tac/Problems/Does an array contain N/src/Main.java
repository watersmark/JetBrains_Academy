import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] mass = new int[count];

        for (int i = 0; i < count; i++) {
            mass[i] = scanner.nextInt();
        }

        //System.out.println(Arrays.toString(mass));
        int elems = scanner.nextInt();
        boolean a = true;

        for(int elem : mass){
            if(elems == elem){
                System.out.println(true);
                a = false;
                break;
            }
        }
        if(a)  System.out.println(false);

    }
}