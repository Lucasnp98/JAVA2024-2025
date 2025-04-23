package ui.objetos;

import util.Generador;

import java.awt.Graphics;

import ui.paneles.Tablero;

import java.awt.Color;

public class Tarta extends SpriteCaida
{
    public static final int MATERIAL_DEFAULT = -20;
    public static final int RADIO_DEFECTO = 15;
    public static final int Y_OFFSET_REBOTE = 60;

    public static final Color COLOR = Color.YELLOW;

    private int radio = RADIO_DEFECTO;

    private int yMaxima;            //Memoria del valor máximo de Y para hacer el efecto rebote 

    public Tarta(Tablero t)
    {
        super(t, Generador.generaObjetosX()-RADIO_DEFECTO*2, Generador.generaTartasY(), Generador.generaVelocidad(), MATERIAL_DEFAULT);
        this.radio = RADIO_DEFECTO;
    }

    @Override
    public int getAncho()
    {
        return radio*2;
    }

    public int getAlto()
    {
        return radio*2;
    }

    @Override
    public void pintar(Graphics g)
    {
        g.setColor(COLOR);
        g.fillOval(x, y, radio*2, radio*2);
    }

    public void mover()
    {
        super.mover();
        if(velocidad < 0)
        {
            if (y <= yMaxima)
                velocidad = -velocidad;
        }
    }

    @Override
    public void reset() 
    {
        super.reset();
        yMaxima = y = Generador.generaTartasY();
    }
    
    @Override
    public void impacto() 
    {
        yMaxima = yMaxima + Y_OFFSET_REBOTE;
        if (yMaxima > Tablero.Y_BASE - Y_OFFSET_REBOTE)         //Si ya no rebota más
            this.reset();
        else
            velocidad = -velocidad; 
    }

    @Override
    public void noImpacto() 
    {
        tablero.getBandeja().resize(MATERIAL_DEFAULT);
        this.reset();
    }    
}