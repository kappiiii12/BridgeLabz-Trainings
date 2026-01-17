// Parent class
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a generic sound.");
    }
}

// Child class
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks: Woof! Woof!");
    }
}
public class OverrideDemo {
    public static void main(String[] args) {
        // Create a Dog instance
        Dog myDog = new Dog();
        
        // Call the overridden method
        myDog.makeSound(); 
        
        // Demonstration of Polymorphism
        Animal genericAnimal = new Dog();
        genericAnimal.makeSound(); // Still calls the Dog version!
    }
}