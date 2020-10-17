import java.util.Scanner;

class ConcatenateStringsProblem {

    public static String concatenateStringsWithoutDigits(String[] strings) {

        StringBuilder stringBuilderlder = new StringBuilder();

        for(String elem : strings){
            for(String el : elem.split("")){
                if(((int) el.toCharArray()[0] >= 48 && (int) el.toCharArray()[0] <= 57)
                        || ((int) el.toCharArray()[0] == 32)){

                }
                else{
                    stringBuilderlder.append(el);
                }
            }
        }

        return stringBuilderlder.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("\\s+");
        String result = concatenateStringsWithoutDigits(strings);
        System.out.println(result);
    }
}