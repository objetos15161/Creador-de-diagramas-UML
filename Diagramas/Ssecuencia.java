import greenfoot.*;

/**
 * Write a description of class Ssecuencia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ssecuencia extends DSecuencia
{
    public Ssecuencia()
    {
         //arrAcciones = new Object[] {"Opcion1", "Opcion2", "OpcionN"};
    }
    
    /**
     * Act - do whatever the Ssecuencia wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mousePressed(this)) {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            
            if(mouse.getButton() == 3) //right-click
            {
                construyeDialogo();
            }
        }
    }  
}
