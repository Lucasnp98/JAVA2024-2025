public class App
{
    public static void main(String [] args)
    {
        Calculadora_Impuestos c = new Calculadora_Impuestos();
        double sueldo_neto1 = c.calculaSueldoNeto(100);
        System.out.println("Sueldo neto 1: " + sueldo_neto1);
        double sueldo_neto2 = c.calculaSueldoNeto(100, 200);
        System.out.println("Sueldo neto 2: " + sueldo_neto2);
        double sueldo_neto3 = c.calculaSueldoNeto(200, 200, 100);
        System.out.println("Sueldo neto 3: " + sueldo_neto3);



    }
}