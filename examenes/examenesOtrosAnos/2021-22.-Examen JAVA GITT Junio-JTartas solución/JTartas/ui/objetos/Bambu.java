package ui.objetos;

import util.Generador;

import java.awt.Graphics;

import app.Juego;
import ui.paneles.Tablero;

import java.awt.Color;

public class Bambu extends SpriteCaida
{
    public static final int MATERIAL_DEFAULT = 20;
    public static final int LADO_DEFAULT = 30;
    public static final int Y_INICIAL = Juego.MARGENES_VERTICALES;

    public static final Color COLOR = Color.GREEN;

    private int lado;

    public Bambu(Tablero t)
    {
        super(t, Generador.generaObjetosX(), Y_INICIAL, Generador.generaVelocidad(), MATERIAL_DEFAULT);
        this.lado = LADO_DEFAULT;
    }

    public Bambu(Tablero t, int x, int vida, int velocidad, int lado)
    {
        super(t, x, Y_INICIAL, vida, velocidad);
        this.lado = lado;
    }

    @Override
    public int getAncho()
    {
        return lado;
    }

    public int getAlto()
    {
        return lado;
    }

    @Override
    public void pintar(Graphics g)
    {
         g.setColor(COLOR);
         g.fillRect(x, y, lado, lado);
    }

    @Override
    public void reset() 
    {
        super.reset();
        y = Y_INICIAL;
    }

    @Override
    public void impacto() {
        this.reset();
        tablero.getBandeja().resize(MATERIAL_DEFAULT);
    }
    
    @Override
    public void noImpacto() 
    {
        //Nothing! No tiene efecto cuando no impacta con la bandeja.    
    }

}