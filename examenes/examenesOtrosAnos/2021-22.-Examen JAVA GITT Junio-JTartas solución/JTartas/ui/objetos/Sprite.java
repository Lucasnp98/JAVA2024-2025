package ui.objetos;

import java.awt.Graphics;
import java.awt.Rectangle;

import ui.paneles.Tablero;

public abstract class Sprite
{
    protected Tablero tablero;
    
    protected int x;
    protected int y;
    protected int velocidad;

    protected boolean visible;

    public Sprite(Tablero t, int x, int y, int velocidad)
    {
        this.tablero = t;
        this.x = x;
        this.y = y;
        this.velocidad = velocidad;
        this.visible = true;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public Rectangle getRectangulo()
    {
        return new Rectangle(x, y, this.getAncho(), this.getAlto());
    }

    public boolean isVisible()
    {
        return visible;
    }

    public void setVisible(boolean visible)
    {
        this.visible = visible;
    }

    public abstract int getAncho();
    public abstract int getAlto();
    public abstract void pintar(Graphics g);
}
