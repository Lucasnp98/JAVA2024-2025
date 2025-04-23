    package util;

import app.Juego;

public class Generador
{
    public static int generaX(int min, int max)
    {
        double d = Math.random();
        d = d * (max - min) + min;
        return (int) d;
    }   

    public static int generaObjetosX()
    {
        double d = Math.random();
        d = d * ((Juego.ANCHO - Juego.MARGENES_HORIZONTALES) - Juego.MARGENES_HORIZONTALES) + Juego.MARGENES_HORIZONTALES;
        return (int) d;
    }          
    
    public static int generaTartasY()
    {
        double d = Math.random();
        d = d * (((Juego.ALTO - Juego.MARGENES_VERTICALES) / 3) - Juego.MARGENES_VERTICALES) + Juego.MARGENES_VERTICALES;
        return (int) d;
    }          

    public static int generaVelocidad()
    {
        return (int) generaX(1, 4);
    }
}
