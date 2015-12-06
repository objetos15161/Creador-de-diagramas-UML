import greenfoot.*;
import java.awt.Color;

/**
 * Write a description of class WActividades here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WActividades extends World
{
    public enum Seleccion {
        Nada,
        InicioNuevo,
        ActividadNueva,
        DesicionNueva,
        FinActividadNueva,
        FinNuevo
    }
    public Seleccion tipo;
    
    /**
     * Constructor for objects of class WActividades.
     * 
     */
    public WActividades()
    {    
       // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 600, 1); 
        BRegresar bReturn;
        MNodoInicial boton1;
        MActividad boton2;
        MDesicion boton3;
        MFinActividad boton4;
        MFinDiagrama boton5;
      
        tipo = Seleccion.Nada;
        
        bReturn = new BRegresar();
        boton1 = new MNodoInicial();
        boton2 = new MActividad();
        boton3 = new MDesicion();
        boton4 = new MFinActividad();
        boton5 = new MFinDiagrama();
     
        
        addObject(bReturn, 650, 40);
        addObject(boton1, 30, 25);
        addObject(boton2, 80, 25);
        addObject(boton3, 130, 25);
        addObject(boton4, 180, 25);
        addObject(boton5, 230, 25);
    }
     public void act() 
    { 
        if(Greenfoot.mouseClicked(this))
        {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            switch(tipo)
            {
                case InicioNuevo: //Nueva clase
                    NodoInicial ini;
                    ini = new NodoInicial();
                    addObject(ini, mouse.getX(), mouse.getY());
                    tipo = Seleccion.Nada;
                break;
                
                case ActividadNueva: //Nueva clase
                    Actividad activ;
                    activ = new Actividad();
                    addObject(activ, mouse.getX(), mouse.getY());
                    tipo = Seleccion.Nada;
                break;
                
                case DesicionNueva: //Nueva clase
                    Desicion dec;
                    dec = new Desicion();
                    addObject(dec, mouse.getX(), mouse.getY());
                    tipo = Seleccion.Nada;
                break;
                
                case FinActividadNueva: //Nueva clase
                    FinActividad fina;
                    fina = new FinActividad();
                    addObject(fina, mouse.getX(), mouse.getY());
                    tipo = Seleccion.Nada;
                break;
                
                case FinNuevo: //Nueva clase
                    FinDiagrama find;
                    find = new FinDiagrama();
                    addObject(find, mouse.getX(), mouse.getY());
                    tipo = Seleccion.Nada;
                break;

            }
        }
     }
}
