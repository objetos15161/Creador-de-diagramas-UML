import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WDiagramas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WDiagramas extends World
{
    public Graficos g;
    protected boolean mousePresionado;
    public int xIni, yIni, xFin, yFin;
    public GreenfootSound sonido;
    
    /**
     * Constructor for objects of class WDiagramas.
     * 
     */
    public WDiagramas()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 600, 1); 
        
        g = new Graficos();
        mousePresionado = false;
        
        sonido = new GreenfootSound("Kalimba.mp3");
        sonido.play();
    }
    
    public void agregaPunto(int x, int y, boolean esFinal)
    {
        if(!mousePresionado)
        {
            xIni = x;
            yIni = y;
        }
        else
        {
            xFin = x;
            yFin = y;
            g.agregaLinea(xIni, yIni, xFin, yFin, esFinal);
        }
    }
    
    public void agregaPunto(int x, int y, boolean esFinal, boolean relleno)
    {
        if(!mousePresionado)
        {
            xIni = x;
            yIni = y;
        }
        else
        {
            xFin = x;
            yFin = y;
            g.agregaLinea(xIni, yIni, xFin, yFin, esFinal, relleno);
        }
    }
}
