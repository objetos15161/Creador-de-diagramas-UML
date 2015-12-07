import greenfoot.*;

/**
 * Write a description of class MActividad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MActividad extends DActividades
{
    /**
     * Act - do whatever the MActividad wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mousePressed(this))
        {
            ((WActividades)getWorld()).tipo = WActividades.Seleccion.ActividadNueva;
        }
    }    
}
