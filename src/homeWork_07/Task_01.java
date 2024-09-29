package homeWork_07;

import java.util.Scanner;


/*
Task 1
Необходимо написать программу, которая предлагает пользователю ввести число на выбор: 1, 2 или 3.

Программа должна сказать, какое число ввёл пользователь: Один, Два, или Три (текстом)


 */

public class Task_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("введите число на выбор: 1, 2 или 3");
        int input = scanner.nextInt();
        scanner.nextLine();

        switch (input) {
            case 1:
                System.out.println("Вы ввели один");
                break;
            case 2:
                System.out.println("Вы ввели два");
                break;
            case 3:
            case 4:
                System.out.println("Вы ввели три или 4");
                break;
            default:
                System.out.println("Я таких чисел не знаю");
        }



    }
}
