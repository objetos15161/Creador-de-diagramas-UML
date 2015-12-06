import greenfoot.*;

/**
 * Write a description of class MNodoIininial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MNodoInicial extends DActividades
{
    /**
     * Act - do whatever the MNodoIininial wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            ((WActividades)getWorld()).tipo = WActividades.Seleccion.InicioNuevo;
        }
    }    
}
