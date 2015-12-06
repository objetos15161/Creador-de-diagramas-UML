import greenfoot.*;
import javax.swing.JOptionPane;

/**
 * Write a description of class Cclase here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cclase extends DClases
{
    public Cclase()
    {
         arrAcciones = new Object[] {"Nuevo atributo", "Nuevo metodo", "Propiedades"};
    }
    
    /**
     * Act - do whatever the Cclase wants to do. This method is called whenever
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
            switch(accion) 
            {
                case "Nuevo atributo":
                    String atributo = JOptionPane.showInputDialog("Ingresa el atributo:");
                break;
                case "Nuevo metodo":
                    String metodo = JOptionPane.showInputDialog("Ingresa el metodo:");
                break;
                case "Propiedades":
                    String mensaje = "Atributos:\n" + "[Atributos]\n" + "Metodos:\n" + "[Metodos]\n";
                    JOptionPane.showMessageDialog(null, mensaje);
                break;
            }
    }
}
