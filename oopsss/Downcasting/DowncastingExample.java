import java.util.Scanner;
class Animal {
    void makeSound() {
        System.out.println("Generic animal sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Woof!");
    }

    void fetch() {
        System.out.println("Dog is RUNNING.");
    }
	
	
}

class Cat extends Animal{
	void makeSound() {
        System.out.println("meowww meowww");
    }
	void eat(){
		 System.out.println("Cat is eating fish.");
	}
}

public class DowncastingExample {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Which animal you want to see?");
		String UI=sc.next();
		Animal animal=null;
		if(UI.equalsIgnoreCase("dog")){
			 animal = new Dog();
			 System.out.println("Dog instance is created.");
		}else if(UI.equalsIgnoreCase("cat")){
			 animal = new Cat();
			 System.out.println("Cat instance is created.");
		}
		
        // animal = new Dog(); // Upcasting (implicit)
        // animal.fetch(); // This would cause a compile-time error

        if (animal instanceof Dog) {//instanceof check that the reference variable is that given type or not if yes the it return true and no it return false
            Dog dog = (Dog) animal; // Downcasting (explicit)
            dog.fetch(); // Now we can call fetch()
		}else if(animal instanceof Cat){
				Cat cat=(Cat)animal;
				cat.eat();
				
			}
        

    }
}