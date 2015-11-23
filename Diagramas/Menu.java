import greenfoot.*;

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{

    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 600, 1); 
        
        DCasoUso boton1 = new DCasoUso();
        DClases boton2 = new DClases();
        DSecuencia boton3 = new DSecuencia();
        DActividades boton4 = new DActividades();
        DEstado boton5 = new DEstado();
        
        addObject(boton1, 75, 75);
        addObject(boton2, 625, 75);
        addObject(boton3, 75, 525);
        addObject(boton4, 625, 525);
        addObject(boton5, 350, 300);
    }
}
