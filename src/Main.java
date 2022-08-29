public class Main {
    public static void main(String[] args) {

        int ticket = 4010; // стоимость билета
        int mile = 20;     // количество рублей за одну бонусную милю

        int bonus = ticket / mile;  // бонусные мили

        System.out.println("Начислено " + bonus + " бонусных миль");

    }
}
