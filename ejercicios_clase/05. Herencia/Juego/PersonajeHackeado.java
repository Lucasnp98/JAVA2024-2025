import java.util.Arrays;
class PersonajeHackeado extends Personaje
{
    String trucos;
    PersonajeHackeado(String nombre, Arma arma, String trucos)
    {
        super(nombre, arma);
        this.trucos = trucos;

    }

    

    void addTruco(String truco)
    {
        this.trucos += ";" + truco;
    }
    



    String getInfo()
    {
        return super.getInfo() + " Trucos: " + trucos;
    }


    boolean contiene_truco(String truco)
    {
        String[] trucos_split = trucos.split(";");
        return Arrays.asList(trucos_split).contains(truco);
    }
    @Override
void disparar(Personaje p) {
    boolean aimbotActivo = contiene_truco("AIMBOT");

    boolean acierta = aimbotActivo || Math.random() < arma.getProbabilidad();

    if (acierta) {
        if (contiene_truco("MAXIMODAÑO")) {
            p.herir(VIDA_MAX); // Mata instantáneamente
        } else {
            p.herir(arma.getDanio());
        }
    }
    if (!contiene_truco("MUNICIONINFINITA")) {
        arma.restar_balas();
    }
}

    

}