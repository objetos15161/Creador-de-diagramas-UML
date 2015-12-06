import greenfoot.*;
import java.awt.Color;

/**
 * Write a description of class WClase here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WClase extends World
{
    public enum Seleccion {
        Nada,
        ClaseNueva 
    }

    public Seleccion tipo; 
    /**
     * Constructor for objects of class WClase.
     * 
     */
    public WClase()
    {    
       // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 600, 1); 
        BRegresar bReturn;
        MClase boton1;
        
        tipo = Seleccion.Nada;
     
        bReturn = new BRegresar();
        boton1 = new MClase();
       
        addObject(boton1, 30, 25); 
        addObject(bReturn, 650, 40);
        
    }
     public void act() 
    { 
        if(Greenfoot.mouseClicked(this))
        {
            switch(tipo)
            {
                case ClaseNueva: //Nueva clase
                    Cclase clase;
                    MouseInfo mouse = Greenfoot.getMouseInfo();
                    clase = new Cclase();
                    addObject(clase, mouse.getX(), mouse.getY());
                    tipo = Seleccion.Nada;
                break;
            }
        }
              
    }
}
