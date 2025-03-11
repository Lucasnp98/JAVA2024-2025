public class Trabajador extends Persona implements Remunerable
{

    int sueldo_bruto;
    double porcentaje;

    Trabajador(String nombre, String dni, int sueldo_bruto, double porcentaje)
    {
        super(nombre, dni);
        this.sueldo_bruto = sueldo_bruto;
        this.porcentaje = porcentaje;
    }


    @Override
    String getInfo()
    {
        return super.getInfo() + "Sueldo: " + this.sueldo_bruto;
    }

    @Override
    double calculaBeneficio()
    {
        return this.sueldo_bruto * this.porcentaje;
    }






    


}