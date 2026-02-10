class Engine {
    String type;

    Engine(String type) {
        this.type = type;
    }
}

class Car {
    String model;
    Engine engine;

    Car(String model, String type) {
        this.model = model;
        engine = new Engine(type);
    }

    void displayDetails() {
        System.out.println(model);
        System.out.println(engine.type);
    }
}

public class Task10 {
    public static void main(String[] args) {
        Car c = new Car("Tata", "Petrol");
        c.displayDetails();
    }
}
