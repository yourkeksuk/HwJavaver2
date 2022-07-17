public class Main {
    public static void main(String[] args) {

        int s = 2000;      // Стоимость билета
        int r = 20;        // Количество рублей для одной бонусной милли

        int b = s / r;     // Количество начисляемых бонусных милль

        System.out.println((s) + " - Стоимость билета");
        System.out.println((r) + " - Количество рублей для одной бонусной милли");
        System.out.println((s) + " / " + (r) + " = " + (b) + " - Количество начисляемых бонусных милль");


    }
}
