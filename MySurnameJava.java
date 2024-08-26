import java.util.Scanner;

public class MySurnameJava {
    public static void main(String[] args) {
        // Задание 1
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое целое число (a): ");
        int a = scanner.nextInt();
        System.out.print("Введите второе целое число (b): ");
        int b = scanner.nextInt();

        // Сравнение чисел
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // Операции
        System.out.println("Сложение: " + (a + b));
        System.out.println("Вычитание: " + (a - b));
        System.out.println("Умножение: " + (a * b));
        if (b != 0) {
            System.out.println("Деление: " + (a / (double) b));
        } else {
            System.out.println("Ошибка: деление на ноль");
        }
        
        // Задание 2
        System.out.print("Введите первую строку (a): ");
        String strA = scanner.next();
        System.out.print("Введите вторую строку (b): ");
        String strB = scanner.next();

        // Сравнение строк
        if (strA.equals(strB)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
        
        // Задание 3
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Чётные числа из массива:");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }

        scanner.close();
    }
}
