public class Calculadora_Impuestos
{
static int IRPF = 21;

    double calculaSueldoNeto(double sueldo)
    {
        return sueldo - (sueldo * IRPF) / 100;

    }

    double calculaSueldoNeto(double sueldo, double bonus)
    {
        return calculaSueldoNeto(sueldo)  + bonus; 
    }
    double calculaSueldoNeto(double sueldo, double bonus, double deducciones)
    {
        return calculaSueldoNeto(sueldo - deducciones);
    }
    
}