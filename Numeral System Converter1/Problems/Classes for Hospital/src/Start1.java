class Pet {

    private String birthDate;
    protected String name = "Topa";

    public String getBirthDate() {
        return birthDate;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

}

class Cat extends Pet {


}


public class Start1 {
    public static void main(String[] args) {

        Cat cat = new Cat();
        //cat.name = "Orq";
        System.out.println(cat.name);

    }
}
