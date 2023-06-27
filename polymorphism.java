
class Animal{
     void makeSound(){
        System.out.println("Animal Make Sound");
    }
}

class Dog extends Animal{
    @Override
     void makeSound(){
        System.out.println("Dog barks");
    }
}

public class polymorphism{
    public static void main(String arg[]){
        Animal a = new Animal();
        a.makeSound();
        Dog dog = new Dog();
        dog.makeSound(); 
        Animal polymorphicDog = new Dog();
        polymorphicDog.makeSound();
    }
}