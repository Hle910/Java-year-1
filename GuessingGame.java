/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Henry Le 1001199079

import java.util.*;
/**
 *
 * @author Henry
 */
public class GuessingGame {
    
    public static int numGenerate(int n)
    {
        Random r=new Random();
        int g=r.nextInt(n);
        
        return g;
    }
    
    public static int getUserInput(String message)
    {
        Scanner in=new Scanner(System.in);
        System.out.println(message);
        return in.nextInt();
    }
    
    public static boolean compareGuess(int a, int b)
    {
        if(a==b)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    public static void finalMessage(boolean c, int n)
    {
        if(c==false)
        {
            System.out.println("Yes, the number is "+n+"! you win!");
        }
        else
        {
            System.out.println("Sorry, the number is "+n);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Welcome to the guessing game!");
        System.out.println("You have 3 guesses!");
        int n=getUserInput("Enter the largest number possible to guess (remember, if you want 5 to be the largest enter one larger-6)");
        
        int numToGuess=numGenerate(n);
        
        int i=0;
        
        boolean choice=true;
        
        while(i<3&&choice)
        {
            int userNumber=getUserInput("Enter your guess");
            choice=compareGuess(userNumber,numToGuess);
            i++;
        }
        finalMessage(choice,numToGuess);
    }
    
}
