import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class PanelJuego extends JPanel implements Runnable{

 

    ArrayList<Pelota> pelotas = new ArrayList<Pelota>();
  






    public PanelJuego()
    {
        this.setBackground(Color.WHITE);
        
        
       


    }




    public void add_pelota(Pelota p)
    {
        pelotas.add(p);
    }
    

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        for (Pelota p:pelotas)
        {
        p.pintar(g);
        }
        

    }


    
    public ArrayList<Pelota> getPelotas() {
        return pelotas;
    }




    public void setPelotas(ArrayList<Pelota> pelotas) {
        this.pelotas = pelotas;
    }



    public void check_colisiones(Pelota p)
    {
        p.x += p.velocidadx;
        p.y += p.velocidady;
        if (p.x + p.diametro > getWidth() || p.x < 0)
        {
            
            p.velocidadx = - p.velocidadx;
        }
        if (p.y + p.diametro > getHeight() || p.y < 0)
        {
            p.velocidady =  -p.velocidady;
        }

    }

    @Override 
    public void run(){
        System.out.println("Hilo empezado");

        while (true)
        {

            for (Pelota p:pelotas)
            {
           
                check_colisiones(p);xº


        }
           


            try {
                Thread.sleep(50); // Controla la velocidad del movimiento
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            this.repaint();
        }

    }

    
}