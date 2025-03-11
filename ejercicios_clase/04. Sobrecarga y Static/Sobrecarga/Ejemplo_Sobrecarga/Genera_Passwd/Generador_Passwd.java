import java.util.Random;
import java.lang.StringBuilder;
public class Generador_Passwd
{
    
    static String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
    
    static String ESPECIALES = "!·$%&/()=?¿";

    String generaPwd(int longitud)
    {
        return generaPwd(longitud, false);
    }


    String generaPwd(String semilla)
    {
        String vocales = "aeiou";
        StringBuilder sb = new StringBuilder();
        if (semilla.length() < 5)
        {

            sb.append(semilla.charAt(0));
            sb.append(semilla.charAt(1));
        }else{
            sb.append(semilla.charAt(4));
            sb.append(semilla.charAt(3));
        }

        if (vocales.contains(Character.toString(semilla.charAt(0))))
        {
            sb.append("Hola");

        }else{
            sb.append("Adios");
        }
        int numero = semilla.length()  + 3;
        sb.append(numero); 

        return sb.toString();
        
        


    }

    String generaPwd(int longitud, boolean especiales)
    {
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        int pos = 0;
        while (sb.length() < longitud)
        {
            pos = r.nextInt(MINUSCULAS.length());
            char caracter = MINUSCULAS.charAt(pos);
            sb.append(caracter);
            if (especiales)
            {
                pos = r.nextInt(ESPECIALES.length());
                char especial = ESPECIALES.charAt(pos);
                sb.append(especial);

            }
        }
        return sb.toString();
        
    }
    
}