import java.lang.Math;
class Personaje
{
    static int VIDA_MAX = 100;
    static int VIDA_MIN = 0;


    String nombre;
    int vida;
    Arma arma; 

    
    Personaje(String nombre, Arma arma, int vida)
    {
        this(nombre, arma);
        setVida(vida);
    }

    Personaje(String nombre, Arma arma)
    {
        this.nombre = nombre;
        this.arma = arma;
        this.vida = VIDA_MAX;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {

        if (vida >= VIDA_MIN && vida <= VIDA_MAX) 
        {
            this.vida = vida;
        }
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }


    String getInfo()
    {
        return nombre + " <" + "(" + vida + ")> "  + arma.getInfo();

    }


    void herir(int danio_arma)
    {
        this.vida -=  danio_arma;
    }



    void disparar(Personaje p)
    {
        double random = Math.random();

        if (random < arma.getProbabilidad())
        {
            p.herir(arma.getDanio());
        }
        this.arma.restar_balas();
    }

   


}