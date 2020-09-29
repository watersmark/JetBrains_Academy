package tictactoe;

import java.util.ArrayList;

public class Seek_elements {
    public static void for_mass(ArrayList mass_x, ArrayList mass_y,
                                String[][] new_mass) {
        // Ищем по строкам
        for (int i = 0; i < 3; i++) {
            if (new_mass[i][0].equals(new_mass[i][1])
                    && (new_mass[i][1].equals(new_mass[i][2]))) {

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
                    && new_mass[1][i].equals(new_mass[2][i])) {

                if (new_mass[0][i].equals("X")) {
                    mass_x.add(new int[]{i, i + 3, i + 6});
                } else {
                    mass_y.add(new int[]{i, i + 3, i + 6});
                }

            }

        }

        // Ищем по диагонали главной
        if (new_mass[0][0].equals(new_mass[1][1])
                && new_mass[1][1].equals(new_mass[2][2])) {

            if (new_mass[0][0].equals("X")) {
                mass_x.add(new int[]{0, 4, 8});
            } else {
                mass_y.add(new int[]{0, 4, 8});
            }

        }

        //Побочная диагональ
        if (new_mass[0][2].equals(new_mass[1][1])
                && new_mass[1][1].equals(new_mass[2][0])) {

            if (new_mass[0][2].equals("X")) {
                mass_x.add(new int[]{2, 4, 6});
            } else {
                mass_y.add(new int[]{0, 4, 6});
            }

        }
    }

}
