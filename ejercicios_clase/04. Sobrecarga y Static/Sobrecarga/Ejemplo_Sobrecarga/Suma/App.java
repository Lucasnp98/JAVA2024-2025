public class App {
    public static void main (String[] args)
    {
        int n1 = 6;
        int n2 = 7;
        int suma = Calculadora.sumar(n1, n2);
        System.out.println(suma);

        int suma2 = Calculadora.sumar("7", "8");
        System.out.println(suma2);
    }


}
