import greenfoot.*;

/**
 * Write a description of class MEstado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MEstado extends DEstado
{
    /**
     * Act - do whatever the MEstado wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mousePressed(this))
        {
            ((WEstado)getWorld()).tipo = WEstado.Seleccion.EstadoNuevo;
        }
    }    
}
