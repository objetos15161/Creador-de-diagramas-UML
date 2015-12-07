import greenfoot.*;

/**
 * Write a description of class MSecuencia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MComunicacion extends DComunicacion
{
    /**
     * Act - do whatever the MSecuencia wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         if(Greenfoot.mousePressed(this))
        {
            ((WComunicacion)getWorld()).tipo = WComunicacion.Seleccion.ComunicacionNueva;
        }
    }    
}
