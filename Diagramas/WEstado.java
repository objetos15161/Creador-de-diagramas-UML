import greenfoot.*;
import java.awt.Color;

/**
 * Write a description of class WEstado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WEstado extends World
{
     public enum Seleccion {
        Nada,
        EstadoNuevo
    }
    public Seleccion tipo; 
    /**
     * Constructor for objects of class WEstado.
     * 
     */
    public WEstado()
    {    
       // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 600, 1); 
        BRegresar bReturn;
        MEstado boton1;
        
        tipo = Seleccion.Nada;
        
        bReturn = new BRegresar(); 
        boton1= new MEstado();
        
        addObject(boton1, 30, 25);
        addObject(bReturn, 650, 40);
    }
    public void act() 
    { 
        if(Greenfoot.mouseClicked(this))
        {
            switch(tipo)
            {
                case EstadoNuevo: //Nueva clase
                    Eestados edo;
                    MouseInfo mouse = Greenfoot.getMouseInfo();
                    edo = new Eestados();
                    addObject(edo, mouse.getX(), mouse.getY());
                    tipo = Seleccion.Nada;
                break;
            }
        }
    }
}
