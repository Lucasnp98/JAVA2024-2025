public class App
{
 public static void main (String[] argv)
 {

    String cadena_cifrar = "Hola";

    Cifrador c = new Cifrador();

    String cadena_cifrada = c.cifrar_radio(cadena_cifrar);


    System.out.println("Cadena cifrada: "+ cadena_cifrada);
    System.out.println(c.descifrar(cadena_cifrada));

    System.out.println(c.cifrar_asci(cadena_cifrar));
    
  


    






 }
}