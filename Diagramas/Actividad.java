import greenfoot.*;
import javax.swing.JOptionPane;
import java.util.*;

/**
 * Write a description of class Actividad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Actividad extends DActividades
{
    private LinkedList<String> listaActividad;
    
    public Actividad()
    {
         arrAcciones = new Object[] {"Nueva Actividad", "Propiedades"};
         listaActividad = new LinkedList<String>();
         permiteRelaciones = true;
    }
    
    /**
     * Act - do whatever the Actividad wants to do. This method is called whenever
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
                case "Nueva Actividad":
                    String actividad = JOptionPane.showInputDialog("Ingresa la Actividad:");
                    if(actividad != null)
                        listaActividad.add(actividad);
                break;
           
                case "Propiedades":
                    String mensaje = "Actividad:\n"
                    + listaActividad.toString() + "\n";
                    JOptionPane.showMessageDialog(null, mensaje);
                break;
             }
        }
    }
}

