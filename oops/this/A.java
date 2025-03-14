class Rectangle {
    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        length = length;
        breadth = breadth;
        System.out.println("Object created with length = " + length + " and breadth = " + breadth);
    }

    void display() {
        System.out.println("Length = " + length + " Breadth = " + breadth);
    }

    void area() {
        System.out.println("Area = " + length * breadth);
    }
}

public static void main(String[] args) {

}