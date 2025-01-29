public class Calculadora
{
    int calcula_suma(int numero1, int numero2)
    {
        return numero1 + numero2;
    }


    int calcula_suma(String numero1, String numero2)
    {


        
        //DRY 
        return calcula_suma(Integer.parseInt(numero1), Integer.parseInt(numero2));

    }

    
}