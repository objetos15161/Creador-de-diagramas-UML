import greenfoot.*;

/**
 * Write a description of class WSecuencia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WSecuencia extends World
{

    /**
     * Constructor for objects of class WSecuencia.
     * 
     */
    public WSecuencia()
    {    
       // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 600, 1); 
        BRegresar bReturn;
        bReturn = new BRegresar();
        
        addObject(bReturn, 650, 550);
    }
}
