package tictactoe;

public class UserStep {

    //Выводим массив с значениями "X" "O" "_"
    public static void print_new_mass(int[][] mass){

        System.out.println("---------");

        for (int i = 2; i >= 0; i--) {
            System.out.print("| ");

            for (int j = 0; j < 3; j++) {
                int elem = mass[j][i];

                if(elem == 1){
                    System.out.print("X ");
                    continue;
                }

                if(elem == 0){
                    System.out.print("O ");
                    continue;
                }

                System.out.print("_ ");
            }
            System.out.println("|");
        }

        System.out.println("---------");
    }



    // Печатаем новый массив
    public static void print_mass(int[][] mass) {

        for (int i = 2; i >= 0; i--) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mass[j][i] + " ");
            }
            System.out.println();

        }
    }


    // Преобразуем строку в новый массив матрицы по столбцам
    public static int[][] convert_mass(String[] mass) {
        int[][] temp_mass = new int[3][3];
        int k = 0;

        // Заполняем каждый массив по одному элементу
        // Массивы в виде стобцов матрицы

        for (int i = 2; i >= 0; i--) {
            for (int j = 0; j < 3; j++) {

                int temp_elem = -1;

                if (mass[k].equals("X")) {
                    temp_elem = 1;
                } else if (mass[k].equals("O")) {
                    temp_elem = 0;
                } else {
                    temp_elem = -1;
                }

                temp_mass[j][i] = temp_elem;

                k++;
            }
        }

        return temp_mass;
    }


    public static boolean users_step(int x,int y, int[][] mass) {

        if(mass[x - 1][y - 1] == -1){
            mass[x - 1][y - 1] = 1;

            return true;
        }
        return false;
    }
}
