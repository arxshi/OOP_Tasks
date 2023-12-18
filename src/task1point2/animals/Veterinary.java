package task1point2.animals;

public class Veterinary {

    public void treatAnimal(Animal animal) {
        System.out.printf("%s is eating %s and living in %s\n", animal.getClass().getName(), animal.getFood(), animal.getLocation());
    }
}
