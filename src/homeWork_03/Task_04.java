package homeWork_03;

/*
Task 3 * (Опционально)
Найдите в Интернете данные по температуре в вашем городе за прошедшую неделю (или придумайте :) ).

Вычислите среднюю температуру за неделю и выведете ее на печать.
 */

public class Task_04 {

    public static void main(String[] args) {

        int t1 = 30;
        int t2 = 28;
        int t3 = 31;
        int t4 = 27;
        int t5 = 21;
        int t6 = 29;
        int t7 = 21;

        int days = 7;


        int sumTemp = t1 + t2 + t3 + t4 + t5 + t6 + t7;
        System.out.println("sumTemp: " + sumTemp);


        double averageTemp =  sumTemp / (double) days;


        System.out.println("averageTemp: " + averageTemp);


    }
}