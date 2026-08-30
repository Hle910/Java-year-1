/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Filestuff;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *Henry Le 1001199079
 * @author Henry
 */
public class FileIO {
    public static ArrayList<String>readFile(String filename)
    {
        File temp=new File(filename);
        Scanner input_file;
        try
        {
            input_file=new Scanner(temp);
        }
        catch(Exception e)
        {
            System.out.printf("Failed to open file %s\n\n",filename);
            return null;
        }
        
        ArrayList<String>result=new ArrayList<String>();
        while(input_file.hasNextLine())
        {
            String line=input_file.nextLine();
            result.add(line);
        }
        
        input_file.close();
        return result;
    }
    
    public static String[][]genFile()
    {
        ArrayList<String>lines=null;
        Scanner in=new Scanner(System.in);
        
        while(lines==null)
        {
            System.out.println("Enter file name:");
            String fileName=in.nextLine();
            lines=readFile(fileName);
        }
        
        String [][]result=new String[lines.size()][];
        
        for(int i=0;i<lines.size();i++)
        {
            String line=lines.get(i);
            result[i]=line.split(",");
        }
        
        return result;
    }

    public static String getUserInput(String message) {
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
}
