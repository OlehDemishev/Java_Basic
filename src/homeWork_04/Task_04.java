package homeWork_04;

/*
Task 4 * (Опционально)
Напишите программу на Java, которая преобразует ваше имя, записанное маленькими буквами, в верхний регистр.

Для каждой буквы имени создайте отдельную переменную типа char,
инициализированную соответствующей буквой в нижнем регистре.

Затем преобразуйте каждую букву в верхний регистр,
используя только арифметические операции (без использования библиотечных функций), и выведите результат.
 */

public class Task_04 {
    public static void main(String[] args) {
        char ch1 = 'h';
        char ch2 = 'a';
        char ch3 = 'n';
        char ch4 = 'n';
        char ch5 = 'a';


        ch1 =  (char) (ch1 - 32); // 'H'
        System.out.println(ch1);
        ch2 -= 32; // ch2 = (char) (ch2 - 32);
        ch3 -= 32;
        ch4 -= 32;
        ch5 -= 32;

        System.out.println("" + ch1 + ch2 + ch3 + ch4 + ch5);

    }
}