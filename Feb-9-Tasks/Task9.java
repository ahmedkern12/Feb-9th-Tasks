class Book {
    private String title;
    private boolean isIssued;

    Book(String title) {
        this.title = title;
        isIssued = false;
    }

    public void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println("Book issued");
        } else {
            System.out.println("Book already issued");
        }
    }

    public void returnBook() {
        if (isIssued) {
            isIssued = false;
            System.out.println("Book returned");
        } else {
            System.out.println("Book was not issued");
        }
    }
}

public class Task9 {
    public static void main(String[] args) {
        Book b = new Book("Java Basics");
        b.issueBook();
        b.issueBook();
        b.returnBook();
    }
}
