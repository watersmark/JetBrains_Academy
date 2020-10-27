import java.util.Random;


public class Start {
    public static void main(String[] args) {

        Random rand = new Random();

        // multiple

        for (int i = 0; i < 100; i++) {

            System.out.println((int) (rand.nextDouble() * 100));

        }

    }
}
