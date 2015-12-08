import greenfoot.*;
import javax.swing.JOptionPane;
import java.util.*;

/**
 * Write a description of class Cclase here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cclase extends DClases
{
    private LinkedList<String> listaAtributos;
    private LinkedList<String> listaMetodos;
    private String nombreClase;
    
    public Cclase()
   {
         arrAcciones = new Object[] {"Nombre", "Nuevo atributo", "Nuevo metodo", "Propiedades"};
         nombreClase = "";
         listaAtributos = new LinkedList<String>();
         listaMetodos = new LinkedList<String>();
         permiteRelaciones = true;
    }
    
    /**
     * Act - do whatever the Cclase wants to do. This method is called whenever
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
                if(((WClase)getWorld()).mousePresionado)
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
                        ((WClase)getWorld()).agregaPunto(getX(), getY(), true, true);
                    else
                        ((WClase)getWorld()).agregaPunto(getX(), getY(), true, false);
                    ((WClase)getWorld()).mousePresionado = false;
                }
            }
        }
        else if(Greenfoot.mousePressed(this))
        {  
            ((WClase)getWorld()).agregaPunto(getX(), getY(), false);
            ((WClase)getWorld()).mousePresionado = true;
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
                        nombreClase = nombre;
                break;
 
                case "Nuevo atributo":
                    String atributo = JOptionPane.showInputDialog("Ingresa el atributo:");
                    if(atributo != null)
                        listaAtributos.add(atributo);
                break;
                case "Nuevo metodo":
                    String metodo = JOptionPane.showInputDialog("Ingresa el metodo:");
                    if(metodo != null)
                        listaMetodos.add(metodo);
                break;
                case "Propiedades":
                    String mensaje = "Nombre:\n" 
                    + nombreClase + "\n" 
                    + "Atributos:\n" 
                    + listaAtributos.toString() + "\n"
                    + "Metodos:\n"
                    + listaMetodos.toString() + "\n";
                    JOptionPane.showMessageDialog(null, mensaje);
                break;
             }
        }
    }
}
