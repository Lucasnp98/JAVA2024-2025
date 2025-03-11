class Empresa implements Remunerable
{
    double beneficio;
    int numero_trabajadores;
    double sueldo_medio;

    Empresa(double beneficio, int numero_trabajadores, double sueldo_medio)
    {
        this.beneficio = beneficio;
        this.numero_trabajadores = numero_trabajadores;
        this.sueldo_medio = sueldo_medio;
        
    }

    @Override
    double calculaBeneficio()
    {
        return this.beneficio - this.sueldo_medio * this.numero_trabajadores;
    }
}