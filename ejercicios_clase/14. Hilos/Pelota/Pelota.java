import java.awt.Graphics;
import java.awt.Color;

public class Pelota{

   public int x;
   public int y;
   public int diametro;
   public int velocidadx;
   public int velocidady;




    Pelota (int x, int y, int diametro, int velocidadx, int velocidady)
    {
        this.x = x;
        this.y = y;
        this.diametro = diametro;
        this.velocidadx = velocidadx;
        this.velocidady= velocidady;
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


    public int getVelocidadx() {
        return velocidadx;
    }


    public void setVelocidadx(int velocidadx) {
        this.velocidadx = velocidadx;
    }


    public int getVelocidady() {
        return velocidady;
    }


    public void setVelocidady(int velocidady) {
        this.velocidady = velocidady;
    }


    



}