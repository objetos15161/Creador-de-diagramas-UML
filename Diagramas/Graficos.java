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
            image.fillRect(elem.xFin - 4, elem.yFin - 4, 8, 8);
        }
        
        for(PintaElemento elem : listaTemporal)
        {
            image.drawLine(elem.xIni, elem.yIni, elem.xFin, elem.yFin);
            image.fillRect(elem.xFin - 4, elem.yFin - 4, 8, 8);
        }
        
        listaTemporal.clear();
        
        setImage(image);
    }
    
    public void agregaLinea(int x1, int y1, int x2, int y2, boolean esFinal)
    {
        double m;
        PintaElemento elem = new PintaElemento();
        elem.xIni = x1;
        elem.yIni = y1;
        elem.xFin = x2;
        elem.yFin = y2;
        
        if(elem.xFin - elem.xIni == 0)
            m = 1;
        else
            m = ((double)elem.yFin - (double)elem.yIni) / ((double)elem.xFin - (double)elem.xIni);
        
        if(elem.xIni > elem.xFin)
            for(int x = elem.xIni; x >= elem.xFin; x--)
            {
                int y = (int)(m * (x - elem.xFin) + elem.yFin);
                java.util.List lista = getWorld().getObjectsAt(x, y, Diagramas.class);
                if(lista.isEmpty())
                {
                    elem.xIni = x;
                    elem.yIni = y;
                    break;
                }
            }
        else if(elem.xIni < elem.xFin)
            for(int x = elem.xIni; x <= elem.xFin; x++)
            {
                int y = (int)(m * (x - elem.xFin) + elem.yFin);
                java.util.List lista = getWorld().getObjectsAt(x, y, Diagramas.class);
                if(lista.isEmpty())
                {
                    elem.xIni = x;
                    elem.yIni = y;
                    break;
                }
            }
        else
        {
            if(elem.yIni > elem.yFin)
            {
                int x = elem.xIni;
                for(int y = elem.yIni; y >= elem.yFin; y--)
                {
                    java.util.List lista = getWorld().getObjectsAt(x, y, Diagramas.class);
                    if(lista.isEmpty())
                    {
                        elem.xIni = x;
                        elem.yIni = y;
                        break;
                    }
                }
            }   
            else
            {
                int x = elem.xIni;
                for(int y = elem.yIni; y <= elem.yFin; y++)
                {
                    java.util.List lista = getWorld().getObjectsAt(x, y, Diagramas.class);
                    if(lista.isEmpty())
                    {
                        elem.xIni = x;
                        elem.yIni = y;
                        break;
                    }
                }
            }
        }
            
        if(elem.xFin > elem.xIni)
            for(int x = elem.xFin; x >= elem.xIni; x--)
            {
                int y = (int)(m * (x - elem.xIni) + elem.yIni);
                java.util.List lista = getWorld().getObjectsAt(x, y, Diagramas.class);
                if(lista.isEmpty())
                {
                    elem.xFin = x;
                    elem.yFin = y;
                    break;
                }
            }
        else if(elem.xFin < elem.xIni)
            for(int x = elem.xFin; x <= elem.xIni; x++)
            {
                int y = (int)(m * (x - elem.xIni) + elem.yIni);
                java.util.List lista = getWorld().getObjectsAt(x, y, Diagramas.class);
                if(lista.isEmpty())
                {
                    elem.xFin = x;
                    elem.yFin = y;
                    break;
                }
            }   
        else
        {
            if(elem.yFin > elem.yIni)
            {
                int x = elem.xFin;
                for(int y = elem.yFin; y >= elem.yIni; y--)
                {
                    java.util.List lista = getWorld().getObjectsAt(x, y, Diagramas.class);
                    if(lista.isEmpty())
                    {
                        elem.xFin = x;
                        elem.yFin = y;
                        break;
                    }
                }
            }   
            else
            {
                int x = elem.xFin;
                for(int y = elem.yFin; y <= elem.yIni; y++)
                {
                    java.util.List lista = getWorld().getObjectsAt(x, y, Diagramas.class);
                    if(lista.isEmpty())
                    {
                        elem.xFin = x;
                        elem.yFin = y;
                        break;
                    }
                }
            }
        }
            
        if(esFinal)
        {
            if(validaRelacion(x1, y1, x2, y2))
                listaFinal.add(elem);
        }
        else
            listaTemporal.add(elem);
    }
    
    private boolean validaRelacion(int x1, int y1, int x2, int y2)
    {
        boolean res = false, existeRelacion = false;
        java.util.List listaUno = getWorld().getObjectsAt(x1, y1, Diagramas.class);
        java.util.List listaDos = getWorld().getObjectsAt(x2, y2, Diagramas.class);
        Actor elementoUno = null;
        Actor elementoDos = null;
        
        for(PintaElemento elem : listaFinal)
        {
            if((elem.xIni == x1) && (elem.yIni == y1) && (elem.xFin == x2) && (elem.yFin == y2))
            {
                existeRelacion = true;
                break;
            }
        }
        if(!existeRelacion)
        {
            if(!listaUno.isEmpty())
            {
                elementoUno = (Actor)listaUno.get(0);
            }
            if(!listaDos.isEmpty())
            {
                elementoDos = (Actor)listaDos.get(0);
            }
            if((elementoUno != null) && (elementoUno instanceof Diagramas) && (((Diagramas)elementoUno).permiteRelaciones))
                if((elementoDos != null) && (elementoDos instanceof Diagramas) && (((Diagramas)elementoDos).permiteRelaciones))
                        res = true;
        } 
        
        return res;
    }
    
    private class PintaElemento
    {
        public int xIni, yIni, xFin, yFin;
    }
}
