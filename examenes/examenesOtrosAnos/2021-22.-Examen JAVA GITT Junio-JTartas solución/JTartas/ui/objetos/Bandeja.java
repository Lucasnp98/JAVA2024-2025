package ui.objetos;

import ui.paneles.Tablero;

import java.awt.*;
import java.awt.event.KeyEvent;

import app.Juego;

public class Bandeja extends Sprite
{
    public static final int X_INICIAL = (int) (Juego.ANCHO/2);
    public static final int ANCHO_DEFAULT = 80;
    public static final int ALTO_DEFAULT = 20;
    public static final int Y_INICIAL = Tablero.Y_BASE;
    public static final int VELOCIDAD_DEFAULT = 20;     //Se desplaza 5px cada pulsación

    public static final int ANCHO_MINIMO = 40;
    public static final int ANCHO_MAXIMO = ANCHO_DEFAULT*3      ;

    private int ancho;
    private int alto;

    public Bandeja(Tablero t, int x, int y, int velocidad, int ancho, int alto)
    {
        super(t, x, y, velocidad);
        this.ancho = ancho;
        this.alto = alto;
    }

    public Bandeja(Tablero t)
    {
        this(t, X_INICIAL, Y_INICIAL, VELOCIDAD_DEFAULT, ANCHO_DEFAULT, ALTO_DEFAULT);
    }

    @Override
    public int getAncho()
    {
        return ancho;
    }

    public int getAlto()
    {
        return alto;
    }

    @Override
    public void pintar(Graphics g)
    {
         g.setColor(Color.WHITE);
         g.drawRect(x, y, ancho, alto);
    }

    public void moveX(int deltaX)
    {
        x += deltaX;
        if (x > Juego.ANCHO - ancho - Juego.MARGENES_HORIZONTALES)
            x = Juego.ANCHO - ancho - Juego.MARGENES_HORIZONTALES;
        else if (x < Juego.MARGENES_HORIZONTALES)
            x = Juego.MARGENES_HORIZONTALES;            
    }


    public void keyPressed(KeyEvent e)
    {
        switch(e.getKeyCode())
        {
            case KeyEvent.VK_A -> this.moveX(-velocidad);
            case KeyEvent.VK_D -> this.moveX(velocidad);        
        }
    }

    public boolean checkImpacto(SpriteCaida sprite)
    {
        return this.getRectangulo().intersects(sprite.getRectangulo());
    }

    public boolean isViva()
    {
        return ancho >= ANCHO_MINIMO;
    }

    public void resize(int deltaAncho) 
    {
        if(ancho + deltaAncho >= ANCHO_MAXIMO)
            ancho = ANCHO_MAXIMO;
        else
        {        
            ancho = ancho + deltaAncho;
            x = (int) (x - deltaAncho/2.);
        }
    }
}