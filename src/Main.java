import task1.Person;
import task1.Phone;
import task1point2.Aspirant;
import task1point2.Student;
import task1point2.animals.*;

public class Main {
    public static void main(String[] args) {

        // Task with Phone class
        // Comment method down below if you want to turn off console
        // messages from Phone Class Task
        completeTaskWithPhoneClass();

        // to skip lines
        System.out.println();

        // Task with Person class
        Person person1 = new Person();
        Person person2 = new Person("Jack Sparrow", 36);

        // Task with Student class
        // Comment method down below if you want to turn off console
        // messages from Student Class Task
        completeTaskWithStudentClass();

        // to skip lines
        System.out.println();

        // Task with Animal class
        // Comment method down below if you want to turn off console
        // messages from Animal Class Task
        completeTaskWithAnimalClass();
    }

    private static void sendInfoAboutPhone(Phone phone) {
        System.out.printf("%s have weight of %d and number %d\n", phone.getModel(), phone.getWeight(), phone.getNumber());
    }

    private static void completeTaskWithAnimalClass() {
        Veterinary veterinary = new Veterinary();
        Animal[] animals = new Animal[] {
                new Cat("Cat food", "Home"),
                new Dog("Dog food", "Dog house"),
                new Horse("Grass", "Wildness")
        };

        for (Animal animal : animals) {
            veterinary.treatAnimal(animal);
        }
    }

    private static void completeTaskWithStudentClass() {
        Student aspirant = new Aspirant("Gary", "Fox", "SE-2120", 4.5);
        Student[] students = new Student[] {
                new Student("John", "Smith", "CS-2210", 5),
                new Aspirant("David", "Clinton", "ML-2301", 3.5),
                new Student("Travis", "Scott", "BDA-2209", 4.3),
                new Aspirant("Kanye", "West", "IT-2101", 5),
        };

        for(Student student : students) {
            System.out.printf("%s have scholarship - %d\n", student.getFirstName(), student.getScholarship());
        }
    }

    private static void completeTaskWithPhoneClass() {
        Phone iphone = new Phone(87052563438L, "Iphone 14", 300);
        Phone samsung = new Phone(87776201645L, "Samsung A51", 200);
        Phone poco = new Phone(87073789192L, "Poco X3", 220);

        sendInfoAboutPhone(iphone);
        sendInfoAboutPhone(samsung);
        sendInfoAboutPhone(poco);

        iphone.receiveCall("John");
        samsung.receiveCall("Mark");
        poco.receiveCall("Alex");

        iphone.sendMessage(samsung.getNumber(), poco.getNumber());
    }
}