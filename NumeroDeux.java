
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Henry Le 1001199079

/**
 *
 * @author Henry
 */
public class NumeroDeux {

    /**
     * @param args the command line arguments
     */
    
    public static int getUserNum(String message)
    {
        Scanner in=new Scanner(System.in);
        
        System.out.println(message);
        int info=in.nextInt();
        
        return info;
    }
    
    public static String getUserString(int n)
    {
        Scanner in=new Scanner(System.in);
        System.out.printf("Enter a word at least length %d\n", n);
        String word=in.next();
        return word;
    }
    
    public static boolean checkNumLength(int a,int check1,int check2)
    {
        boolean state=true;
        boolean f=true;
        while(state)
        {
            if(a>=check1&&a<=check2)
            {
                state=false;
                f=false;
            }
            else
            {
                state=false;
                f=true;
            }
        }
        
        return f;
    }
    
    public static void main(String[] args) {
        boolean choice=true;
        int userIn=0;
        
        while(choice)
        {
            userIn=getUserNum("Enter a number between 4-6:");
            choice=checkNumLength(userIn,4,6);
        }
        
        String input=getUserString(userIn);
        choice=true;
        int userIn2=0;
        
        while(choice)
        {
            userIn2=getUserNum("Enter another number (for substring) between 1-3:");
            choice=checkNumLength(userIn2,1,3);
        }
        
        System.out.println(input.substring(0,userIn2));
    }
    
}
