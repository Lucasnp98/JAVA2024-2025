class Arma
{

    static int MUNICION_MAX = 50;
    String nombre;
    int danio;
    double probabilidad;
    int balas;


    Arma(String nombre, int danio, double probabilidad)
    {
        this.nombre = nombre;
        this.danio = danio;
        this.probabilidad = probabilidad;
        this.balas = MUNICION_MAX;
    }



    String getInfo()
    {
        return "<" + nombre + "> " + danio + " de daño y balas: " + balas;
    }
    
    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public int getDanio() {
        return danio;
    }



    public void setDanio(int danio) {
        this.danio = danio;
    }



    public double getProbabilidad() {
        return probabilidad;
    }



    public void setProbabilidad(double probabilidad) {
        this.probabilidad = probabilidad;
    }



    public int getBalas() {
        return balas;
    }



    public void setBalas(int balas) {
        this.balas = balas;
    }

    void restar_balas()

    {
       
        this.balas -= 1;
    }




    



}