import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        char a = '^';
        System.out.println((int) a);

        String hex = Integer.toHexString((int) a);
        System.out.println(hex);
        String octopus = "456";


        System.out.println(Integer.parseInt(hex, 16));
        System.out.println(Integer.parseInt(octopus, 8));


    }
}