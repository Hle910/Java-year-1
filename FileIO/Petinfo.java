/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petinfo;

import catstuff.cat;
/**
 *Henry Le 1001199079
 * @author Henry
 */
public class Petinfo {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    cat c=new cat();
    
    c.giveAllInfo();
    
    for(int i=0;i<3;i++)
    {
        c.addFavFood();
    }
    
    c.printOutCatInfo();
    }
    
}
