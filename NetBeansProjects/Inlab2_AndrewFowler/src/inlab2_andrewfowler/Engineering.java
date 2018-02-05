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


public class Engineering {
    
    int width;
    int length;
    //Constructor for Rectangle
    Engineering(int x, int y)
    {
       width = x;
       length = y;
    }
    
    //Constructor for Circle
    Engineering(int x)
    {
       length = x;
       width = 0;
    } 
    
    
    
    public void changeLength(int x)
    {
        if(length < 0)
        {
            System.out.println("This is invalid data.")
        }
        else
        {
            length = x;
        }
    }
    
    public int circle()
    {
        int area = 3*length*length;
        System.out.println("Circle Area: " + area);
        return area;
    }

    public int rect()
    {
        if(width == 0)
        {
            System.out.println("Can't comnpute rect of a circle.");
            return 0;
        }
        else
        {
            int area = width*length;
            System.out.println("Rect Area: " + area);
            return area;
        }
    }
    
}
