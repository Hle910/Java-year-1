
import java.util.ArrayList;
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
public class ArrFix {

    public static int getUserInput(String message)
    {
        Scanner in=new Scanner(System.in);
        System.out.println(message);
        boolean done=true;
        int n=0;
        
        while(done)
        {
            try
            {
             n=in.nextInt();
             done=false;
            }
            catch(Exception e)
            {
                System.out.println("That is not a number. Please enter a number.");
                in.nextLine();
            }
        } 
        return n;
    }
    public static void printOutList(ArrayList<Integer> a)
    {
        System.out.println("Currently in the list");
        for(int i=0;i<a.size();i++)
        {
            System.out.printf("%d ", a.get(i));
        }
        System.out.println("\n");
    }
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<Integer>numbers=new ArrayList();
        int n;
        
        do
        {
            n=getUserInput("Enter a number or -1 to quit.");
            if(n==-1)
            {
                System.out.println("Bye!");
                return;
            }
            for(int i=0;i<numbers.size();i++)
            {
                if(n==numbers.get(i))
                {
                    System.out.println("Already have this number.");
                    break;
                }
            }
            numbers.add(n);
            printOutList(numbers);
        }while(n!=-1);
    }
    
}
