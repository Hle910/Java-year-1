
import java.util.*;



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
public class DecTern {

    public static String getUserInput(String message)
    {
        Scanner in=new Scanner(System.in);
        System.out.println(message);
        return in.nextLine();
    }
    
    public static boolean checkInput(String in)
    {
        String [] text=in.split(" ");
        try
        {
            if(text.length==2)
            {
                int n=Integer.parseInt(text[0]);
            
                if(text[1].equals("t"))
                {
                    if(text[0].contains("3")||text[0].contains("4")||text[0].contains("5")||text[0].contains("6")||text[0].contains("7")||text[0].contains("8")||text[0].contains("9"))
                    {
                        return true;
                    }
                    else
                    {
                        return false;
                    }
                }
                else if(text[1].equals("d"))
                {
                    return false;
                }
                else
                {
                    return true;
                }
            }
            else
            {
                return true;
            }
        }
        catch(Exception e)
        {
            return true;
        }
        
    }
    
    public static int checkMethod(String [] answer)
    {
        if(answer[1].equals("t"))
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
    public static int TernaryToDec(int userInput)
    {
        String ternNum=Integer.toString(userInput);
        int numOfDigits=ternNum.length();
        int answer=0;
        
        for(int i=0;i<numOfDigits;i++)
        {
            char curNum=ternNum.charAt((numOfDigits-1)-i);
            answer=answer+valueToAdd(curNum,i);
        }
        return answer;
    }
    
    public static int valueToAdd(char c, int exp)
    {
        int digit=Character.getNumericValue(c);
        double power=(double) exp;
        
        double value=digit*Math.pow(3, power);
        
        return (int) value;
        
    }
    public static String DecToTernary(int userInput)
    {
        String ternNum="";
        
        int dividend=userInput;
        
        while(dividend !=0)
        {
            ternNum=buildNum(dividend)+ternNum;
            dividend=dividend/3;
        
        }
        
        return ternNum;
    }
    
    public static String buildNum(int num)
    {
        if(num%3==0)
        {
            return "0";
        }
        else if(num%3==2)
        {
            return "2";
        }
        else
        {
            return "1";
        }
    }
    
    public static void main(String[] args) {
        String input;
        boolean run=true;
        
        while(run)
        {
            boolean check=true;
            input=getUserInput("Enter a number with d(decimal) or t(ternary) to convert: ");
                      
            if(input.equals("exit"))
            {
                return;
            }
            
            check=checkInput(input);
            
            if(check!=true)
            {                
                String [] convert=input.split(" ");
                int method=checkMethod(convert);
                
                if(method==1)
                {
                    int dec=TernaryToDec(Integer.parseInt(convert[0]));
                    System.out.println(dec+"\n");
                }
                else
                {
                    String tern=DecToTernary(Integer.parseInt(convert[0]));
                    System.out.println(tern+"\n");
                }
            }
            else
            {
                System.out.println("Sorry, wrong format, enter again.\n");
            }
        }       
    }
    
}
