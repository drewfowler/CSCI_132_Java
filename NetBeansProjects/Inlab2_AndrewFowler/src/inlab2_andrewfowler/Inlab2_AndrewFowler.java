/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inlab2_andrewfowler;

/**
 *
 * @author h92j874
 */
public class Inlab2_AndrewFowler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Engineering r = new Engineering(6, 7);
        Engineering c = new Engineering(7);
        
        c.changeLength(4);
        int answer = c.circle();
        
        r.changeLength(-5);
        int secondAnswer = r.rect();
        
        int thirdAnswer = c.rect(); //this will print out an error
    }
    
}
