/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example_nim; 

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author drewfowler17
 */
public class NIM {
    
    int marbles = 0;
    boolean player = false;
    boolean smart = false;
    
    NIM()
    {
        Random mar = new Random();
        //Choose random number between 10 and 100 for marbles
        marbles = mar.nextInt(100)+11;
        //Chooses which player begins
        player = mar.nextBoolean();
        //Decides if the computer is smart or dumb
        smart = mar.nextBoolean();
        
        System.out.println("There are " + marbles + " marbles.");
        
        //Entry Output
        if(player == true)
                System.out.println("Player goes first.");
        else
                System.out.println("Computer goes first.");
        
        if(smart == true)
                System.out.println("Computer is smart.");
        else
                System.out.println("Computer is dumb.");
        
    }
    
    public void Play()
    {
        //Plays until marbles are gone
        while(marbles > 1)
        {
            if(player == true)
            {
                Player();
            }
            else
            {
                if(smart == true)
                {
                   Computer_Smart(); 
                }
                else
                {
                    Computer_Smart();
                }
                
            }
        }
        
        //Decides winner
        if(player == true)
        {
            System.out.println("\nPlayer takes last marble.");
            System.out.println("Computer Wins!!!");
        }
        else
        {
            System.out.println("\nComputer takes last marble.");
            System.out.println("Player Wins!!!");
        }
        
    }
    
    public void Player()
    {
        int input = 0;
        
        System.out.println("\nPlayers turn.");
        System.out.println("There are " + marbles + " left.");
        System.out.println("Choose a number between 1 and " + marbles/2);
       
        while(player == true)
        {
            //Scans for users input
            Scanner sc = new Scanner(System.in);
            input = sc.nextInt();

            if(input > marbles/2 || input == 0)
            {
                System.out.println("Number is not valid. Try again.");
            }
            if(input <= marbles/2 && input != 0)
            {
                player = false;
            }
        }
        //removes users choosen marbles
        marbles = marbles - input;

    }
    
    public void Computer_Dumb()
    {
        Random choose = new Random();
        System.out.println("\nComputers turn.");
        System.out.println("There are " + marbles + " left.");
        
        //Chooses out of half of the marbles and includes that number
        int comp_choose = (choose.nextInt(marbles / 2)) + 1;
        
        //Reduces the pile
        marbles = marbles - comp_choose;
        
        System.out.println("The computer can choose between 1 and " + marbles + ".");
        System.out.println("The computer choose " + comp_choose);
        
        //Switches players
        player = true;
        
    }
    
    public void Computer_Smart()
    {
        Random choose = new Random();
        System.out.println("\nComputers turn.");
        System.out.println("There are " + marbles + " left.");
        
        int comp_choose = 0;
        
        //Computer tries to make the pile a power of 2 minus 1
        if(marbles > 63)
        {
            if((marbles - 63) < (marbles/2))
            {
                comp_choose = marbles - 63;
            }
            else 
            {
              comp_choose = (choose.nextInt(marbles / 2)) + 1;  
            }
        }
        else if(marbles > 31)
        {
            if((marbles - 31) < (marbles/2))
            {
                comp_choose = marbles - 31;
            }
            else 
            {
              comp_choose = (choose.nextInt(marbles / 2)) + 1;  
            }
        }
        else if(marbles > 15)
        {
            if((marbles - 15) < (marbles/2))
            {
                comp_choose = marbles - 15;
            }
            else 
            {
              comp_choose = (choose.nextInt(marbles / 2)) + 1;  
            }
        }
        else if(marbles > 7)
        {
            if((marbles - 7) < (marbles/2))
            {
                comp_choose = marbles - 7;
            }
            else 
            {
              comp_choose = (choose.nextInt(marbles / 2)) + 1;  
            }
        }
        else if(marbles > 3)
        {
            if((marbles - 3) < (marbles/2))
            {
                comp_choose = marbles - 3;
            }
            else 
            {
              comp_choose = (choose.nextInt(marbles / 2)) + 1;  
            }
        }
        else
        {
            //Chooses out of half of the marbles and includes that number
            comp_choose = (choose.nextInt(marbles / 2)) + 1; 
        }


        //Reduces the pile
        marbles = marbles - comp_choose;
        
        System.out.println("The computer can choose between 1 and " + marbles + ".");
        System.out.println("The computer choose " + comp_choose);
        
        //Switches players
        player = true;
    }    
}
