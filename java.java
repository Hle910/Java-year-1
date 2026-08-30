/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/ //Henry Le, hxl9079, 9/5/2017
package info;

import java.util.Scanner;

/**
 *
 * @author Henry
 */
public class java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        String name, food;
        int n1;
        
        
        System.out.println("Enter your name:");
        name=in.next();
        System.out.println("Enter your age:");
        n1=in.nextInt();
        System.out.println("Enter your favorite food:");
        food=in.next();
        
        System.out.printf("My name is: %s and my favorite food is %s!\n", name, food);
        
        System.out.println("***");
        
        System.out.printf("I am %d years old and in 2 years I will be %d!", n1,(n1+2));
        
        
        
        
        
    }
    
}
