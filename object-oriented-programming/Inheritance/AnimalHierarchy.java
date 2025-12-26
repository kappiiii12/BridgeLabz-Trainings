abstract class Animal {
    private String name;
    private int age;

    // Constructor to initialize fields
    public Animal(String name, int age) {
        this.name = name;
        setAge(age); // Use setter to trigger validation
    }

    // Encapsulation: Getter and Setter with validation
    public String getName() { return name; }
    
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    // Abstract method: Every animal MUST have a sound, 
    // but the base class doesn't know what it is.
    public abstract void makeSound();
}

class Dog extends Animal {
    public Dog(String name, int age) { super(name, age); }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Woof Woof!");
    }
}

class Cat extends Animal {
    public Cat(String name, int age) { super(name, age); }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Meow!");
    }
}