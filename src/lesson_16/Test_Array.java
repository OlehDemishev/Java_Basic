package lesson_16;

public class Test_Array {
    public static void main(String[] args) {

        MagicArray magicArray = new MagicArray();

        System.out.println(magicArray.toString());

        magicArray.add(100);
        magicArray.add(200);
        magicArray.add(300);
        System.out.println("- Now in massive: " + magicArray.size());
        magicArray.add(400, 500, 600, 700, 800, 900, 1000, 1100, 1200, 1300 );

        System.out.println(magicArray.toString());

    }
}
