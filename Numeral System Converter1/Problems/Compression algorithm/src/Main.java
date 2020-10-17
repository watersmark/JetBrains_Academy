import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] mass = scanner.nextLine().split("");

        String elNow = null;
        String resStr = "";

        int count = 0;
        for (String el : mass) {

            if(elNow == null){
                elNow = el;
                resStr += el;
                count = 1;
                continue;
            }

            if(!elNow.equals(el)){
                resStr += count;
                resStr += el;
                count = 1;
                elNow = el;
                continue;
            }

            count++;

        }

        resStr += count;
        System.out.println(resStr);

    }
}