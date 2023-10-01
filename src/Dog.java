public class Dog {
    String name;
    public static void main(String [] args) {
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Барт";

        Dog [] MyDogs = new Dog[3];
        MyDogs[0] = new Dog();
        MyDogs[1] = new Dog();
        MyDogs[2] = dog1;

        MyDogs[0].name = "Фрейд";
        MyDogs[1].name = "Джордж";

        System.out.print("Имя последней собаки - ");
        System.out.println(MyDogs[2].name);

        int x = 0;
        while (x < MyDogs.length) {
            MyDogs[x].bark();
            x = x + 1;
        }
    }

    public void bark() {
        System.out.println(name + " Сказал гав!");

    }

}
