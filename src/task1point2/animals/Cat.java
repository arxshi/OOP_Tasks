package task1point2.animals;

public class Cat extends Animal {
    public Cat(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating " + food);
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping in " + location);
    }
}
