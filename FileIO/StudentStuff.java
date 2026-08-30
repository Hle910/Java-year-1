/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentstuff;

import filestuff.FileHandle;
/**
 *Henry Le 1001199079
 * @author Henry
 */
public class StudentStuff {

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
    public static void main(String[] args) {
        FileHandle FH=new FileHandle();
        
        FH.Options();
        
        
    }
    
}
