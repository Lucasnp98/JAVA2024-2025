import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class PanelJuego extends JPanel{

 

    
   Pelota pelota;
  






    public PanelJuego()
    {
        this.setBackground(Color.WHITE);

        
        this.pelota = new Pelota(200,300,30);
        


    }




   

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        pelota.pintar(g);

       
    
      
        
        

    }


    

    
}