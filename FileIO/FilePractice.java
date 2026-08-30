
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Henry Le 1001199079
 * @author Henry
 */
public class FilePractice {
    
    public static String [][]genFile()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter file name:");
        String fileName=in.nextLine();
        
        ArrayList<String>allLines=null;
        while(allLines==null)
        {
            allLines=readFile(fileName);
            if(allLines==null)
            {
                System.out.println("Enter file name:");
                fileName=in.nextLine();
            }
        }
        
        String [][] result=new String[allLines.size()][];
        
        for(int i=0;i<allLines.size();i++)
        {
            String line=allLines.get(i);
            result[i]=line.split(",");
        }
        
        return result;
    }
    
    public static ArrayList<String>readFile(String filename)
    {
        File temp=new File(filename);
        Scanner iFile;
        
        try
        {
            iFile=new Scanner(temp);
        }
        catch(Exception e)
        {
            System.out.printf("Failed to open %s\n", filename);
            return null;
        }
        
        ArrayList<String>result=new ArrayList();
        while(iFile.hasNextLine())
        {
            String line=iFile.nextLine();
            result.add(line);
        }
        
        iFile.close();
        return result;
    }
    
    public static void main(String[] args) {
    String [][]g=genFile();
    System.out.println("\nSecond Row:");
    
    for(int i=0;i<g[2].length;i++)
    {
        System.out.printf("%s ",g[2][i]);
    }
    
    System.out.printf("\n\nDate: %s\n",g[9][0]);
    }
    
}
