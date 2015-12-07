import greenfoot.*;
import java.awt.Color;

/**
 * Write a description of class WEstado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WEstado extends WDiagramas
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
       
        BRegresar bReturn;
        MEstado boton1;
        
        tipo = Seleccion.Nada;
        
        bReturn = new BRegresar(); 
        boton1= new MEstado();
        
        addObject(g, 350, 300);
        addObject(boton1, 30, 25);
        addObject(bReturn, 650, 40);
    }
    public void act() 
    { 
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(Greenfoot.mouseClicked(g))
        {
            mousePresionado = false;
            switch(tipo)
            {
                case EstadoNuevo: //Nueva clase
                    Eestados edo;
                    edo = new Eestados();
                    addObject(edo, mouse.getX(), mouse.getY());
                    tipo = Seleccion.Nada;
                break;
            }
        }
        else if(Greenfoot.mousePressed(g))
        {  
            agregaPunto(mouse.getX(), mouse.getY(), false);
            mousePresionado = true;
        }
        else
            agregaPunto(mouse.getX(), mouse.getY(), false);
    }
}
