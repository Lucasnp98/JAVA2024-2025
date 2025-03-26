import java.awt.Graphics;
import java.awt.Color;

public class Pelota{

   public int x;
   public int y;
   public int diametro;





    Pelota (int x, int y, int diametro)
    {
        this.x = x;
        this.y = y;
        this.diametro = diametro;
      
    }


    public void  pintar(Graphics g)
    {

        g.setColor(Color.RED);
        g.fillOval(x, y, diametro, diametro);


    }


    public int getX() {
        return x;
    }


    public void setX(int x) {
        this.x = x;
    }


    public int getY() {
        return y;
    }


    public void setY(int y) {
        this.y = y;
    }


    public int getDiametro() {
        return diametro;
    }


    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }




    



}