package lesson_16;

import lesson_15.Cat;

public class Lesson_16 {
    public static void main(String[] args) {


    Cat catVar = new Cat(); //Создается новый объект типа Cat и вызывается конструктор для инициализацияя полей объектов.


        int x = 10;

    catVar.whoAmI();

        System.out.println(catVar.name);

        catVar.name = "Nik";

        System.out.println(catVar.name);

        catVar.whoAmI();

        Cat newCat = new Cat ("Barsik", "Grey", 5);

        newCat.whoAmI();
        System.out.println(newCat.name);
        System.out.println(newCat.color);
        System.out.println(newCat.age);

        newCat.age = 10;
        newCat.whoAmI();
        System.out.println("=======================\n");

        Cat cat1 = new Cat("Barsik", "Gray", 3);

        Cat catClone =  cat1;
        catClone.whoAmI();

    cat1.age = 100;
    cat1.whoAmI();
    catClone.whoAmI();

    catClone = new Cat("Rex", "Black", 3);
    catClone.whoAmI();;

        catClone = null;

        if (catClone != null) {

        catClone.whoAmI();

    }
    }
}
