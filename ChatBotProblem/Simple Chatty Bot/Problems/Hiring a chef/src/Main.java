//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String first_name = scan.next();
        String age = scan.next();
        String education = scan.next();
        String exp = scan.next();
        String pref = scan.next();

        System.out.println("The form for " + first_name + " is completed. We will contact you if we need a chef that cooks " + pref + " dishes.");

    }
}