import java.awt.Graphics;

import javax.swing.JPanel;

public class PanelJuego extends JPanel implements Runnable{


    private Pelota pelota;
    private Raqueta raqueta;
    private boolean izquierdaPresionada = false;
    private boolean derechaPresionada = false;
    
    


    public Pelota getPelota() {
        return pelota;
    }


    public void setPelota(Pelota pelota) {
        this.pelota = pelota;
    }


    public Raqueta getRaqueta() {
        return raqueta;
    }


    public void setRaqueta(Raqueta raqueta) {
        this.raqueta = raqueta;
    }


    PanelJuego()
    {
        super();
        this.pelota = new Pelota(100,100,30);
        this.raqueta = new Raqueta(300, 300 );
    }



    public boolean isIzquierdaPresionada() {
        return izquierdaPresionada;
    }


    public void setIzquierdaPresionada(boolean izquierdaPresionada) {
        this.izquierdaPresionada = izquierdaPresionada;
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        pelota.pintar(g);
        raqueta.pintar(g);
    }


    public boolean isDerechaPresionada() {
        return derechaPresionada;
    }


    public void setDerechaPresionada(boolean derechaPresionada) {
        this.derechaPresionada = derechaPresionada;
    }


    @Override
    public void run()
    {
        while (true)
        {
            pelota.mover();

            pelota.checkeaColisiones(getWidth(), getHeight(), raqueta);


            if (derechaPresionada)
            {
                System.out.println("Derecha presionada");
                raqueta.moverDerecha();

               
            }
            if (izquierdaPresionada)
            {
                raqueta.moverIzquierda();
               
            }
            

            
            try {
                Thread.sleep(40); // ~60 FPS
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            this.repaint();
        }

        
    }






  
    
}