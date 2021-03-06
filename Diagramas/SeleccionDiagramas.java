import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SeleccionDiagramas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SeleccionDiagramas extends World
{

    /**
     * Constructor for objects of class SeleccionDiagramas.
     * 
     */
    public SeleccionDiagramas()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 600, 1); 
        
        Greenfoot.setSpeed(100);
        
        DCasoUso boton1 = new DCasoUso();
        DClases boton2 = new DClases();
        DComunicacion boton3 = new DComunicacion();
        DActividades boton4 = new DActividades();
        DEstado boton5 = new DEstado();

        addObject(boton1, 75, 75);
        addObject(boton2, 625, 75);
        addObject(boton3, 350, 300);
        addObject(boton4, 625, 525);
        addObject(boton5, 75, 525); 
    }
}
