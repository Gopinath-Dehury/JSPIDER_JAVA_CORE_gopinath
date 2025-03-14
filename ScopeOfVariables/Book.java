class Book {
    String title;

    void display() {
        System.out.println("Title = " + title);
    }
}

class Test4 {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.title = "java";
        b1.display();
        b1 = null;
        b1.display();
    }
}
