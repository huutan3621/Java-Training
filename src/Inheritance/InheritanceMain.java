package Inheritance;

//Ke thua trong Java
//Ke thua nhieu tang
public class InheritanceMain {
    public static void main(String[] args){
        Kitten babyCat = new Kitten();
        babyCat.cry();
        babyCat.meow();
        babyCat.eat();
    }
}

//Co 2 class ke thua la Cat va Kitten
class Animal{
    void eat(){
        System.out.println("Eating");
    }
}

//Co 1 class ke thua la Kitten
class Cat extends Animal{
    void meow(){
        System.out.println("Meowing");
    }
}

class Kitten extends Cat{
    void cry(){
        System.out.println("Crying");
    }
}
