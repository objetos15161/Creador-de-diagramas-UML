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

        Greenfoot.setSpeed(100);
        BInicio boton1 = new BInicio();
        BCreditos boton2 = new BCreditos();
        BAyuda boton3 = new BAyuda();

        addObject(boton1, 150, 175);
        addObject(boton2, 350, 175);
        addObject(boton3, 550, 175);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
