import DSA.ArrayList;

public class Test {
    public class Car {
        String name;
        int price;

        Car(String n, int p) {
            name = n;
            price = p;
        }

        @Override
        public String toString() {
            return name + " " + price;
        }

    }

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(13);
        al.add(17);
        al.add(19);
        al.add(12);
        al.add(15);
        al.add(1, "gopi");
        al.add(new Test().new Car("BMW", 123455765));

        System.out.println(al.get(6));
        System.out.println(al.contains("gopi"));

        System.out.println(al);

    }
}
