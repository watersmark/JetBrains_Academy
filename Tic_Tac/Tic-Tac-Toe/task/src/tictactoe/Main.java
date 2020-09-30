package tictactoe;

import java.awt.desktop.SystemSleepEvent;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String el = "_";
        String[][] mass = new String[][]{{el, el, el} , {el, el, el}, {el, el, el}};
        StepPlayer play = new StepPlayer();
        String step_pl = "X";

        int el_now = 1;
        while(true){

            Draw.draw_area(mass);

            //Считываес шаг игрока
            if(el_now % 2 != 0){
                step_pl = "X";
            }
            else{
                step_pl = "O";
            }

            // Игрок делает шаг
            play.step(mass, step_pl);

            // проверяем ситуацию на поле
            if(CheckSytuation.check(mass)){
                Draw.draw_area(mass);
                break;
            }

            el_now++;

        }

    }
}
