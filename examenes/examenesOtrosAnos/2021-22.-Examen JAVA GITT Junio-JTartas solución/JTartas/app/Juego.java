package app;

import ui.paneles.Tablero;

import javax.swing.JFrame;

public class Juego extends JFrame
{
    public final static int ANCHO = 600;
    public final static int ALTO = 800;

    public final static int MARGENES_HORIZONTALES = 50;
    public final static int MARGENES_VERTICALES = 100;

    public Juego()
    {
        this.add(new Tablero());

        this.setTitle("JTartas");
        this.setSize(ANCHO, ALTO);

        this. setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args)
    {
        new Juego().setVisible(true);
    }
}
