import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.awt.Rectangle;


public class Pelota extends Elemento
{
   
    final int RADIO = 30;
    final int VX = 10;
    final int VY = 10;
    int vx;
    int vy;
    int radio;
    private boolean haTocadoSuelo = false;
    public Pelota(int x, int y,Color color,  int radio)
    {   
        super(x,y, color);
        this.radio = RADIO;
        this.vx = VX;
        this.vy = VY;      
    }
   
    public int getRadio() {
        return radio;
    }
    public void setRadio(int radio) {
        this.radio = radio;
    }
    public int getVx() {
        return vx;
    }
    public void setVx(int vx) {
        this.vx = vx;
    }
    public int getVy() {
        return vy;
    }
    public void setVy(int vy) {
        this.vy = vy;
    }


    
    public void checkeaColisiones(int ancho, int largo, Raqueta raqueta, ArrayList<Ladrillo> ladrillos)
    {
       colision_bordes(ancho, largo);
       colision_raqueta(raqueta);
       colision_ladrillos(ladrillos);  
        
    }
    

    public void colision_ladrillos(ArrayList<Ladrillo> ladrillos)
    {
        for (int i = 0; i < ladrillos.size(); i++) {
            Ladrillo ladrillo = ladrillos.get(i);
            if (ladrillo.checkeaColision(this)) {
                // Rebota la pelota
                this.vy = -vy;
                // Eliminar el ladrillo de la lista
                ladrillos.remove(i);     
            }
        }
    }

    public void colision_raqueta(Raqueta raqueta) {
        Rectangle pelotaRect = this.getRect();
        Rectangle raquetaRect = raqueta.getRect();
        if (pelotaRect.intersects(raquetaRect) && this.vy > 0) {
            this.vy = -this.vy; 
        }
    }
    

    @Override
    public Rectangle getRect() {
        return new Rectangle(this.x, this.y, this.radio * 2, this.radio * 2);
    }

    public boolean haTocadoSuelo() {
        return haTocadoSuelo;
    }

    public void colision_bordes(int ancho, int largo)
    {
        if (this.x + radio > ancho || this.x < 0) {
            this.vx = -vx;
        }
    
        if (this.y < 0) {
            this.vy = -vy;
        }
    
        if (this.y + radio > largo) {
            this.vy = -vy;
            this.haTocadoSuelo = true;
            System.out.println("Has chocado con el suelo");
        }
    }
    
    public void mover()
    {
        this.x += vx;
        this.y += vy;
    }
    public void pintar(Graphics g)
    {
        super.pintar(g);
        g.fillOval(this.getX(), this.getY(), this.getRadio(), this.getRadio());
        
    }
   
}