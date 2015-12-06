import greenfoot.*;

/**
 * Write a description of class MActor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MActor extends DCasoUso
{
    /**
     * Act - do whatever the MActor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            ((WCasoUso)getWorld()).tipo = WCasoUso.Seleccion.ActorNuevo;
        }
    }    
}
