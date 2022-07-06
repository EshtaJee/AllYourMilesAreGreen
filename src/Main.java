public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 876543;
        int miles = service.calculate(price);

        System.out.println("Добро пожаловать в авиакомпанию \"Верхом на Метле\".");

        if (miles > 0) {
            System.out.println();
            System.out.println("Ого го! Стоимость Вашего билета составляет " + (price) + " рублей. \nХм... За это мы начислим Вам, скажем... " + (miles) + " бонусных миль. \nКак Вам такое, Илон Маск?");
            System.out.println();
            System.out.println("Спасибо. Наши метлы самые удобные!");
        } else {
            System.out.println();
            System.out.println("В смысле цена билета " + (price) + " рублей?! \nЧто ж... Сделать бы Вам " + (miles) + " бонусных миль, чтоб все было честно! \nНо мы ребята добрые, поэтому просто ничего Вам не начислим...");
            System.out.println();
            System.out.println("Спасибо. Наши метлы самые удобные! Но не для Вас!");
        }
    }
}