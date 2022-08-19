package Interface;

//interface
public class InterfaceMain {
    public static void main(String[] args) {
        Pig myChicken = new Pig();  // Create a Pig object
        myChicken.animalSound();
        myChicken.sleep();
    }
}

// Interface
interface Animal {
    public void animalSound(); // interface method (does not have a body)
    public void sleep(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Pig implements Animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The Chicken says: Chipu");
    }
    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("ZZZ");
    }
}
