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

        //System.out.println(mass[1]);
        //System.out.println(Arrays.toString(mass));
        draw(mass);


    }
}
