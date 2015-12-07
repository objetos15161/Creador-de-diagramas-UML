import greenfoot.*;
import java.awt.Color;

/**
 * Write a description of class WCasoUso here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WCasoUso extends WDiagramas
{
    public enum Seleccion {
        Nada,
        ActorNuevo,
        CasoNuevo 
    }
     public Seleccion tipo; 
    /**
     * Constructor for objects of class WCasoUso.
     * 
     */
    public WCasoUso()
    {    
       // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        BRegresar bReturn;
        bReturn = new BRegresar();
        MActor boton1;
        MCasoUso boton2;
        
        tipo = Seleccion.Nada;
     
        bReturn = new BRegresar();
        boton1 = new MActor();
        boton2 = new MCasoUso();
         
        addObject(g, 350, 300);
        addObject(boton1, 30, 25);
        addObject(boton2, 80, 25);
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
                case ActorNuevo: //Nueva clase
                    Cactor actor;
                    actor = new Cactor();
                    addObject(actor, mouse.getX(), mouse.getY());
                    tipo = Seleccion.Nada;
                break;
                
               case CasoNuevo: //Nueva clase
                    CcasoUso caso;
                    caso = new CcasoUso();
                    addObject(caso, mouse.getX(), mouse.getY());
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
