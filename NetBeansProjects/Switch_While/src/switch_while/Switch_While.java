/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switch_while;

import java.util.Scanner;

/**
 *
 * @author drewfowler17
 */
public class Switch_While {

    
    public void myScannerMethod()
    {
        Scanner console = new Scanner(System.in);
        System.out.println("Type something:");
        String word = console.nextLine();
        System.out.println("You typed: " + word);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Switch_While sw = new Switch_While();
        sw.myScannerMethod();
    }
    
}
