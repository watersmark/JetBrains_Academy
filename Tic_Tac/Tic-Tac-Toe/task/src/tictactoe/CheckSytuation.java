package tictactoe;
import java.util.ArrayList;

public class CheckSytuation {

    public static <T> boolean check(T[][] new_mass) {

        ArrayList<int[]> mass_x = new ArrayList<>();
        ArrayList<int[]> mass_y = new ArrayList<>();

        // Ищем по строкам
        for (int i = 0; i < 3; i++) {
            if (new_mass[i][0].equals(new_mass[i][1])
                    && (new_mass[i][1].equals(new_mass[i][2]))
            && !new_mass[i][0].equals("_")) {

                // Добавляемчисла победителей в массив
                if (new_mass[i][0].equals("X")) {
                    mass_x.add(new int[]{(i * 3), (i * 3) + 1, (i * 3) + 2});
                } else {
                    mass_y.add(new int[]{(i * 3), (i * 3) + 1, (i * 3) + 2});
                }

            }
        }

        //ищем по столбцам
        for (int i = 0; i < 3; i++) {
            if (new_mass[0][i].equals(new_mass[1][i])
                    && new_mass[1][i].equals(new_mass[2][i])
                    && !new_mass[0][i].equals("_")) {

                if (new_mass[0][i].equals("X")) {
                    mass_x.add(new int[]{i, i + 3, i + 6});
                } else {
                    mass_y.add(new int[]{i, i + 3, i + 6});
                }

            }

        }

        // Ищем по диагонали главной
        if (new_mass[0][0].equals(new_mass[1][1])
                && new_mass[1][1].equals(new_mass[2][2])
        && !new_mass[0][0].equals("_")) {

            if (new_mass[0][0].equals("X")) {
                mass_x.add(new int[]{0, 4, 8});
            } else {
                mass_y.add(new int[]{0, 4, 8});
            }

        }

        //Побочная диагональ
        if (new_mass[0][2].equals(new_mass[1][1])
                && new_mass[1][1].equals(new_mass[2][0])
        && !new_mass[0][2].equals("_")) {

            if (new_mass[0][2].equals("X")) {
                mass_x.add(new int[]{2, 4, 6});
            } else {
                mass_y.add(new int[]{0, 4, 6});
            }

        }


        // Ищем кол-во пустых клеток
        int free_count = 0;
        for(int i = 0; i < new_mass.length; i++){
            if(!new_mass[i].equals("X") && !new_mass[i].equals("O")){
                free_count++;
            }
        }


        // Выводим информацию о ситуации на поле
        if (mass_x.size() != 0 && mass_y.size() != 0) {
            //System.out.println("Impossible");
            return true;
        }
        if (mass_x.size() != 0 && mass_y.size() == 0) {
            //Draw.draw_area(new_mass);
            System.out.println("X wins");
            return true;
        }
        if (mass_x.size() == 0 && mass_y.size() != 0) {
            //Draw.draw_area(new_mass);
            System.out.println("O wins");
            return true;
        }
        if (mass_x.size() == 0 && mass_y.size() == 0 && free_count != 0) {
            //System.out.println("Game not finished");
            return false;
        }

        //Draw.draw_area(new_mass);
        System.out.println("Draw");
        return true;


    }
}
