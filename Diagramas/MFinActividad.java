import greenfoot.*;

/**
 * Write a description of class MFinActividad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MFinActividad extends DActividades
{
    /**
     * Act - do whatever the MFinActividad wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mousePressed(this))
        {
            ((WActividades)getWorld()).tipo = WActividades.Seleccion.FinActividadNueva;
        }
    }    
}
