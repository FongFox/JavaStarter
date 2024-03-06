package chapter07;

class Animal {
	void eat() {
		System.out.println("animal is eating...");
	}
}

class Dog extends Animal {
	void eat() {
		System.out.println("dog is eating...");
	}
}

class Cat extends Animal {
	void eat() {
		System.out.println("cat is eating...");
	}
}

class BabyDog1 extends Dog {
	void eat() {
		System.out.println("baby dog is eating...");
	}
}

public class Video47 extends Dog {
	public static void main(String args[]) {
		System.out.println("Run video 47!!!");
		Animal a = new BabyDog1();
		Animal b = new Cat();
		a.eat();

	}
}
