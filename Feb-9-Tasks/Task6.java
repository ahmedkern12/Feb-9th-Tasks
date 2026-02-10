class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog sound");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat sound");
    }
}

public class Task6 {
    public static void main(String[] args) {
        Animal a;
        a = new Dog();
        a.makeSound();
        a = new Cat();
        a.makeSound();
    }
}