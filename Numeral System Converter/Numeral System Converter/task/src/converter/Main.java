package converter;

import java.util.Scanner;

public class Main {
    public static String prefix(int radix){
        if(radix == 16){
            return "0x";
        }
        if(radix == 2){
            return "0b";
        }
         return "0";

    }

    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       long dec = scanner.nextLong();
       int radix = scanner.nextInt();
       String prefix = prefix(radix);

        String digit = Long.toString(dec, radix);
        System.out.println(String.format("%s%s", prefix, digit ));

    }
}
