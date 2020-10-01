package machine;

import java.util.Scanner;

public class BuyCoffe {

    // Проверяем кол-во ресурсов ля приготоления
    public boolean checkRes(int water, int milk, int beans) {

        if (CoffeParam.water < water) {
            System.out.println("Sorry, not enough water!");
            return false;
        }

        if (CoffeParam.milk < milk) {
            System.out.println("Sorry, not enough milk!");
            return false;
        }

        if (CoffeParam.beans < beans) {
            System.out.println("Sorry, not enough coffee beans");
            return false;
        }

        if (CoffeParam.cup < 1) {
            System.out.println("Sorry, not enough disposable cups");
            return false;
        }

        System.out.println("I have enough resources, making you a coffee!");
        return true;
    }


    // Готовим коффе
    public void cookCoffe(int water, int milk, int beans, int cost) {

        if (checkRes(water, milk, beans)) {
            CoffeParam.water -= water;
            CoffeParam.milk -= milk;
            CoffeParam.beans -= beans;
            CoffeParam.money += cost;
            CoffeParam.cup -= 1;
        }
    }

    // Выбираем напиток для приготовления
    public void buyCoffe() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What do you want to buy? 1 - espresso, " +
                "2 - latte, " +
                "3 - cappuccino, " +
                "back - to main menu: ");


        String digit = scanner.nextLine();

        switch (digit) {
            case "1":
                cookCoffe(250, 0, 16, 4);
                break;
            case "2":
                cookCoffe(350, 75, 20, 7);
                break;
            case "3":
                cookCoffe(200, 100, 12, 6);
                break;
            case "back":
                break;
        }
    }
}
