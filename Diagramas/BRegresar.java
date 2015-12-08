import greenfoot.*;

/**
 * Write a description of class BRegresar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BRegresar extends Actor
{
    /**
     * Act - do whatever the BRegresar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    { 
        if(Greenfoot.mouseClicked(this))
        {
            try
            {
                ((WDiagramas)(getWorld())).sonido.stop();
            }
            catch(Exception ex){};
            Greenfoot.setWorld(new Menu());  
        }
    }   
}
