package ui.objetos;

import ui.paneles.Tablero;
import util.Generador;

public abstract class SpriteCaida extends Sprite
{
    private int material;

    public SpriteCaida(Tablero tablero, int x, int y, int velocidad, int material)
    {
        super(tablero, x, y, velocidad);
        this.material = material;
    }

    public void mover()
    {
        y += velocidad;
        if(velocidad > 0)
            if (y > Tablero.Y_BASE)
                this.reset();
    }

    public void reset()
    {
        x = Generador.generaObjetosX();
        velocidad = Generador.generaVelocidad();
    }

    public int getMaterial() 
    {
        return material;
    }

    public boolean isZonaImpacto() 
    {
        return y > Tablero.Y_BASE - this.getAlto();     //Comprueba si el objeto está en la posible zona Y de impacto.
    }

    public abstract void impacto();                     //Acción a ejecutar en caso de impacto
    public abstract void noImpacto();                   //Acción a ejecutar en caso de NO impacto
}
