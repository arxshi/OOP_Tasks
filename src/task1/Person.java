package task1;

public class Person {

    String fullName;
    int age;

    public void move() {
        System.out.printf("%s in age %d is moving\n", fullName, age);
    }

    public void talk() {
        System.out.printf("%s in age %d is talking\n", fullName, age);
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {
    }
}
