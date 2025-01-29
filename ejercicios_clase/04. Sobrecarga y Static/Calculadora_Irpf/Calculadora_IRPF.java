public class Calculadora_IRPF
{

    static int porcentaje = 21; 
   
    

    
    double calcula_sueldo(int sueldo_bruto)
    {

        return calcula_sueldo(sueldo_bruto, 0);

    }

    double calcula_sueldo(int sueldo_bruto, int bonus)
    {
        return  sueldo_bruto * (100 - porcentaje) * 0.01 + bonus;
    }



    

    
}