class Empresa implements Remunerable
{
    double gastos;
    double ganancias;
    int sueldo_medio_trabajador;
    int numero_trabajadores;

    Empresa(double gastos, double ganancias, int sueldo_medio_trabajador, int numero_trabajadores)
    {
        this.gastos = gastos;
        this.ganancias = ganancias;
        this.sueldo_medio_trabajador = sueldo_medio_trabajador;
        this.numero_trabajadores = numero_trabajadores;
    }


    @Override
    public double calcularBeneficio()
    {
        return this.ganancias - this.gastos - this.sueldo_medio_trabajador * this.numero_trabajadores;
    }

}