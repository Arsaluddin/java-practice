

//abstraction is about focusing on the important aspects and hiding unnecessary details to create a simplified representation or model of a system. It is a key concept in software development that promotes code organization, flexibility,and modularity, making it easier to understand, maintain and extend complex syatem.

// When a class is declared as abstract in Java, it means that the class cannot be instantiated directly. An abstract class serves as a blueprint or template for its subclasses and is intended to be subclassed to provide the implementation for its abstract methods.

abstract class Vehicle {

    public abstract void start();

    public abstract void stop();

    public void displaytype(){
        System.out.println("this is vehicle");
    }
}

class Car extends Vehicle{
   
    public void start(){
        System.out.println("car started");
    }

    public void stop(){
        System.out.println("car stops");
    }

     public void displaytype(){
        System.out.println("This is Car");
    }

}

class Bike extends Vehicle{
   
    public void start(){
        System.out.println("Bike started");
    }

    public void stop(){
        System.out.println("Bike stops");
    }

    public void displaytype(){
        System.out.println("This is Bike");
    }

}

public class Abstraction{
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        car.displaytype();
        car.start();
        car.stop();

        bike.displaytype();
        bike.start();
        bike.stop();
    }
}
