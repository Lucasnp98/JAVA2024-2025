import java.util.HashMap;

public class Coche
{
    private String marca;
    private int potencia;

    public Coche(String marca, int potencia)
    {
        this.marca = marca;
        this.potencia = potencia;
    }
    
    public int getPotencia()
    {
        return potencia;
    }

    public String toString()
    {
        return marca + potencia;
    }
}
