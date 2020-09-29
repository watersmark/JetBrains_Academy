package tictactoe;

import java.awt.desktop.SystemSleepEvent;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    // Выводим поле которое поступило на вход
    public static void draw(String[] mass) {
        int k = 0;
        System.out.println("---------");

        for (int i = 0; i < 3; i++) {
            System.out.print("| ");

            for (int j = 0; j < 3; j++) {
                System.out.print(mass[k] + " ");
                k++;
            }
            System.out.println("|");
        }

        System.out.println("---------");
    }

    // Точка входа программы
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] mass = scanner.next().split("");

        // Выводим массив по полученной строке
        draw(mass);

        // Преобразуем массив в новую форму
        int[][] ret_mass = UserStep.convert_mass(mass);
        //UserStep.print_mass(ret_mass);

        while(true) {

            // Проверим что введено пользователем
            try {
                int x = scanner.nextInt();
                int y = scanner.nextInt();

                System.out.println("Enter the coordinates: " + x + " " + y);

                if(UserStep.users_step(x, y, ret_mass)) break;

                System.out.println("This cell is occupied! Choose another one!");

            }
            catch (Exception e){
                System.out.println("You should enter numbers!");
            }
        }

        UserStep.print_new_mass(ret_mass);

        /* Выводит значение на текущий игровой момент
        if (Statement.countXO(mass)) {
            System.out.println(Statement.error_position(mass));
        }
        else{
            System.out.println("Impossible");
        }
        */

    }
}
