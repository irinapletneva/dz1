public class Mine {
    public static void main(String[] args) {
        int price = 13676;
        int mile = 20;

        int bonus;
        if (price > 0) {
            bonus = price / mile;
        } else {
            bonus = 0;
        }
        System.out.println("Количество бонусных миль " + bonus);
    }
}

