import greenfoot.*;

/**
 * Write a description of class MCasoUso here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MCasoUso extends DCasoUso
{
    /**
     * Act - do whatever the MCasoUso wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mousePressed(this))
        {
            ((WCasoUso)getWorld()).tipo = WCasoUso.Seleccion.CasoNuevo;
        }
    }
}
