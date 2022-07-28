public class Main {
    public static void main(String[] args) {

        int sell = 2000;      // Стоимость билета
        int bonus = 20;        // Количество рублей для одной бонусной милли

        int miles = sell / bonus;     // Количество начисляемых бонусных милль

        System.out.println((sell) + " - Стоимость билета");
        System.out.println((bonus) + " - Количество рублей для одной бонусной милли");
        System.out.println((sell) + " / " + (bonus) + " = " + (miles) + " - Количество начисляемых бонусных милль");


    }
}
