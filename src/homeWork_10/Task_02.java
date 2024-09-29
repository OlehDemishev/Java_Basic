package homeWork_10;

import java.util.Arrays;


/*
Task 2
Написать метод, принимающий на вход массив строк.
Метод должен вернуть массив, состоящий из самой короткой и самой длинной строки изначального массива.
 */

public class Task_02 {
    public static void main(String[] args) {



        String[] strings = {"One", "Java", "Python", "GO",  "JS", "hello"};
        String[] result = getArrayWithSmallestString(strings);
        System.out.println(Arrays.toString(result));

        System.out.println(" \n ========== testArray = null / length = 0 ==================");
        strings = null;
        String[] res = getArrayWithSmallestString(strings);

        System.out.println(" \n ========== null in array ==================");

        strings = new String[]{"One1", "Java", "Python", null, "JS", "hello"};
        res = getArrayWithSmallestString(strings);
        System.out.println();

        System.out.println(Arrays.toString(res));

        System.out.println(" \n ========== null in array is First ==================");
        strings = new String[]{ null, "Java", "Python", null, "JS", "hello"};

        System.out.println(Arrays.toString(strings));
        res = getArrayWithSmallestString(strings);

        System.out.println(Arrays.toString(res));





    }

    public static String[] getArrayWithSmallestString(String[] strings) {

        if (strings == null || strings.length == 0) {
            return new String[0]; // []
        }


        String notNutValue = findFirstNotNullValueInArray(strings);
        System.out.println("notNutValue: " + notNutValue);

        if (notNutValue == null) {
            return new String[0]; // []
        }


        String smallest = notNutValue;
        String biggest = notNutValue;

        for (int i = 0; i < strings.length; i++) {

            System.out.print(strings[i] + "; ");
            if (strings[i] != null && strings[i].length() < smallest.length()) {
                smallest = strings[i];
            }

            if (strings[i] != null && strings[i].length() > biggest.length()) {
                biggest = strings[i];
            }
        }

        return new String[] {smallest, biggest};
    }

    public static String findFirstNotNullValueInArray(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null) {
                return strings[i];
            }
        }

        return null;
    }
}
