package chapter9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckPoints {

    public static void main(String[] args) {
        // 9.1

        // name of superclass = Vehicle;
        // name of subclass = Truck;

        // 9.2
        /*
         1. Shape
         2. Subclass Circle has a solid line with filled
            in arrow pointing towards the superclass, Shape.
         3. The public members of an instance of circle are
            data field - radius, method - setRadius,
            method - getRadius, method - setArea, method - setArea,
            method - getArea.
         4. data field - area;
         5. c.setRadius(10, 0); - legal
            s.setRadius(10, 0); - illegal
            System.out.println(c.getArea()); - legal
            System.out.println(s.getArea()); - legal
         */

        // 9.3
            // The constructor of class A executes first followed
            // by the constructor for class B.

        // 9.4
        // "You are on the ground."
        // "You are in the sky."

        // 9.5
        // "The ground is green"
        // "The sky is blue"

        // 9.6
        // If a subclass needs to do something that it's parent class already implements
        // with an inherited method, but the functionality needs to be altered.

        // 9.7
        // by using the super keyword, example super.(methodName)

        // 9.8
        // override

        // 9.9
        // overload

        // 9.10
        // making the method final with the final keyword.

        // 9.11 classes that inherit from it and classes in the
        // same package.

        // 9.12
        // private members can only be accessed by the class they reside
        // in or public methods of the class.

        // 9.13
        // It is best practice to make data fields private with public
        // methods rather than making anything protected.

        // 9.14
        // when a member has private access, only the class of the
        // member has access to it.
        // when a member has package access, only classes within the
        // same package can access the member regardless of inheritance.

        // 9.15
        // because it is a default setting. Maybe you might have forgotten
        // to write an access specifier before your method or
        // data field.

        // 9.16
        // It is not true that it does not inherit from Object class.
        // all methods inherit from class 'Object'. ClassB inherits from
        // Object so ClassD inherits everything ClassB inherited.

        // 9.17
        // The toString method and equals method are methods in Object.

        // 9.18
        /*
        1. It is legal because a reference variable that references
            a parent class may also reference a child class inherited
            from it.

        2. Legal
           Legal
           Illegal
           Illegal

       3. Illegal, because a reference variable referencing an instance
          of a child class may not reference an instance of it's parent.
         */

        // 9.19
        //The purpose of an abstract method is to ensure that the
        // method is implemented in the inheriting class.

        // 9.20
        // If a subclass extends a superclass with an abstract method
        // the subclass must provide a method definition in accordance
        // with the abstract method header.

        // 9.21
        // Abstract classes serve as a bass class only to be inherited
        // from. An abstract class is never inherited from.

        // 9.22
        // You can not instantiate it aka create an instance of it.

        // 9.23
        // an interface ensures that all methods will be implemented.
        // It is a contract that to implement the methods in the
        // inheriting class.

        // 9.24
        // An interface is similar to an abstract class in that
        // they are both not meant to be instantiated on their own and
        // that they both can provide abstract methods to the classes they are
        // inherited from / implementing.

        // 9.25
        // an interface is different in the sense that a class can implement multiple
        // interfaces. A class can only inherit from one parent class. Abstract
        // classes may provide both concrete and abstract methods.

        // 9.26
        // if an interface has fields they are treated as final and static.
        // class Customer implements Relatable

        // 9.27
        // public class Employee implements Payable,
        //                                  Listable

        // Testing a Pattern.matches method
        System.out.println(Pattern.matches("[0-9][0-9][0-9]-[A-M]", "456-D"));
        System.out.println(Pattern.matches("[0-12]-[0-31]-[0-3000]", "1-"));


    }
}
