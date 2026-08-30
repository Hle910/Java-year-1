
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Henry Le, 1001199079
 * @author Henry
 */
public class CompanyGifts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    boolean menu=true;
    String [] customer=new String[7];
    int counter=0;
    
    
    while(menu)
    {
        System.out.println("***");
        System.out.println("Enter the word \"customer\" if you are a customer or your ID if you are the manager.");
        String option=in.nextLine();
        String [] answer=option.split(" ");
        String lower=answer[0].toLowerCase();
        
        if(lower.equals("exit"))
        {
            System.out.println("Bye!");
            menu=false;
        }
        
        else if(lower.equals("abc")&&answer[1].equals("132"))
        {
            System.out.println("***");
            System.out.println("Hello manager, what would you like to do?");
            System.out.println("Print to screen or exit?");
            System.out.println("***");
            String order=in.nextLine();
            String lorder=order.toLowerCase();
            
            if(lorder.equals("print to screen"))
            {
                if(customer[0]==null)
                {
                    System.out.println("Sorry, no customers have entered any information yet.");
                }
                else
                {
                    for(int i=0;i<customer.length;i++)
                    {
                        System.out.printf("CUSTOMERS\n");
                        System.out.println("BIRTHDAY");
                    }
                }
            }
        }
        else if(lower.equals("customer"))
        {
            if(customer.length<=counter)
            {
                System.out.println("Sorry, no more customers");
            }
            
            else
            {
                System.out.println("***");
                System.out.println("Hello customer. Please enter your name(first and last) followed by your birthday (MM/DD/YYYY");
                System.out.println("***");
                customer[counter]=in.nextLine();
                String [] input=customer[counter].split(" ");
                System.out.println("Thank you !");
                counter++;
            }
        }
    }
    
    
    
    
    }
    
}
