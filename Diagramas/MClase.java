import greenfoot.*;

/**
 * Write a description of class MClase here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MClase extends DClases
{
    /**
     * Act - do whatever the MClase wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            ((WClase)getWorld()).tipo = WClase.Seleccion.ClaseNueva;
        }
    }    
}
