class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}

public class Task3 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 15);
        System.out.println(r.calculateArea());
    }
}