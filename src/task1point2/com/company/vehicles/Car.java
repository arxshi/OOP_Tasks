package task1point2.com.company.vehicles;

import task1point2.com.company.details.Engine;
import task1point2.com.company.professions.Driver;

public class Car {

    String brand;
    String clazz;
    String weight;
    Driver driver;
    Engine engine;

    public void start() {
        System.out.println("Let's go");
    }

    public void stop() {
        System.out.println("Let's stop");
    }

    public void turnRight() {
        System.out.println("Turn right");
    }

    public void turnLeft() {
        System.out.println("Turn left");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", clazz='" + clazz + '\'' +
                ", weight='" + weight + '\'' +
                ", driver=" + driver.toString() +
                ", engine=" + engine.toString() +
                '}';
    }
}
