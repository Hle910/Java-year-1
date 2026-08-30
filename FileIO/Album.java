/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package albummain;

/**
 *Henry Le 1001199079
 * @author Henry
 */
public class Album {
    public String band;
    public String albumName;
    public String date;
    
    public Album(String[]info)
    {
        band=info[0].trim();
        albumName=info[1].trim();
        date=info[2].trim();
    }
}
