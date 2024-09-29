package homeWork_08;


/*
Task 1
Найдите произведение всех чисел от 1 до 15 включительно.

Результат выведите на экран
 */

public class Task_01 {
    public static void main(String[] args) {


        long mult = 1;

        int i = 1;
        while (i <= 15) {
            mult *= i++;
        }

        System.out.println("Произведение чисел: " + mult);


    }
}
