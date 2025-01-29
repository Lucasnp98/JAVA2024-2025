public class Ejemplo
{

    void metodo_sobrecargado()
    {
        System.out.println("Hola no estoy recibiendo nada");
    }

    void metodo_sobrecargado(int numero)
    {
        System.out.println("Hola he recibido un numero: " + numero); 

    }

    void metodo_sobrecargado(int numero, String nombre)
    {
        System.out.println("Hola: " + nombre + " El numero es: " + numero);
    }





}