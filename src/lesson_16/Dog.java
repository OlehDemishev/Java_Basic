package lesson_16;

public class Dog {
    String name;
    int weigth;

    public Dog(String name, int weigth) {

        this.name = name;
        this.weigth = weigth;

    }

    String info() {

        return "- I am dog " + name + ", my weigth is " + weigth + " kg";
    }



    void eat() {

        System.out.println("- I'm eating !");
        weigth++;
    }

    void run() {

        /*
        1. Достаточен ли вес собаки для пробежки
        2. Если вес недостаточен - предложить ей поесть перед пробежкой
        3.
         */

        while (weigth < 3) {
            System.out.println("- I'm sorry - i wana eat!");
            System.out.println("- My weigth rigth now is: " + weigth + " kg");

            eat();

        }

        System.out.println("- I'm running! ");
        weigth -= 2;   //weigth = weigth -2;
        System.out.println("- Weigth after run is: " + weigth + " kg");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");


    }







}
