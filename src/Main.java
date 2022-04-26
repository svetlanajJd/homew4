public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int start = 1;
        while (start <= 10) {
            System.out.print(start + " ");
            start = start + 1;
        }
        System.out.print("\n");
        for (int i = 10; i <= 10 && i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
        System.out.println("Задание 2");
        int n = 4;
        for (; n <= 31; n = n + 7) {
            System.out.println("Сегодня пятница " + n + " число. Необходимо подготовить отчет");
        }
        System.out.println("Задание 3");
        int thisYear = 2022;
        int startYear = thisYear - 200;
        int endYear = thisYear + 100;
        for (int i = 0; i <= endYear; i = i + 79) {
            if (i > startYear) {
                System.out.println(i);
            }
        }
    }
}