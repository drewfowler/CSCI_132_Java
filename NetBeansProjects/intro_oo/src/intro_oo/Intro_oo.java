/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro_oo;

import java.util.Random;

/**
 *
 * @author drewfowler17
 */
public class Intro_oo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SecondClass xclass;
        xclass = new SecondClass(77);
        
        SecondClass yclass = new SecondClass(-22);
        int answer = yclass.getX();
        
        //System.out.println(answer);
        //System.out.println(xclass.getX());
        
        //CTRL + SHFT + i 
        //This automatically imports the correct library for the method
        Random ran = new Random();
        for(int i = 0; i<100;i++)
        {
            int var = ran.nextInt(100) + 1; //Makes 100 inclusive
            System.out.println(var);
        }
        
        
    }
    
}
