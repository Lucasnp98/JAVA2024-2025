public class Calculadora
{
    public static int sumar(int numero1, int numero2)
    {
        return numero1 + numero2;

    }
    public static int sumar(String numero1, String numero2)
    {
        return sumar(Integer.parseInt(numero1),  Integer.parseInt(numero2));

    }
}