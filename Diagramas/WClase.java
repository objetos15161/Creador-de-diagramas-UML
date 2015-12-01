import greenfoot.*;
import java.awt.Color;

/**
 * Write a description of class WClase here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WClase extends World

{
    /**
     * Constructor for objects of class WClase.
     * 
     */
    public WClase()
    {    
       // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 600, 1); 
        BRegresar bReturn;
        bReturn = new BRegresar();
        
        addObject(bReturn, 650, 550);
    }
}
