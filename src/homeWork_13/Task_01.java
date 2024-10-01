package homeWork_13;

/*
Напишите метод, который вычисляет сумму всех четных чисел в массиве.
*/

    public class Task_01 {

        public static int sumEven(int[] numbers) {
            int sum = 0;

            for (int number : numbers) {

                if (number % 2 == 0) {
                    sum += number;
                }
            }

            return sum;
        }

        public static void main(String[] args) {

            int[] numbers = {10, 12, 31, 42, 56, 69};

            int result = sumEven(numbers);
            System.out.println("Сумма четных чисел: " + result);
        }
    }

