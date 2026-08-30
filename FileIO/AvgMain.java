/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AvgMain;
import Filestuff.FileIO;
import java.util.*;
/**
 *Henry Le 1001199079
 * @author Henry
 */
public class AvgMain {

    public static String findCol(String num, String [][] result)
    {
        Scanner in=new Scanner(System.in);
        boolean run=true;
        String name;
                
        while(run)
        {
            System.out.println("\nEnter "+num+" column to find.");
            name=in.nextLine();
            
            for(int i=0;i<result[0].length;i++)
            {
                if(name.equals(result[0][i]))
                {
                    return name;
                }
            }
            System.out.println("Sorry, we didn't find it");
        }
        return null;
    }
    
    public static ArrayList<String> getCol(String col, String [][] file)
    {
        int rows=file.length;
        int columns=file[0].length;
        ArrayList<String> result=new ArrayList();
        
        for(int i=0;i<columns;i++)
        {
            if(col.equals(file[0][i]))
            {
                for(int j=1;j<rows;j++)
                {
                    result.add(file[j][i].trim());
                }
            }
        }
        return result;
    }
    
    public static ArrayList<String> getAvg(ArrayList<String> one, ArrayList<String> two)
    {
        ArrayList<String> result=new ArrayList();
        for(int i=0;i<one.size();i++)
        {
            double a=(Double.parseDouble(one.get(i))+Double.parseDouble(two.get(i)))/2;
            result.add(Double.toString(a));
        }
        
        return result;
    }
    
    public static ArrayList<String>createData(String [][] data, ArrayList<String> result, String col1, String col2)
    {
        ArrayList<String> Data=new ArrayList();
        Data.add("**Avg of: "+col1+" and "+col2+".**");
        for(int i=0;i<result.size();i++)
        {
            Data.add(data[i+1][0]+": "+result.get(i));
        }
        
        return Data;
    }
    
    public static void printOutData(ArrayList<String> result)
    {
        System.out.println(result.get(0)+"\n");
        for(int i=1;i<result.size();i++)
        {
            System.out.println(result.get(i));
        }
    }
    
    public static void main(String[] args) {
        String [][] file=FileIO.genFile();
        //FileIO.print2d(file);
        
        String name1=findCol("first", file);
        String name2=findCol("second", file);
        
        ArrayList<String> col1=getCol(name1, file);
        ArrayList<String> col2=getCol(name2, file);
        ArrayList<String> average=getAvg(col1,col2);
        
        ArrayList<String> fileOut=createData(file,average,name1,name2);
        printOutData(fileOut);
        
        FileIO.fileOutputObj(fileOut);
    }
    
}
