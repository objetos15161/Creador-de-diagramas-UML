import greenfoot.*;

/**
 * Write a description of class FinActividad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FinDiagrama extends DActividades
{
    public FinDiagrama()
    {
         permiteRelaciones = true;
    }
    
    /**
     * Act - do whatever the FinActividad wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public void act() 
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (Greenfoot.mouseClicked(this)) { 
            if(mouse.getButton() == 3) //right-click
            {
                construyeDialogo();
            }
            else 
            {
                if(((WActividades)getWorld()).mousePresionado)
                {
                    ((WActividades)getWorld()).agregaPunto(getX(), getY(), true);
                    ((WActividades)getWorld()).mousePresionado = false;
                }
            }
        }
        else if(Greenfoot.mousePressed(this))
        {  
            ((WActividades)getWorld()).agregaPunto(getX(), getY(), false);
            ((WActividades)getWorld()).mousePresionado = true;
        }
    }
}
