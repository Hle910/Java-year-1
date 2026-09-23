
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
public class FinalGrade {
    public static int enterNum(String message)
    {
        Scanner in=new Scanner(System.in);
        System.out.println(message);
        int num=in.nextInt();
        
        return num;
    }
    
     public static int[] enterInput(String message, int size)
    {
        Scanner in=new Scanner(System.in);
        System.out.println(message);
        
        int [] info=new int[size];
        
        for(int i=0;i<info.length;i++)
        {
         System.out.printf("Enter grade %d:\n", i+1);   
         info[i]=in.nextInt();
        }
        
        return info;  
    }
     
      public static double getAvg(int [] a)
    {
        int total=0;
        
        for(int i=0;i<a.length;i++)
        {
            total=total+a[i];
            
        }
        return (double)total/a.length;
    }
      
      public static double getWeightedGrade(int percent, double avg)
    {
        double percentDecimal=(double) percent/100;
        
        return avg*percentDecimal;   
    }
      public static void letterGrade(double g)
      {
          String grade;
          
          if(g>=90&&g<=100)
          {
              grade="A";
          }
          else if(g>=80&&g<90)
          {
              grade="B";
          }
          else if(g>=70&&g<80)
          {
              grade="C";
          }
          else if(g>=60&&g<70)
          {
              grade="D";
          }
          else if(g>=0&&g<60)
          {
              grade="F";
          }
          else
          {
              grade="error";
          }
           System.out.printf("You made a %s!\n", grade);
      }
    
    public static void main(String[] args) {
    System.out.println("***Grade calculator!***");
    
    /*Use to select # of grades to enter
    int b=enterNum("\nHow many HW grades would you like to enter?");
    int c=enterNum("\nHow many quiz grades would you like to enter?");
    */
    int [] testGrades=enterInput("\nPlease enter test grades:", 3);
    int [] hwGrades=enterInput("\nPlease enter HW grades:", 8);
    int [] quizGrades=enterInput("\nPlease enter quiz grades:", 5);
    int [] finalExam=enterInput("\nPlease enter final exam grade:", 1);
    
    double avgHws=getAvg(hwGrades);
    double avgQuiz=getAvg(quizGrades);
        
    double test1=getWeightedGrade(15, testGrades [0]);
    double test2=getWeightedGrade(15, testGrades [1]);
    double test3=getWeightedGrade(15, testGrades [2]);
    double totalHwPoints=getWeightedGrade(15, avgHws);
    double totalQuizPoints=getWeightedGrade(20, avgQuiz);
    double exam=getWeightedGrade(20, finalExam[0]);
        
    double totalGrade=totalHwPoints+test1+test2+test3+totalQuizPoints+exam;
    
    System.out.printf("\nTotal grade is: %.02f\n", totalGrade);
    letterGrade(totalGrade);
    }
    
}
