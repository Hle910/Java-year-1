
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/** Henry Le, 1001199079
 *
 * @author Henry
 */
public class ChangeTense {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String [] past={"ate","walked","flew","danced","cooked","baked","spoke","shook","left"};
        String [] present={"eat","walk","flies","dances","cook","bake","speak","shakes","leaves"};
        String input;
        
        boolean exit=true;
        
        while(exit)
        {
            System.out.println("Enter a sentence or q to quit:");
            input=in.nextLine();
            
            if(input.equals("q"))
            {
                exit=false;
            }
            else
            {
                input=input.substring(0,input.length()-1);
                String [] words=input.split(" ");
                String replace=null;
                
                if(input.endsWith("yesterday"))
                {
                    for(int i=0;i<past.length;i++)
                    {
                        if(past[i].equals(words[1]))
                        {
                            replace=present[i];
                            break;
                        }
                    }
                if(replace==null)
                {
                    System.out.println(input+".");
                }
                else if(words[2].equals("food"))
                {
                    System.out.println(words[0]+" "+replace+" "+words[2]+" "+"today.");                            
                }
                else if(words[1].endsWith("ed"))
                {
                    System.out.println(words[0]+" "+words[1].substring(0,words[1].length()-2)+" today.");
                }
                else
                {
                    if(words[0].equals("I")&&words[1].equals("flew"))
                    {
                        System.out.println(words[0]+" fly today.");
                    }
                    else
                    {
                        System.out.println(words[0]+" "+replace+" today.");
                    }
                }   
                }
                if(input.endsWith("today"))
                {
                   for(int i=0;i<present.length;i++)
                   {
                       if(present[i].equals(words[1]))
                       {
                           replace=past[i];
                           break;
                       }
                   }
                   if(replace==null)
                   {
                       System.out.println(input+".");
                   }
                   else if(words[2].equals("food"))
                   {
                       System.out.println(words[0]+" "+replace+" "+words[2]+"today.");
                   }
                   else
                   {
                       if(words[0].equals("I")&&words[1].equals("fly"))
                       {
                           System.out.println(words[0]+" flew yesterday.");
                       }
                       else
                       {
                           System.out.println(words[0]+" "+replace+" yesterday.");
                       }
                   }
                }
            }
        }
    }
    
}
