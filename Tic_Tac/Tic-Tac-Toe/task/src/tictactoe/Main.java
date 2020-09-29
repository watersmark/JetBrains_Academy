package tictactoe;

import java.awt.desktop.SystemSleepEvent;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

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

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] mass = scanner.next().split("");


        draw(mass);

        if (Statement.countXO(mass)) {
            System.out.println(Statement.error_position(mass));
        }
        else{
            System.out.println("Impossible");
        }


    }
}
