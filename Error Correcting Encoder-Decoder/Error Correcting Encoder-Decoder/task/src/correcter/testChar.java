package correcter;

public class testChar {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        builder.append("This is good");
        String elem = "42 34 2";

        //System.out.println(elem.toCharArray()[0]);

        for(char el : elem.toCharArray()){
            System.out.print(el + ":");
            System.out.println((int) el);
        }

    }
}
