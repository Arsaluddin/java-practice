

import java.util.*;
//Encapsulation

public class Employee {
    
//Encapsulation is the process of bunding data and methods together within a class and controlling access them using access modifiers (public ,private,protected). it provides data hiding and protects the internal state of an object.

private String name;
private int age;
private double salary;

 public Employee(String name,int age,double salary){
     this.name = name;
     this.age = age;
     this.salary = salary;
 }


 public String getName(){
    return this.name;
 }

 public int getAge(){
    return this.age;
 }

 public double getSalary(){
    return this.salary;
 }

 public void setName(String name){
     this.name = name;
 }

 public void setAge(int age){
     this.age = age;
 }

 public void setSalary(double salary){
    this.salary = salary;
 }

 
     public static void main(String arg[]){
       Employee em = new Employee("Arsal",22,3000.0);

       System.out.println("Name of the Employee is "+em.getName());
       System.out.println("Name of the Employee is "+em.getAge());
       System.out.println("Name of the Employee is "+em.getSalary());

       em.setName("Uddin");
       em.setAge(23);
       em.setSalary(5000.0);

       System.out.println("Name of the Employee is "+em.getName());
       System.out.println("Name of the Employee is "+em.getAge());
       System.out.println("Name of the Employee is "+em.getSalary());

     }

}


