class Car {
    int regNum;
    String color;
    static int num = 1000;
    {
        regNum = num++;
        System.out.println("non-static block-Car");
    }

    Car() {
        color = "White";
        System.out.println("Default Constructor-Car");
    }

    Car(String c) {
        color = c;
        System.out.println("Parameterized Constructor-Car");
    }
}

class Test5 {
    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println("CAR REGDNO: " + c1.regNum + " ||| " + "CAR Color : " + c1.color);
        System.out.println("-----------------");
        Car c2 = new Car("Black");
        System.out.println("CAR REGDNO: " + c2.regNum + " ||| " + "CAR Color : " + c2.color);   
        System.out.println("-----------------");

    }

}
