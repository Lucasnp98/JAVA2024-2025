class PersonajePago extends Personaje
{

    int creditos;
    PersonajePago(String nombre, Arma arma, int vida, int creditos)
    {
        super(nombre, arma, vida);
        this.creditos = creditos;
    }
    PersonajePago(String nombre, Arma arma, int creditos)
    {
        super(nombre, arma);
        this.creditos = creditos;
    }



    @Override
    String getInfo()
    {
        return super.getInfo() + "Creditos: " + creditos;
    }

    


}