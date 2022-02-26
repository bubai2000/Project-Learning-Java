package Basics;

import java.util.Scanner;

public class FactorialFunction {
    public static void main(String[] argc)
    {
        Scanner fact1 = new Scanner(System.in);
        System.out.println("Enter x =>");
        int x= fact1.nextInt();
        int f=fact(x);
        System.out.println("Factorial of "+x+" is ="+f);
        fact1.close();
    }
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
}
