// declare your enum here

enum DayOfWeek{
    SUNDAY("Sunday"),
    MONDAY("Monday"),
    TUESDAY("Th"),
    WEDNESDAY("Wed"),
    THURSDAY("Thursd"),
    FRIDAY("Friday"),
    SATURDAY("Saturday");

    private String days;

    DayOfWeek(String day){
        this.days = day;
    }

    public String getName(){
        return this.days;
    }
}

public class Main {
    public static void main(String[] args) {
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.print(day.name() + " ");
            System.out.println(day.getName());
        }
    }
}