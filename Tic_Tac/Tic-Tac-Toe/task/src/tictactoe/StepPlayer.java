package tictactoe;
import java.util.Scanner;

public class StepPlayer {

    // Считываем координаты пользователя
    public <T> void step(T[][] mass, String elem) {
        while (true) {

            try {
                Scanner scanner = new Scanner(System.in);
                int x = scanner.nextInt();
                int y = scanner.nextInt();

                // Проверяем диапазон значений
                if ((x > 3 || x < 1) || (y > 3 || y < 1)) {
                    throw new ErrorClass();
                }

                //Проверяем занятость ячейки
                if(coordCheck(mass, x, y, elem)){
                    break;
                }
                else{
                    System.out.println("This cell is occupied! Choose another one!");
                }

            } catch (ErrorClass w) {
                System.out.println("Coordinates should be from 1 to 3!");
            } catch (Exception e) {
                System.out.println("You should enter numbers!");
            }

        }
    }

    // Проверка координат
    public static <T > boolean coordCheck(T[][] mass, int x, int y, String elem) {

        if(mass[x - 1][y - 1] == "_"){
            mass[x - 1][y - 1] = (T) elem;
            return true;
        }

        return false;
    }


}
