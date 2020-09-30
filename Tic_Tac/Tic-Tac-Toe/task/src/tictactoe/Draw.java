package tictactoe;
public class Draw {

    public static <T> void draw_area(T[][] mass) {
        System.out.println("---------");

        for (int i = 2; i >= 0; i--) {
            System.out.print("| ");

            for (int j = 0; j < 3; j++) {

                System.out.print(mass[j][i] + " ");
            }

            System.out.println("|");
        }

        System.out.println("---------");
    }
}
