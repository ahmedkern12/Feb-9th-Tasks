class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println(name);
        System.out.println(salary);
    }
}

class Developer extends Employee {
    Developer(String name, double salary) {
        super(name, salary);
    }
}

class Manager extends Employee {
    Manager(String name, double salary) {
        super(name, salary);
    }
}

public class Task4 {
    public static void main(String[] args) {
        Developer d = new Developer("Ali", 50000);
        Manager m = new Manager("Rahul", 70000);
        d.displayDetails();
        m.displayDetails();
    }
}
