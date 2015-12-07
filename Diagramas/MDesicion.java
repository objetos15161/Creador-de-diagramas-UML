import greenfoot.*;

/**
 * Write a description of class MDesicion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MDesicion extends DActividades
{
    /**
     * Act - do whatever the MDesicion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mousePressed(this))
        {
            ((WActividades)getWorld()).tipo = WActividades.Seleccion.DesicionNueva;
        }
    }    
}
