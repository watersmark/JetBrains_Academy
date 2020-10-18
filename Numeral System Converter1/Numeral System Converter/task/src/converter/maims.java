package converter;

public class maims {
    public static void main(String[] args) {

        StringBuilder str1 = new StringBuilder("1");
        StringBuilder str2 = new StringBuilder("1");

        System.out.println(str1.toString().equals(str2.toString()));
        System.out.println(str1 == str2);
    }
}
