package Basics;

import java.util.Scanner;

public class SwappingValues {
    public static void main(String[] argc) {
        Scanner obj1 = new Scanner(System.in);
        int x,y, z;
        System.out.println("Enter x and y=>");
        x = obj1.nextInt();
        y = obj1.nextInt();
        z = (x + y);
        x = (z - x);
        y = (z - y);
        System.out.println("Swapped values x = " + x + " and y = " + y);
        obj1.close();
    }
}
