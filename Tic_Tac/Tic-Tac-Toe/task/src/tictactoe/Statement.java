package tictactoe;

import java.util.ArrayList;
import java.util.Arrays;

public class Statement {

    public static void temp_print(ArrayList<int[]> elem) {

        for (int[] ts : elem) {
            for (int i : ts) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }


    // Print mass function String[][]
    public static void temp_draw(String[][] mass) {
        for (String[] el : mass) {
            for (String elem : el) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

    // Преобразуем String[] mass в String[][]
    public static String[][] convert_mass(String[] mass) {

        String[][] mult_mass = new String[3][3];
        int j = 0;

        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                mult_mass[i][k] = mass[j];
                j++;
            }
        }

        return mult_mass;
    }


    // Проверяем общее числ элементов и кол-во X и O
    public static boolean countXO(String[] mass) {

        int count_X = 0;
        int count_O = 0;
        int another = 0;

        for (String elem : mass) {
            if (elem.equals("X")) {
                count_X++;
                continue;
            }
            if (elem.equals("O")) {
                count_O++;
                continue;
            }

            another++;
        }

        return (count_O == count_X || Math.abs(count_O - count_X) < 2)
                && (count_O + count_X + another) == 9;
    }

    // Проверяем условия выйгрыша и проигрыша
    public static String error_position(String[] mass) {

        // Конвертируем в массив строк String[][]
        String[][] new_mass = convert_mass(mass);

        ArrayList<int[]> mass_x = new ArrayList<>();
        ArrayList<int[]> mass_y = new ArrayList<>();

        String elem_f = null;
        int free_count = 0;

        //Обрабатывем массивы
        Seek_elements.for_mass(mass_x, mass_y, new_mass);

        // Ищем кол-во пустых клеток
        for(int i =0; i < mass.length; i++){
            if(!mass[i].equals("X") && !mass[i].equals("O")){
                free_count++;
            }
        }

        //temp_print(mass_x);
        //temp_print(mass_y);


        // Ищем повторы
        if(mass_x.size() != 0 && mass_y.size() != 0){
            return "Impossible";
        }
        if(mass_x.size() != 0 && mass_y.size() == 0){
            return  "X wins";
        }
        if(mass_x.size() == 0 && mass_y.size() != 0){
            return "O wins";
        }
        if(mass_x.size() == 0 && mass_y.size() == 0 && free_count != 0){
            return "Game not finished";
        }

        return "Draw";

    }
}
