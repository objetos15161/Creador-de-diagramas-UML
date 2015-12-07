import greenfoot.*;
import javax.swing.JOptionPane;
import java.util.*;

/**
 * Write a description of class Desicion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Desicion extends DActividades
{
   private String desicion;
    
   public Desicion()
   {
       arrAcciones = new Object[] {"Desicion", "Propiedades"};
       desicion = "";
       permiteRelaciones = true;
   }
    
    /**
     * Act - do whatever the Desicion wants to do. This method is called whenever
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
     /**
     * Hold a dialog with the user.
     */
    public void construyeDialogo()
    {
        String accion;
        
        accion = (String)JOptionPane.showInputDialog(
            null,
            "Selecciona una opción:\n",
            "Seleccion de acción",
            JOptionPane.PLAIN_MESSAGE,
            null,
            arrAcciones,
            "Propiedades");
        if(accion != null)
        {
            switch(accion)
            {
               case "Desicion":
                    String nombre = JOptionPane.showInputDialog("Ingresa la desicion:");
                    if(nombre != null)
                        desicion = nombre;
                break; 
                case "Propiedades":
                     String mensaje = "Desicion:\n" 
                    + desicion + "\n";
                    JOptionPane.showMessageDialog(null, mensaje);
                break;
             }
        }
    }
}
