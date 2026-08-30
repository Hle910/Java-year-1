/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package albummain;

import java.util.ArrayList;
import FileStuff.fileIO;

/**
 *Henry Le 1001199079
 * @author Henry
 */
public class AlbumCollection {
    ArrayList<Album>collection=new ArrayList();
    
    public AlbumCollection()
    {
        String f=fileIO.getUserInput("Enter file name:");
        ArrayList<String>fileInfo=fileIO.readFile(f);
        
        for(int i=0;i<fileInfo.size();i++)
        {
            String st=fileInfo.get(i);
            String [] info=st.split("-|\\(|\\)");
            Album a=new Album(info);
            collection.add(a);
        }
        
        printOutTotalAlbums(collection);
    }
    public static void printOutTotalAlbums(ArrayList<Album> collection)
    {
        System.out.println("\n***Albums by Year.***");
        ArrayList<String>Year=new ArrayList();
        
        for(int i=0;i<collection.size();i++)
        {
            Album a=collection.get(i);
            
            if(Year.contains(a.date))
            {
                continue;
            }
            else
            {
                Year.add(a.date);
                System.out.printf("\n--%s ",a.date);
                
                for(int j=0;j<collection.size();j++)
                {
                    Album a1=collection.get(j);
                    
                    if(a1.date.equals(a.date))
                    {
                        if(Year.contains(a1.albumName))
                        {
                            continue;
                        }
                        else
                        {
                            Year.add(a1.albumName);
                            System.out.printf("\n%s",a1.albumName);
                        }
                    }
                }
                Year.add("\n");
                System.out.printf("\n");
            }
        }
        fileIO.fileOutputObj(Year);
    }
}
