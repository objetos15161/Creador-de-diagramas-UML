import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
import java.util.*;

/**
 * Write a description of class Graficos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Graficos extends Actor
{
    public LinkedList<PintaElemento> listaTemporal;
    public LinkedList<PintaElemento> listaFinal;
    
    public Graficos()
    {
        listaTemporal = new LinkedList<PintaElemento>();
        listaFinal = new LinkedList<PintaElemento>();
    }
    
    /**
     * Act - do whatever the Graficos wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        GreenfootImage image = new GreenfootImage(700, 600);
         Color c = new Color(0,0,0);
        image.clear();
        image.setColor(c);
        
        for(PintaElemento elem : listaFinal)
        {
            image.drawLine(elem.xIni, elem.yIni, elem.xFin, elem.yFin);
        }
        
        for(PintaElemento elem : listaTemporal)
        {
            image.drawLine(elem.xIni, elem.yIni, elem.xFin, elem.yFin);
        }
        
        listaTemporal.clear();
        
        setImage(image);
    }
    
    public void agregaLinea(int x1, int y1, int x2, int y2, boolean esFinal)
    {
        PintaElemento elem = new PintaElemento();
        elem.xIni = x1;
        elem.yIni = y1;
        elem.xFin = x2;
        elem.yFin = y2;
        if(esFinal)
            listaFinal.add(elem);
        else
            listaTemporal.add(elem);
    }
    
    private class PintaElemento
    {
        public int xIni, yIni, xFin, yFin;
    }
}
