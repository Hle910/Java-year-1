
import java.util.Scanner;
//Henry Le 1001199079
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Henry
 */
public class SubmitWordStart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        System.out.printf("Please enter a word:");
        String word=in.nextLine();
        char firstlettername=word.toLowerCase().charAt(0);
        
        if(firstlettername=='a'||firstlettername=='e'||firstlettername=='i'||firstlettername=='o'||firstlettername=='u')
        {
            System.out.printf("%s starts with a vowel.\n", word);
        }
        
        else if(firstlettername=='b'||firstlettername=='c'||firstlettername=='d'||firstlettername=='f'||firstlettername=='g'||firstlettername=='h'||firstlettername=='j'||firstlettername=='k'||firstlettername=='l'||firstlettername=='m'||firstlettername=='n'||firstlettername=='p'||firstlettername=='q'||firstlettername=='r'||firstlettername=='s'||firstlettername=='t'||firstlettername=='v'||firstlettername=='w'||firstlettername=='x'||firstlettername=='y'||firstlettername=='z')
        {
            System.out.printf("%s starts with a consonant.\n", word);
        }
        
        else  
        {
            System.out.printf("%s does not start with neither a vowel or consonant.", word);
        }
        
    }
    
}
