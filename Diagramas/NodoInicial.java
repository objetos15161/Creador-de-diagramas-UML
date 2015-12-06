import greenfoot.*;

/**
 * Write a description of class NodoInicial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NodoInicial extends DActividades
{
    public NodoInicial()
    {
         //arrAcciones = new Object[] {"Opcion1", "Opcion2", "OpcionN"};
    }
    
    /**
     * Act - do whatever the NodoInicial wants to do. This method is called whenever
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
