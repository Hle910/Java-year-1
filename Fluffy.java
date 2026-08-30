
import java.util.Scanner;

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
public class Fluffy {
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        String s="The big fluffy dog likes kibbles and bits";
        
        String [] splitS=s.split(" ");
        
        boolean check=splitS[7].equals("bits");
        
        int len=splitS.length;
        
        System.out.println(check);
        
        System.out.printf("Length: %d\n", splitS.length);
        
        System.out.printf("Third word: %s\n", splitS[2]);
        
        for(int i=0;i<splitS.length;i++)
        {
            System.out.printf(splitS[i]+" ");
        }
        
    }
    
}
