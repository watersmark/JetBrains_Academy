import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String area = scanner.nextLine();

        switch (area) {

            case "triangle":
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                double p1 = (a + b + c) / 2;
                double s = Math.sqrt(p1 * (p1 - a) * (p1 - b) * (p1 - c));
                System.out.println(s);
                break;

            case "rectangle":

                double a1 = scanner.nextDouble();
                double b1 = scanner.nextDouble();
                System.out.println(a1 * b1);
                break;

            case "circle":
                double a2 = scanner.nextDouble();
                System.out.println(3.14 * Math.pow(a2, 2));
                break;
        }


    }
}