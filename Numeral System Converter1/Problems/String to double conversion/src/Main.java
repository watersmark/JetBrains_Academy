class Converter {

    /**
     * It returns a double value or 0 if an exception occurred
     */
    public static double convertStringToDouble(String input) {


        try {
            return Double.parseDouble(input);
        }
        catch (Exception e){
            return 0;
        }
    }

    public static void main(String[] args) {

        try {

            throw new NumberFormatException();
        }
        catch (NumberFormatException e){
            System.out.println("D");
        }
        catch (Exception r){
            System.out.println("R");
        }

    }
}