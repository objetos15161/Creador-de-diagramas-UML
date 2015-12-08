import greenfoot.*;
import javax.swing.JOptionPane;
import java.util.*;

/**
 * Write a description of class CcasoUso here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CcasoUso extends DCasoUso
{
    private String casoUso;
    
    public CcasoUso()
    {
        arrAcciones = new Object[] {"Caso de Uso", "Propiedades"};
        casoUso = "";
         permiteRelaciones = true;
    }
    
    /**
     * Act - do whatever the CcasoUso wants to do. This method is called whenever
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
               case "Caso de Uso":
                    String caso = JOptionPane.showInputDialog("Ingresa el Caso de Uso:");
                    if(caso != null)
                       casoUso = caso;
                break;
                case "Propiedades":
                    String mensaje = "Caso de Uso:\n" 
                    + casoUso + "\n" ;
                    JOptionPane.showMessageDialog(null, mensaje);
                break;
             }
        }
    }
}


