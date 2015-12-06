import greenfoot.*;

/**
 * Write a description of class MFinDiagrama here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MFinDiagrama extends DActividades
{
    /**
     * Act - do whatever the MFinDiagrama wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            ((WActividades)getWorld()).tipo = WActividades.Seleccion.FinNuevo;
        }
    }    
}
