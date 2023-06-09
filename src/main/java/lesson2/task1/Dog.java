package lesson2.task1;

// Ключевое слово final запрещает наследование данного класса
public final class Dog extends LandAnimal {

    public Dog() {
        // Вызов конструктора суперкласса
        super();
        System.out.println("Вызван конструктор собаки");
    }

    @Override
    public void move() {
        System.out.println("Собака бежит.");
    }

    public void bark() {
        super.feed();
        System.out.println("Woof!");
    }

    @Override
    public void feed() {
        // Вызов метода суперкласса
        super.feed();
        System.out.println("Собака ест мясо");
    }

    public void feed(int weight) {
        System.out.println("Собака ест мясо: " + weight + " кг");
    }
}
