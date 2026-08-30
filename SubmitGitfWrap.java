
import java.util.Scanner;
//Henry Le 1001199079
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Henry
 */
public class SubmitGitfWrap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        System.out.println("***Hello!Please pick from the following options:***");
        System.out.println("1)Buy standard wrapping paper-press 1");
        System.out.println("2)Buy holiday edition wrapping paper-press 2");
        int paper=in.nextInt();
        
        if(paper==1)
        {
            System.out.println("You have selected standard wrapping paper.");
        }
        
        if(paper==2)
        {
            System.out.println("You have selected holiday edition wrapping paper.");
        }
        
        System.out.println("Please enter the size of your gift(in inches):");
        System.out.printf("Length:");
        int l=in.nextInt();
        System.out.printf("Height:");
        int h=in.nextInt();
        System.out.printf("Width:");
        int w=in.nextInt();
        
        if(paper==1)
        {
            System.out.printf("You will pay $%d at the counter. Thank you for shopping with us!\n",1*2*(w*l+l*h+h*w));
        }
        
        if(paper==2)
        {
            System.out.printf("You will pay $%d at the counter. Thank you for shopping with us!\n",2*2*(w*l+l*h+h*w));
        }
                
    }
    
}
