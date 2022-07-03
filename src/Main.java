public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в авиакомпанию \"Верхом на Метле\". Уа-ха-ха!!");

      int x = 5000; // цена билета
      int y = 20; // стоит одна миля

        if (x > 0) {
            System.out.println();
            System.out.println("Ого го! Стоимость Вашего билета составляет " + (x) + " рублей");
            System.out.println("Хм... За это мы начислим Вам, скажем... " + (x / y) + " бонусных миль");
            System.out.println("Как Вам такое, Илон Маск?");
            System.out.println();
            System.out.println("Спасибо. Наши метлы самые удобные!");

        } else {
            System.out.println();
            System.out.println("В смысле цена билета " + (x) + " рублей?");
            System.out.println("Что ж... Сделать бы Вам " + (x / y) + " бонусных миль, чтоб все было честно! \nНо мы ребята добрые, поэтому просто ничего Вам не начислим...");
            System.out.println("Как Вам такое, Илон Маск?");
            System.out.println();
            System.out.println("Спасибо. Наши метлы самые удобные! Но не для Вас!");
        }

    }
}