import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String elem = scanner.nextLine();

        if(elem.length() != 0) {
            if (elem.charAt(0) == 'J' || elem.charAt(0) == 'j') {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
        else{
            System.out.println(false);
        }

    }
}