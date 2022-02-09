package Basics;

import java.util.Scanner;

// naming schemes
/* Class: Should start with the uppercase letter.
         The main public class name should be same as filename and other public classes needs to be declared
         at their own files*/
// Interface: It should start with the uppercase letter.
// Method:It should start with lowercase letter and may contain uppercase
// Variable: It should start with a lowercase letter, may contain "$","_"
// Package: It should be a lowercase letter, may contain "."
// Constant: It should be in uppercase letters, may contain "_"
public class DataTypes {
    public static void main(String[] argc) {
        // variable types
        int num = 34984; // Takes 4 bytes
        short num2 = 43; // Takes 2 bytes
        byte num3 = 3; // Takes 1 byte
        long num4 = 8736736863l; // Takes 8 bytes, remember to give "l" at last(cast to long)
        double balance = 3452.81; // Takes 8 bytes, default floating point variable in java
        double balance2 = 4576; // Implicit conversion from int to double
        int num5 = (int) 65.89; // Explicit conversion(casting) from double to int
        float balance3 = 656.67f; // Takes 4 bytes, remember to give "f" at end(cast to float) or will be error
        char c = 'A';
        char c1 = 70; // Implicit conversion from int to ASCII value
        float balance4 = num4;
        String str= "Soumyadip";
        /* Implicit conversion types
        byte can convert to short, short and char can convert to int(also int can be converted to char),
        int can be converted to long, long to float, float to double
         */
        System.out.println("Values of variables=>");
        System.out.println("Integers=> "+num+" "+" "+num2+" "+num3+" "+num4+" "+num5);
        System.out.println("Floatings=> "+balance+" "+balance2+" "+balance3+" "+balance4);
        System.out.println("Characters=> "+c+" "+c1);
        System.out.println("Strings=> "+str);
    }
}
