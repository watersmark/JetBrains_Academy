package machine;

import java.util.Scanner;

public class BuyCoffe {

    // Готовим коффе
    public  void cookCoffe(int water, int milk, int beans, int cost){

            CoffeParam.water -= water;
            CoffeParam.milk -= milk;
            CoffeParam.beans -= beans;
            CoffeParam.money += cost;
            CoffeParam.cup -= 1;
    }

    // Выбираем напиток для приготовления
    public void buyCoffe(Scanner scanner){

        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
        int digit = scanner.nextInt();


        switch (digit){
            case 1:
                cookCoffe(250, 0, 16, 4);
                break;
            case 2:
                cookCoffe(350, 75, 20,7);
                break;
            case 3:
                cookCoffe(200,100,12,6);
                break;
        }
    }

}
