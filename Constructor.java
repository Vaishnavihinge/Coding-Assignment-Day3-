// Parent class
class Person {
    String name;

    // No-argument constructor
    Person() {
        this(" Rajesh");   // constructor chaining using this()
        System.out.println("Person no-arg constructor");
    }

    // Parameterized constructor
    Person(String name) {
        this.name = name;
        System.out.println("Person parameterized constructor");
    }
}

// Child class
class Child extends Person {
    int id;

    Child()    // No-argument constructor
    {
        this(1, "No Name");   // calls parameterized constructor of same class
        System.out.println("Student no-arg constructor");
    }

    Child(int id, String name)   // Parameterized constructor
    {
        super(name);          // calls parent class constructor
        this.id = id;
        System.out.println("Student parameterized constructor");
    }

    void display()   // Method to display object state
    {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

// Main class
public class Constructor {
    public static void main(String[] args) {

        Child s = new Child();   // Object creation

        System.out.println("\nFinal Object State:");
        s.display();
    }
}