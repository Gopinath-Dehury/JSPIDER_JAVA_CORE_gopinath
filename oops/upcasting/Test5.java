class Bottle {
    String type;
    int capacity;

    Bottle(String t, int c) {
        type = t;
        capacity = c;
        System.out.println("bottle initialised done.");

    }

    void showdetails() {
        System.out.println("It capacity is " + capacity + "L.");
        System.out.println("It is made of " + type);
    }

    void inc_botle_capacity_by(int i) {
        capacity += i;
        System.out.println("Capacity increased successfully by " + i);
    }
}

class Plastic_Bottle extends Bottle {
    Plastic_Bottle(String t, int c) {
        super(t, c);
        System.out.println("plastic bottle initialised done.");

    }

    void rapping() {
        System.out.println("rapping is completed.");
    }
}

public class Test5 {
    public static void main(String[] args) {
        Plastic_Bottle b1 = new Plastic_Bottle("plastic", 1);
        b1.rapping();
        b1.showdetails();
        b1.inc_botle_capacity_by(4);
        b1.showdetails();
    }
}