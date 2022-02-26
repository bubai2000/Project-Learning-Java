package Basics;
import java.util.Scanner;

// See also: SampleClass.java
public class ClassObjectMethod
{
    public static void main(String[] argc)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Entering class SampleClass, running main object and private object fact in it=>");
        Basics.SampleClass.main();
        System.out.println("Now enter x for factorial using public object fact2 in SampleClass=>");
        int s= Basics.SampleClass.fact2(input.nextInt());
        System.out.println("Factorial using public object fact2 on SampleClass = "+s);
        SampleClass obj1= new SampleClass(); // New object instance of class SampleClass, cannot access static methods
        System.out.println("Enter Number to calculate factorial=>");
        obj1.x = input.nextInt();
        int test = obj1.fact3(obj1.x); // Accessing a method
        System.out.println("Factorial= "+test);
        obj1.x = test;
        System.out.println("Enter new value of test");
        test = input.nextInt();
        System.out.println("New value at obj1.x(Accesing it from outside)="+obj1.x);
        obj1.print();
        System.out.println("New value of test= "+test);
        System.out.println("Now enter a number to change obj1.x internally=>");
        obj1.changex(input.nextInt());
        System.out.println("New value of obj1.x= "+obj1.x);
        input.close();
    }
}