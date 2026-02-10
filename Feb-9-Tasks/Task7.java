interface Shape {
    double calculateArea();
}

class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Square implements Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return side * side;
    }
}

public class Task7 {
    public static void main(String[] args) {
        Shape c = new Circle(4);
        Shape s = new Square(6);
        System.out.println(c.calculateArea());
        System.out.println(s.calculateArea());
    }
}