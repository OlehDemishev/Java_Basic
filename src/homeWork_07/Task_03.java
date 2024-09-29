package homeWork_07;

import java.util.Scanner;

/*
Task 3 (Повышенной сложности, опционально)
Программа предлагает пользователю ввести четырехзначное число.
Ввод осуществляется только в формате строки (String).
Если введенное значение не является четырехзначным числом, должно выводиться сообщение об ошибке, и программа завершает работу.
Проверить, является ли число "счастливым билетом". Для этого нужно сравнить сумму первых двух цифр с суммой последних двух цифр.
Примеры:

Число 1450 -> (1+4) = 5; (5+0) = 5; 5 равно 5 - число счастливое.
Число 1654 -> (1+6) = 7; (5+4) = 9; 7 не равно 9 - число НЕ является счастливым.
 */

public class Task_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ввести четырехзначное число");
        String digitSrt = scanner.nextLine();

        if (digitSrt.length() != 4) {
            System.out.println("сообщение об ошибке");
        } else {


            if (digitSrt.charAt(0) < 48 || digitSrt.charAt(0) > 57) {
                System.out.println("Все пропало. Символ не является цифрой");
                System.exit(0);
            }
            if (digitSrt.charAt(1) < 48 || digitSrt.charAt(1) > 57) {
                System.out.println("Все пропало. Символ не является цифрой");
                System.exit(0);
            }

            if (digitSrt.charAt(2) < 48 || digitSrt.charAt(2) > 57) {
                System.out.println("Все пропало. Символ не является цифрой");
                System.exit(0);
            }

            if (digitSrt.charAt(3) < 48 || digitSrt.charAt(3) > 57) {
                System.out.println("Все пропало. Символ не является цифрой");
                System.exit(0);
            }



            if (digitSrt.charAt(0) + digitSrt.charAt(1)  == digitSrt.charAt(2)  + digitSrt.charAt(3) ) {
                System.out.println("Число счастливое");
            } else {
                System.out.println("Билет не счастливый! Купи еще");
            }
        }

        // Option 2
        if (digitSrt.length() == 4) {
            //Код обработки строки
            int input = Integer.parseInt(digitSrt);
//            System.out.println("input: " + input);

            // 1234
            int digit0 = input % 10;
            input = input / 10;

            // 123
            int digit1 = input % 10;
            input = input / 10;

            // 12
            int digit2 = input % 10;
            int digit3 = input / 10;

            System.out.printf("Числа %d, %d, %d, %d\n", digit0, digit1, digit2, digit3);

            if (digit0 + digit1 == digit2 + digit3) {
                System.out.println("Вариант 2. Число счастливое");
            } else {
                System.out.println("Не счастливое");
            }




        } else {
            System.out.println("Длина строки не 4 символа");
        }
    }
}
