package task1point2.animals;

public class Dog extends Animal {
    public Dog(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise() {
        System.out.println("Bark");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating " + food);
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping in " + location);
    }
}
