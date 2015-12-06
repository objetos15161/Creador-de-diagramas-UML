import greenfoot.*;
import java.awt.Color;


/**
 * Write a description of class WSecuencia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WSecuencia extends World
{
     public enum Seleccion {
        Nada,
        SecuenciaNueva; 
    }

    public Seleccion tipo;  
    /**
     * Constructor for objects of class WSecuencia.
     * 
     */
    public WSecuencia()
    {    
       // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 600, 1); 
        BRegresar bReturn;
        MSecuencia boton1;
        
        tipo = Seleccion.Nada;
        
        boton1 = new MSecuencia();
        bReturn = new BRegresar();
        
        addObject(boton1, 30, 25);    
        addObject(bReturn, 650, 40 );
    }
    public void act() 
     { 
        if(Greenfoot.mouseClicked(this))
        {
            switch(tipo)
            {
                case SecuenciaNueva: //Nueva clase
                    Ssecuencia sec ;
                    MouseInfo mouse = Greenfoot.getMouseInfo();
                    sec = new Ssecuencia();
                    addObject(sec, mouse.getX(), mouse.getY());
                    tipo = Seleccion.Nada;
                break;
            }
        }
    }
}
