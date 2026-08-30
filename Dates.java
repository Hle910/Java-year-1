
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Henry

*/
//Henry Le 1001199079
public class Dates {

    public static String enterInput(String message)
    {
        System.out.println(message);
        Scanner in=new Scanner(System.in);
        return in.nextLine();
        
    }
     public static String DecToBinary(int userInput)
    {
        String binNum="";
        
        int dividend=userInput;
        
        while(dividend !=0)
        {
            binNum=buildNum(dividend)+binNum;
            dividend=dividend/2;
        
        }
        
        return binNum;
    }
    public static String buildNum(int num)
    {
        if(num%2==0)
        {
            return "0";
        }
        
        else
        {
            return "1";
        }
    }
    public static int BinaryToDec(int userInput)
    {
        String binNum=Integer.toString(userInput);
        int numOfDigits=binNum.length();
        int answer=0;
        
        for(int i=0;i<numOfDigits;i++)
        {
            char curNum=binNum.charAt((numOfDigits-1)-i);
            answer=answer+valueToAdd(curNum,i);
        }
        return answer;
    }
    
    public static int valueToAdd(char c, int exp)
    {
        int digit=Character.getNumericValue(c);
        double power=(double) exp;
        
        double value=digit*Math.pow(2, power);
        
        return (int) value;
        
    }
    
    public static boolean checkInput(String [] input)
    {
        boolean state=true;
        boolean f=true;
        
        while(state)
        {
            if(input.length==2)
            {
                String [] date=input[0].split("[-\\/]");
                if(date.length==2)
                {
                    int m=Integer.parseInt(date[0]);
                    int d=Integer.parseInt(date[1]);
                    if(input[0].contains("/")||input[0].contains("-"))
                    {
                        if(input[1].equals("b")||input[1].equals("d"))
                        {
                            if(input[1].equals("d"))
                            {
                                if(m>0&&m<13&&d>0)
                                {
                                    if((m==1||m==3||m==5||m==7||m==8||m==10||m==12)&&d<32)
                                    {
                                        state=false;
                                        f=false;
                                    }
                                    else if(m==2&&d<30)
                                    {
                                        state=false;
                                        f=false;
                                    }
                                    else if((m==4||m==6||m==9||m==11)&&d<31)
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
                                else
                                {
                                    state=false;
                                    f=true;
                                }
                            }
                            else
                            {
                                state=false;
                                f=false;
                            }
                        }
                        else
                        {
                            state=false;
                            f=true;
                        }
                    }
                    else
                    {
                        state=false;
                        f=true;
                    }
                }
                else
                {
                    state=false;
                    f=true;
                }
            }
            else
            {
                state=false;
                f=true;
            }
        }
        return f;
    }
    
    public static int checkMethod(String [] answer)
    {
        if(answer[1].equals("b"))
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
    public static void main(String[] args) {
        boolean main=true;
        String input = null;
        String [] check = null;
        
        while(main)
        {
            boolean run=true;
            input=enterInput("\n***Enter today's date, month followed by day:(b=binary d=decimal)");
            if(input.equals("quit"))
            {
                return;
            }
            check=input.split(" ");
            run=checkInput(check);
            
            if(run!=true)
            {
                int convert=checkMethod(check);
                String [] date=check[0].split("[-\\/]");
                int month=Integer.parseInt(date[0]);
                int day=Integer.parseInt(date[1]);
                if(convert==1)
                {
                    int m=BinaryToDec(month);
                    int d=BinaryToDec(day);
                    if(m<10&&d>=10)
                    {
                        System.out.printf("Date in decimal: 0%d/%d\n", m, d);
                    }
                    if(m>=10&&d<10)
                    {
                        System.out.printf("Date in decimal: %d/0%d\n", m, d); 
                    }
                    if(m<10&&d<10)
                    {
                        System.out.printf("Date in decimal: 0%d/0%d\n", m, d);
                    }
                    if(m>=10&&d>=10)
                    {
                        System.out.printf("Date in decimal: %d/%d\n", m, d);
                    }
            }
            else
            {
                String m=DecToBinary(month);
                String d=DecToBinary(day);
                System.out.printf("Date in binary: %s/%s\n", m, d);
            }
            }
            else
            {
                System.out.println("Wrong format. Enter again.");
            }
            
        }
    }
    
}
