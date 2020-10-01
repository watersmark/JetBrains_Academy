package machine;

import javax.management.MBeanRegistration;
import java.io.IOException;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.zip.CheckedOutputStream;

class CoffeParam {

    private CoffeParam() {
    }

    public static int water = 400;
    public static int milk = 540;
    public static int beans = 120;
    public static int money = 550;
    public static int cup = 9;


    public static void coffeMachineNow() {

        System.out.println("The coffee machine has:");
        System.out.println(String.format("%d of water", CoffeParam.water));
        System.out.println(String.format("%d of milk", CoffeParam.milk));
        System.out.println(String.format("%d of coffee beans", CoffeParam.beans));
        System.out.println(String.format("%d of disposable cups", CoffeParam.cup));
        System.out.println(String.format("%d of money", CoffeParam.money));
    }

    public static void coffeMachineFill(Scanner scanner) {

        System.out.println("Write how many ml of water do you want to add: ");
        water += scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add: ");
        milk += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        beans += scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        cup += scanner.nextInt();
    }

    public static void getMoney(){
        System.out.println(String.format("I gave you %d", money));
        money = 0;
    }

}


public class CoffeeMachine {

    public static boolean actionMachine() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write action (buy, fill, take, remaining, exit): ");

        BuyCoffe coffe = new BuyCoffe();
        String action = scanner.next();

        switch (action) {

            case "buy":
                coffe.buyCoffe();
                break;

            case "fill":
                CoffeParam.coffeMachineFill(scanner);
                break;

            case "take":
                CoffeParam.getMoney();
                break;

            case "remaining":
                CoffeParam.coffeMachineNow();
                break;

            case "exit":
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            //Выводим начальное состояние кофемашины
            //CoffeParam.coffeMachineNow();

            //Выбираем следующее действие
            if(!actionMachine()) break;


            // после операции выводим состояние кофемашины
            //CoffeParam.coffeMachineNow();
        }


    }
}
