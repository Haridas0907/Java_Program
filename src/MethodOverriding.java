// Parent class
class Animal {
	// Overridden method
	public void sound() {
		System.out.println("Animal makes a sound");
	}
}

// Child class (subclass)
class Dog extends Animal {
	// Overriding the sound method of Animal class
	@Override
	public void sound() {
		System.out.println("Dog barks");
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
		Animal animal = new Animal(); // Create an Animal object
		animal.sound(); // Calls Animal's sound method

		Dog dog = new Dog(); // Create a Dog object
		dog.sound(); // Calls Dog's overridden sound method
	}
}
