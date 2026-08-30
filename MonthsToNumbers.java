
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
public class MonthsToNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        System.out.printf("Please enter the name of the month: ");
        String word=in.nextLine();
        
        String month=word.toLowerCase();
        String a=month.substring(0, 1).toUpperCase();
        String b=month.substring(1);
        String c=a+b;
        
        if("January".equals(c))
        {
            System.out.printf("%s is the first month.", c);
        }
        
        else if("February".equals(c))
        {
            System.out.printf("%s is the second month.", c);
        }
        
        else if("March".equals(c))
        {
            System.out.printf("%s is the third month.", c);
        }
        
        else if("April".equals(c))
        {
            System.out.printf("%s is the fourth month.", c);
        }
        
        else if("May".equals(c))
        {
            System.out.printf("%s is the fifth month.", c);
        }
        
        else if("June".equals(c))
        {
            System.out.printf("%s is the sixth month.", c);
        }
        
        else if("July".equals(c))
        {
            System.out.printf("%s is the seventh month.", c);
        }
        
        else if("August".equals(c))
        {
            System.out.printf("%s is the eighth month.", c);
        }
        
        else if("September".equals(c))
        {
            System.out.printf("%s is the ninth month.", c);
        }
        
        else if("October".equals(c))
        {
            System.out.printf("%s is the tenth month.", c);
        }
        
        else if("November".equals(c))
        {
            System.out.printf("%s is the eleventh month.", c);
        }
        
        else if("December".equals(c))
        {
            System.out.printf("%s is the twelfth month.", c);
        }
        
        else
        {
            System.out.printf("Unknown month:%s", word);
                    
        }
        
    }
    
}
