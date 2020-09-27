import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        if(str.contains("burg")) {
            str = str.substring(str.length() - 4);
            //System.out.println(str);


            if (str.equals("burg")) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

        }
        else {
            System.out.println("false");
        }


    }
}