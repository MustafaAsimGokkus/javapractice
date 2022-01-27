package car_project_a_c;

public class Car_Project_Definition {
/*
    Definition : We will create a "Car" object and print its specifications on the console
    Tool: Abstract class constructor
 
    Structure
    1)Toyota and Honda are concrete child classes
    2)Car class is the parent abstract class
 
    How ?
    1)create all classes and establish inheritance
    2) create abstract methods in abstract class
    3)override abstract methods in child classes ==> mandatory
    4)create constructors with and without parameter in all classes
    5)in runner class create car1 from Honda class no parameter constructor==>Car car1 = new Honda();
    6)from runner class reach to instance variable of abstract class and print it ==>System.out.println(car1.model);//null
    7)from runner class reach to methods in concrete child class and print on the console==> System.out.println(car1.carMake());
    8)from runner class create car2 by constructor with 3 parameters by assigning values e.g civic-2021-300
   
    This was usual process now we will do sth. new!
   
    1)Go to 3 parameter constructor in concrete child class Honda
    2)in that constructor edit super()==>super(model,year,price)
    3)go to abstract parent class to produce 3 parameter constructor
    4)now you will assign all values in your child class to the instance variables of abstract class
    *** we achieved our aim: manipulating abstract class variables from child**
 */
}
