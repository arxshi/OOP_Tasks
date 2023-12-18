package task1point2.animals;

public class Horse extends Animal {
    public Horse(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise() {
        System.out.println("Neigh");
    }

    @Override
    public void eat() {
        System.out.println("Horse is eating " + food);
    }

    @Override
    public void sleep() {
        System.out.println("Horse is sleeping in " + location);
    }
}
