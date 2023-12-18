package task1point2.animals;

public class Animal {

    String food;
    String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise(){
        System.out.println("Such an animal is making noises");
    }
    public void eat(){
        System.out.println("Such an animal is eating");
    }
    public void sleep(){
        System.out.println("Such an animal is sleeping");
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
