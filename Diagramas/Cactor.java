import greenfoot.*;
import javax.swing.JOptionPane;
import java.util.*;

/**
 * Write a description of class Cactor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cactor extends DCasoUso
{
    private String nombreActor;   
    
    public Cactor()
    {
        arrAcciones = new Object[] {"Nombre",  "Propiedades"};
        nombreActor = "";   
        permiteRelaciones = true;  
    }
    
    /**
     * Act - do whatever the Cactor wants to do. This method is called whenever
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
                if(((WCasoUso)getWorld()).mousePresionado)
                {
                    String accion = (String)JOptionPane.showInputDialog(
                        null,
                        "Selecciona el tipo de relación:\n",
                        "Tipo de relación",
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        new Object[] {"Asociacion", "Generalizacion"},
                        "Asociacion");

                    if(accion != null && accion == "Asociacion")
                        ((WCasoUso)getWorld()).agregaPunto(getX(), getY(), true, true);
                    else
                        ((WCasoUso)getWorld()).agregaPunto(getX(), getY(), true, false);
                    ((WCasoUso)getWorld()).mousePresionado = false;
                }
            }
        }
        else if(Greenfoot.mousePressed(this))
        {  
            ((WCasoUso)getWorld()).agregaPunto(getX(), getY(), false);
            ((WCasoUso)getWorld()).mousePresionado = true;
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
               case "Nombre":
                    String nombre = JOptionPane.showInputDialog("Ingresa el Nombre:");
                    if(nombre != null)
                        nombreActor = nombre;
                break;               
                case "Propiedades":
                    String mensaje = "Nombre:\n" 
                    + nombreActor + "\n" ;                    
                    JOptionPane.showMessageDialog(null, mensaje);
                break;
             }
        }
    }
}
