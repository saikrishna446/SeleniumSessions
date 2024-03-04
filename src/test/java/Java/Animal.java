package Java;

//Superclass or base class
class Animal {
	String name;

	// Constructor
	Animal(String name) {
		this.name = name;
	}

	// Method
	void makeSound() {
		System.out.println("Some sound");
	}
}

//Subclass or derived class
class Dog extends Animal {
	// Constructor
	Dog(String name) {
		// Call superclass constructor
		super(name);
	}

	// Method overriding
	@Override
	void makeSound() {
		System.out.println("Woof");
	}

	public static void main(String[] args) {
		// Creating an instance of the subclass
		Dog myDog = new Dog("Buddy");

		// Accessing superclass fields
		System.out.println("Name of my dog: " + myDog.name);

		// Invoking overridden method
		myDog.makeSound(); // Output will be "Woof"
	}
}
