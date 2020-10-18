public class mains {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        builder.append("This is horosho");
        System.out.println(builder);

        //builder.reverse();
        //System.out.println(builder);

        builder.replace(0, 4, "Bad");
        System.out.println(builder);

        builder.delete(0, 1);
        System.out.println(builder);

        builder.insert(6, "TT");
        System.out.println(builder);

        builder.deleteCharAt(6);
        System.out.println(builder);

        builder.insert(0, 'R');
        System.out.println(builder);

    }
}
