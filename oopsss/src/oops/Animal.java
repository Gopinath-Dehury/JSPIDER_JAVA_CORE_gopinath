package oops;

public class Animal {
	String name;
	Animal(String n) {
		name=n;
	}
}

class Dog extends Animal{
	String sound;
	Dog(String n,String s) {
		super(n);
		sound=s;
	}
}
 class Test{
	public static void main(String[]args) {
		Dog d=new Dog("jacky","vao vao");
		System.out.println(d.name);
		System.out.println(d.sound);

	}
}


