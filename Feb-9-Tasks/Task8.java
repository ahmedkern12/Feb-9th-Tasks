import java.util.ArrayList;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class Task8 {
    public static void main(String[] args) {
        ArrayList<Product> cart = new ArrayList<>();

        cart.add(new Product("Pen", 30));
        cart.add(new Product("Book", 150));
        cart.add(new Product("Bag", 2500));

        double total = 0;

        for (Product p : cart) {
            total += p.price;
        }

        System.out.println(total);
    }
}