import greenfoot.*;
import javax.swing.JOptionPane;
import java.util.*;

/**
 * Write a description of class Eestados here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Eestados extends DEstado
{
    private LinkedList<String> listaDescripcion;
    private String nombreEstado;
    
    public Eestados()
    {
         arrAcciones = new Object[] {"Nombre", "Nueva Descripcion", "Propiedades"};
         nombreEstado = "";
         listaDescripcion = new LinkedList<String>();
    }
   
    /**
     * Act - do whatever the Eestados wants to do. This method is called whenever
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
                if(((WEstado)getWorld()).mousePresionado)
                {
                    ((WEstado)getWorld()).agregaPunto(mouse.getX(), mouse.getY(), true);
                    ((WEstado)getWorld()).mousePresionado = false;
                }
            }
        }
        else if(Greenfoot.mousePressed(this))
        {  
            ((WEstado)getWorld()).agregaPunto(mouse.getX(), mouse.getY(), false);
            ((WEstado)getWorld()).mousePresionado = true;
        }
        else
            ((WEstado)getWorld()).agregaPunto(mouse.getX(), mouse.getY(), false);
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
                    String nombre = JOptionPane.showInputDialog("Ingresa el atributo:");
                    if(nombre != null)
                        nombreEstado = nombre;
                break;
                case "Nueva Descripcion":
                    String descripcion = JOptionPane.showInputDialog("Ingresa la descripcion:");
                    if(descripcion != null)
                        listaDescripcion.add(descripcion);
                break;
                case "Propiedades":
                    String mensaje = "Nombre:\n" 
                    + nombreEstado + "\n" 
                    + "Descripcion:\n" 
                    + listaDescripcion.toString() + "\n";
                    JOptionPane.showMessageDialog(null, mensaje);
                break;
             }
        }
    }
}


