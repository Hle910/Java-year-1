/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filestuff;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *Henry Le 1001199079
 * @author Henry
 */
public class FileHandle {
    public static String [][] genFile()
    {
        ArrayList<String> lines=null;
        Scanner in=new Scanner(System.in);
        
        while(lines==null)
        {
            System.out.println("Enter file name:");
            String fileName=in.nextLine();
            lines=readFile(fileName);
        }
        
        String [][] result=new String[lines.size()][];
        
        for(int i=0; i<lines.size(); i++)
        {
            String line=lines.get(i);
            result[i]=line.split(",");
        }
        
        return result;
    }
    
    public static ArrayList<String> readFile(String filename)
    {
        File temp=new File(filename);
        Scanner input_file;
        try
        {
            input_file=new Scanner(temp);
        }
        catch(Exception e)
        {
            System.out.printf("Failed to open file: %s\n\n", filename);
            return null;
        }
        
        ArrayList<String> result=new ArrayList();
        while(input_file.hasNextLine())
        {
            String line=input_file.nextLine();
            result.add(line);
        }
        
        input_file.close();
        return result;
    }
    
    public static String getUserInput(String message)
    {
        Scanner in=new Scanner(System.in);
        System.out.println(message);
        return in.nextLine();
    }
    
    public static void fileOutputObj(ArrayList<String> toFile)
    {
        String filename=getUserInput("Enter filename to save to:");
        PrintWriter out=null;//
        try
        {
            out=new PrintWriter(filename);
        }
        catch(Exception e)
        {
            System.out.printf("Error: Failed to open file %s.\n",filename);
            System.exit(0);
        }
        
        String input="";
        
        for(int i=0;i<toFile.size();i++)
        {
            out.println(toFile.get(i));
        }
        
        out.close();
        
            System.out.printf("Done writing to file %s.\n",filename);
    }
    
    public static void print2d(String [][] a)
    {
        int rows=a.length;
        int columns=a[0].length;
        
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                System.out.printf(String.format("%20s ", a[i][j]));
            }
            System.out.println();
        }
    }
    
    public static void Options()
    {
        Scanner in=new Scanner(System.in);
        String [][] result=genFile();
        //print2d(result);
        
        boolean run=true;
        while(run)
        {
            System.out.println("\nEnter an option:\n1-Student\n2-Class roster\n3-Class grade\n4-Quit\n");
            int o=in.nextInt();
            if(o==1)
            {
                Student(result);
            }
            if(o==2)
            {
                Class(result);
            }
            if(o==3)
            {
                ClassGrade(result);
            }
            if(o==4)
            {
                return;
            }
        }
    }
    
    public static void Student(String [][] result)
    {   
        String name=getUserInput("Enter name of student:");
        int rows=result.length;
        
        for(int i=0;i<rows;i++)
        {
            if(result[i][0].equals(name))
            {
                System.out.printf(String.format("%s %s %s %s\n", result[i][0],result[i][1],result[i][2],result[i][3]));
                return;
            }
        }
        
        System.out.println("Sorry, Student with name "+name+" does not exist.");
    }
    public static void Class(String [][] result)
    {
        String name=getUserInput("Enter class name");
        ArrayList<String>l=new ArrayList();
        int rows=result.length;
        
        for(int i=0;i<rows;i++)
        {
            if(name.equals(result[i][2].trim()))
            {
                l.add(result[i][0].trim());
            }
        }
        
        fileOutputObj(l);
    }
    public static void ClassGrade(String [][] result)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Type 1 to put class #, or 2 to put class name:");
        int find=in.nextInt();
        int n=0;
        int sum=0;
        int avg=0;
        int add=0;
        
        if(find==1)
        {
            String num=getUserInput("Type a class number:");
            
            for(int i=0;i<result.length;i++)
            {
                add=0;
                if(num.equals(result[i][1].trim()))
                {
                  add=Integer.parseInt(result[i][3].trim());
                  n++;
                }
                sum=sum+add;
            }
            avg=sum/n;
            System.out.println("\nThe overall grade average of "+num+" is "+avg);
        }
        
        if(find==2)
        {
           String name=getUserInput("Type a class name:");
            
           for(int i=0;i<result.length;i++)
           {
               add=0;
               if(name.equals(result[i][2].trim()))
               {
                   add=Integer.parseInt(result[i][3].trim());
                   n++;
               }
               sum=sum+add;
           }
           avg=sum/n;
           System.out.println("The overall grade average of "+name+" is "+avg); 
        }
    }
}
