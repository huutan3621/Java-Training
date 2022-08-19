package Super2;

public class Super2Main {
    public static void main(String args[]){
        Dog d=new Dog();
        d.work();
    }
}

class Animal{
    void eat(){System.out.println("Eating...");}
}
class Dog extends Animal {
    void eat() {
        System.out.println("Eating Bones...");
    }

    void bark() {
        System.out.println("Barking...");
    }

    void work() {
        super.eat();
        bark();
    }
}