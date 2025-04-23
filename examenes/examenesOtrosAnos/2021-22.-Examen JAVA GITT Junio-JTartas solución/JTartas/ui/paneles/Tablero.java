package ui.paneles;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JPanel;

import app.Juego;
import ui.objetos.Bambu;
import ui.objetos.Bandeja;
import ui.objetos.SpriteCaida;
import ui.objetos.Tarta;

public class Tablero extends JPanel implements Runnable
{
    public static final int Y_BASE = Juego.ALTO - Juego.MARGENES_VERTICALES;
    public static final int NUMERO_TARTAS = 3;
    public static final int NUMERO_BAMBU = 1;

    /** Valor por defecto 60 FPS */
    private int fps = 60;

    //Elementos del juego
    private ArrayList<SpriteCaida> objetosCayendo;
    private Bandeja bandeja;

    public Tablero()
    {
        this.setBackground(Color.BLACK);
        this.setFocusable(true);

        this.init();

        this.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyPressed(KeyEvent e)
            {
                bandeja.keyPressed(e);
            }
        });

        Thread hilo = new Thread(this);
        hilo.start();
    }

    public Bandeja getBandeja()
    {
        return bandeja;
    }

    private void init()
    {
        objetosCayendo = new ArrayList<>();
        bandeja = new Bandeja(this);
        for(int i=0;i<NUMERO_TARTAS;i++)
            objetosCayendo.add(new Tarta(this));
        for(int i=0;i<NUMERO_BAMBU;i++)
            objetosCayendo.add(new Bambu(this));
    }

    /** En milisegundos */
    private int calcularDelay()
    {
        return (int) (1/(fps*1.)*1000);
    }

    @Override
    public void run()
    {
        while(bandeja.isViva())
        {
            try
            {
                Thread.sleep(this.calcularDelay());
                objetosCayendo.forEach(objeto ->
                {
                    objeto.mover();
                    if(bandeja.checkImpacto(objeto))
                        objeto.impacto();
                    else if(objeto.isZonaImpacto())
                        objeto.noImpacto();
                });
                this.repaint();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        this.repaint();
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        if(bandeja.isViva()) {
            objetosCayendo.forEach(objeto -> objeto.pintar(g));
            bandeja.pintar(g);
        }
        else{
            g.setColor(Color.RED);
            g.setFont(new Font("Arial", Font.PLAIN, 30));
            String texto = "GAME OVER";
            g.drawString(texto, Juego.ANCHO/2 - texto.length()/2*20, Juego.ALTO/2);
        }
    }
}
