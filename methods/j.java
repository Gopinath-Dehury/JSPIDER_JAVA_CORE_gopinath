class Car {

}

class Audi extends Car {

}

class BMW extends Car {

}

class Main {
    public static void main(String[] args) {
        Audi a = new Audi();
        System.out.println(a.getClass().getGenericSuperclass().getTypeName());
        System.out.println("Done");
    }
}