import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String str = "Java good";

        System.out.println(str.substring(0, 2));
        //char a = str.charAt(1);
        String a = "aaaabbbaaa";
        a = a.replaceAll("a", "b");
        System.out.println(a);
    }
}