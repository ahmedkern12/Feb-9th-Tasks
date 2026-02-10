class Student {
    private int id;
    private String name;
    private int marks;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else {
            return "C";
        }
    }
}

public class Task1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setId(2);
        s.setName("Sunny");
        s.setMarks(60);
        System.out.println("ID: " + s.getId());
        System.out.println("Name: " + s.getName());
        System.out.println("Marks: " + s.getMarks());
        System.out.println("Grade: " + s.calculateGrade());
    }
}
