package converter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static Map<Character, Integer> characterIntegerMap = new HashMap<>();
    public static void main(String[] args) {

        try {

            Scanner scanner = new Scanner(System.in);
            int sourceNumSystem = scanner.nextInt();
            scanner.nextLine();
            String[] sourceNumber = scanner.nextLine().split("\\.");
            int newNumSystem = scanner.nextInt();

            if(newNumSystem <= 0 || sourceNumSystem <= 0 || newNumSystem > 36){
                throw  new Exception();
            }

            String decimal = sourceNumber[0];
            String fractional = sourceNumber.length > 1 && newNumSystem != 1 ? sourceNumber[1] : "";
            // get number in base 10 system
            int convertedDecimalNumber = convertNumber(decimal, sourceNumSystem);
            double convertedFractionalNumber = fractional.equals("") || fractional.equals("0") ? 0 : fractionalToDecimal(fractional, sourceNumSystem);

            String convertedNumberString;
            if (convertedFractionalNumber > 0) {
                convertedNumberString = convertNumberString(newNumSystem, convertedDecimalNumber) + "." +
                        fractionalToAnySystem(convertedFractionalNumber, newNumSystem);
            } else {
                convertedNumberString = convertNumberString(newNumSystem, convertedDecimalNumber);
            }


            System.out.println(convertedNumberString);
        }
        catch (Exception e){
            System.out.println("error");
            return;
        }
    }

    public static int convertNumber(String sourceNumber, int sourceNumSystem) {
        int convertedNumber = 0;
        if (sourceNumSystem != 10 && sourceNumSystem != 1) {
            convertedNumber = Integer.parseInt(sourceNumber, sourceNumSystem);
        }
        if (sourceNumSystem == 10) {
            convertedNumber = Integer.parseInt(sourceNumber);
        }
        if (sourceNumSystem == 1) {
            convertedNumber = sourceNumber.length();
        }
        return convertedNumber;
    }

    public static String convertNumberString(int newNumSystem, int convertedNumber) {
        String convertedNumberString = "";
        if (newNumSystem == 1) {
            for (int i = 0; i < convertedNumber; i++) {
                convertedNumberString = convertedNumberString.concat("1");
            }
        } else {
            convertedNumberString = Integer.toString(convertedNumber, newNumSystem);
        }
        return convertedNumberString;
    }

    public static double fractionalToDecimal(String fractional, double sourceNumSystem) {
        initializeHashMap();
        double number = 0;
        int i = 1;
        for (char character : fractional.toCharArray()) {
            number += (double) characterIntegerMap.get(character) / Math.pow(sourceNumSystem, i);
            i++;
        }
        return number;
    }

    public static String fractionalToAnySystem(double fractional, int newNumSystem) {
        StringBuilder newBuilder = new StringBuilder();
        double number = fractional;
        for (int i = 0; i < 5; i++) {
            number = number * newNumSystem;
            String[] fraction = Double.toString(number).split("\\.");
            for (Map.Entry<Character, Integer> entry : characterIntegerMap.entrySet()) {
                if (entry.getValue() == Integer.parseInt(fraction[0])) {
                    newBuilder.append(entry.getKey());
                }
            }
            number = number - Integer.parseInt(fraction[0]);
        }
        return newBuilder.toString();
    }

    public static void initializeHashMap() {
        characterIntegerMap.put('0', 0);
        characterIntegerMap.put('1', 1);
        characterIntegerMap.put('2', 2);
        characterIntegerMap.put('3', 3);
        characterIntegerMap.put('4', 4);
        characterIntegerMap.put('5', 5);
        characterIntegerMap.put('6', 6);
        characterIntegerMap.put('7', 7);
        characterIntegerMap.put('8', 8);
        characterIntegerMap.put('9', 9);
        characterIntegerMap.put('a', 10);
        characterIntegerMap.put('b', 11);
        characterIntegerMap.put('c', 12);
        characterIntegerMap.put('d', 13);
        characterIntegerMap.put('e', 14);
        characterIntegerMap.put('f', 15);
        characterIntegerMap.put('g', 16);
        characterIntegerMap.put('h', 17);
        characterIntegerMap.put('i', 18);
        characterIntegerMap.put('j', 19);
        characterIntegerMap.put('k', 20);
        characterIntegerMap.put('l', 21);
        characterIntegerMap.put('m', 22);
        characterIntegerMap.put('n', 23);
        characterIntegerMap.put('o', 24);
        characterIntegerMap.put('p', 25);
        characterIntegerMap.put('q', 26);
        characterIntegerMap.put('r', 27);
        characterIntegerMap.put('s', 28);
        characterIntegerMap.put('t', 29);
        characterIntegerMap.put('u', 30);
        characterIntegerMap.put('v', 31);
        characterIntegerMap.put('w', 32);
        characterIntegerMap.put('x', 33);
        characterIntegerMap.put('y', 34);
        characterIntegerMap.put('z', 35);
    }






}