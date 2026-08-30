
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**Henry Le 1001199079
 *
 * @author Henry
 */
public class EvenOdd {

    /**
     * @param args the command line arguments
     */
    
    public static int getUserInput(String message)
    {
        Scanner in=new Scanner(System.in);
        System.out.println(message);
        int input=in.nextInt();
        return input;
    }
    
    public static boolean checkIfEven(int n)
    {
        Scanner in=new Scanner(System.in);
      boolean check=true;
      boolean f=true;
      int e=n;
      
      while(check)
      {
          if(e%2==0)
          {
              check=false;
              f=false;
          }
          else
          {
             System.out.println("That is not even. Enter an even number");
             e=in.nextInt();
          }
          

      }
      
      return f;
    }
    
    public static boolean checkIfOdd(int n)
    {
        Scanner in=new Scanner(System.in);
      boolean check=true;
      boolean f=true;
      int o=n;
      
      while(check)
      {
          if(o%2!=0)
          {
              check=false;
              f=false;
          }
          else
          {
             System.out.println("That is not odd. Enter an odd number");
             o=in.nextInt();
          }
      }
      
      return f;
    }
    
    public static void main(String[] args) {
        boolean number=true;
        int num=getUserInput("--Enter an even number:");
        
        while(number)
        {
         number=checkIfEven(num);
        }
        
        int num2=getUserInput("--Ok thanks! Now enter an odd number:");
        boolean number2=true;
        
        while(number2)
        {
            number2=checkIfOdd(num2);
        }
        
        System.out.println("**Thanks! Bye!**");
        
    }
    
}
