
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
public class NumberLength {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        System.out.printf("Please enter a number between 4-6: ");
        int num=in.nextInt();
        
        if (num<4 || 6<num)
        {
            System.out.println("Number out of range!");
            return;
        }
        
        System.out.printf("Enter a word with at least %d letters and less than 10 letters: ", num);
        in.nextLine();
        String word=in.nextLine();
        
        if(word.length()<num||10<word.length())
        {
            System.out.println("Too few letters!");
            return;
        }
        
        System.out.printf("Please enter another number between 1-3:");
        int num2=in.nextInt();
        
        if(num2<1||3<num2)
        {
            System.out.println("Not a valid number");
        }
        
        else if(1<=num2&&num2<=3)
        {
            String wordSubstring=word.substring(0,num2);
            System.out.printf("%s\n", wordSubstring);
        }
                
        
    }
    
}
