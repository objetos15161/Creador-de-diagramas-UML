import greenfoot.*;
import javax.swing.JOptionPane;
import java.util.*;

/**
 * Write a description of class Ssecuencia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CComunicacion extends DComunicacion
{
    private LinkedList<String> listaObjeto;
    private String nombreDiagrama;
    
    public CComunicacion()
    {
        arrAcciones = new Object[] {"Nombre", "Objeto", "Propiedades"};
        nombreDiagrama = "";
        listaObjeto = new LinkedList<String>();
        permiteRelaciones = true;
    }
    
   /**
     * Act - do whatever the Ssecuencia wants to do. This method is called whenever
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
                if(((WComunicacion)getWorld()).mousePresionado)
                {
                    ((WComunicacion)getWorld()).agregaPunto(mouse.getX(), mouse.getY(), true);
                    ((WComunicacion)getWorld()).mousePresionado = false;
                }
            }
        }
        else if(Greenfoot.mousePressed(this))
        {  
            ((WComunicacion)getWorld()).agregaPunto(mouse.getX(), mouse.getY(), false);
            ((WComunicacion)getWorld()).mousePresionado = true;
        }
        else
            ((WComunicacion)getWorld()).agregaPunto(mouse.getX(), mouse.getY(), false);
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
                        nombreDiagrama = nombre;
                break;
                case "Objeto":
                    String objeto = JOptionPane.showInputDialog("Ingresa el Objeto:");
                    if(objeto != null)
                        listaObjeto.add(objeto);
                break;
                case "Propiedades":
                    String mensaje = "Nombre:\n" 
                    + nombreDiagrama + "\n" 
                    + "Objeto:\n" 
                    + listaObjeto.toString() + "\n";
                    JOptionPane.showMessageDialog(null, mensaje);
                break;
             }
        }
    }
}
