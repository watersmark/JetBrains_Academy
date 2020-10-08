package converter;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // Преобразуем набор из одной системы счисления в другую
    public static long convertToDecimal(String digit, String radix) {

        // Обработка частного сучая
        if (radix.equals("1")) {
            String[] mass = digit.split("");

            long oneSum = 0;

            for (int i = 0; i < mass.length; i++) {
                oneSum += 1;
            }

            return oneSum;
        } else {  // Обработка общего случая
            long elem = Long.parseLong(digit, Integer.parseInt(radix));
            return elem;
        }
    }

    // Преобразуем в новую систему отсчёта
    public static String convertToNewSystem(long digit, String radix){
        String resStr = "";

        if(radix.equals("1")){

            for(int i =0; i < digit; i++){
                resStr += "1";

            }

            return resStr;
        }
        else {
            resStr = Long.toString(digit, Integer.parseInt(radix));
            return resStr;
        }

    }



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String radStart = scanner.nextLine();
        String digit = scanner.nextLine();
        String radNew = scanner.nextLine();

        // Преобразовали число в десятичный вид
        long decDigit = convertToDecimal(digit, radStart);

        // Получаем число в новой системе отсчёта
        String resStr = convertToNewSystem(decDigit, radNew);

        System.out.println(resStr);

    }

}
