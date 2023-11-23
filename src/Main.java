public class Main {
    public static void main(String[] args) {
        int accountBalance = 500;
        int refill = 1091;
        int bonus;

        if (refill > 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }

        System.out.println("Итоговый счет:" + (accountBalance + refill + bonus));
        System.out.println("Количество начисленных бонусов:" + bonus);
    }
}