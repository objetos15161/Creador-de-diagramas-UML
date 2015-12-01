import greenfoot.*;

/**
 * Write a description of class DClases here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DClases extends Diagramas
{
    /**
     * Act - do whatever the DClases wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
            Greenfoot.setWorld(new WClase());  
    }    
}
