import greenfoot.*;

/**
 * Write a description of class DCasoUso here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DCasoUso extends Diagramas
{
    /**
     * Act - do whatever the DCasoUso wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    { 
        if(Greenfoot.mouseClicked(this))
            Greenfoot.setWorld(new WCasoUso()); 
    }      
}
