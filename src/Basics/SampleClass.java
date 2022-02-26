package Basics; // Package name declaration
import java.util.Scanner; // Imports from other packages

// See also: https://www.geeksforgeeks.org/non-access-modifiers-in-java/
// See also: https://youtu.be/7GwptabrYyk
// See also: https://www.journaldev.com/12552/public-static-void-main-string-args-java-main-method#:~:text=public%20static%20void%20main%28String%5B%5D%20args%29%20Java%20main%20method,argument%2C%20for%20example%20you%20can%20change%20argsto%20myStringArgs.
// Public Classname needs to be same as filename.
// Other classes are either not public or declared in their files and imported
public class SampleClass {
    // Instance Variables
    int x;

    // Main method needs to be static
    public static void main()
    {
        Scanner fact1 = new Scanner(System.in);
        System.out.println("Enter x =>");
        int x= fact1.nextInt();
        int f=fact(x);
        System.out.println("Factorial of "+x+" is ="+f);
        // To use a nonstatic method(like changex) within a static method(like Main), we need to create an instance
        SampleClass sample = new SampleClass();
        sample.changex(50);
        System.out.println("New value of sample.x=> "+sample.x);
        fact1.close();
    }
    // Static methods(They belong to the class but not to an instance of the class, so can run without an instance)
    private static int fact(int x)
    {
        if(x==0)
        {
            return 1;
        }
        else
        {
            return x*fact((x-1));
        }
    }
    public static int fact2(int x)
    {
        if(x==0)
        {
            return 1;
        }
        else
        {
            return x*fact((x-1));
        }
    }
    // Non-Static methods(Requires instances and runs within them)
    public int fact3(int x)
    {
        if(x==0)
        {
            return 1;
        }
        else
        {
            return x*fact((x-1));
        }
    }
    public void print()
    {
        System.out.println("New value of obj1.x(printing using method inside SampleClass)= "+this.x);
    }
    public void changex(int x)
    {
        this.x=x;
        System.out.println("Value of x changed within class");
    }
}

/*
* Other type of methods:
* final: final keyword indicates that the specific class cannot be extended or a method cannot be overridden.
* abstract: Used to declare a class as partially implemented. An object cannot be created directly from that class.
* synchronized: This keyword prevents a block of code from executing by multiple threads at once.
* volatile: keyword is used to make the class thread-safe.
* native: keyword may be applied to a method to indicate that the method is implemented in a language other than Java
* transient: keyword may be applied to member variables of a class to indicate that
*            the member variable should not be serialized when the containing class instance is serialized.
*/
