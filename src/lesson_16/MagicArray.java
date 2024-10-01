package lesson_16;

public class MagicArray {
    int[] array;

    int cursor;

    public MagicArray() {

        array = new int[10];

    }

// Добавление в массив одного элемента
    void add (int value) {

        //  Проверка. Есть ли вообще свободное место во внутреннем массиве
        // Если места нет - нужно добавить место

        if (cursor == array.length -1) {
            // Расширить массив перед добавлением нового элемента

            expandArray();
        }


        array[cursor] = value;
        cursor++;
    }

    void add(int...numbers) {
        // c numbers я могу обращаться точно так же как со ссылкой на массив int
        System.out.println("-Приняли несколько int.  А именно : " + numbers.length);
        System.out.println("-Есть индекс у каждого int б как в массиве. По идексом 0: " + numbers[0]);

        for (int i = 0; i < numbers.length; i++) {
            add(numbers[i]);
        }


        }



    // Динамическое расширение массива
    void  expandArray() {

        System.out.println("Расширяем массив! Курсор = " + cursor);
        /*
        1. Создать новый массив бОльшего размера в 2 раза
        2. Переписать в новый массив все значения из старого
        3. Перебросить ссылку
         */

        int[] newArray = new int[array.length * 2]; // 1 - задание

        for (int i = 0; i < cursor; i++) {

            newArray[i] = array[i]; // 2 задание

        }
        System.out.println("Расширение массива завершено");

        array = newArray; // 3
        System.out.println("Расширение массива завершено!");
    }

    // Возвращает строкое представление массива
    // [1, 14, 16]
    public String toString() {

        if (cursor == 0) return "[]";

        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result = result + array[i] + (i < cursor - 1 ? ", " : "]");

        }
        return result;
    }

    // Текущее кол-во элементов в массиве
    int size() {
        return cursor;

    }

    // Возвращаем значение по индексу
    int get(int index) {
        if (index >=0 && index < cursor) {
            return array[index];
        }
        // Написать код, если индекс "не корректный"

        return Integer.MIN_VALUE;
        // todo Поправить обработку не корректного индекса



    }


    int remove(int index) {

        /*
        1. Проверка индекса на валидность
        2. Удалить значение по индексу
        3. Передвинуть курсор (т.к. кол-во элементов уменьшилось)
        4. Вернуть старое значение
         */
        return -1;
    }






}
