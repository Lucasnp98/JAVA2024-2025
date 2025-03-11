import java.lang.StringBuilder;
import java.util.Random;

public class Genera_PWD
{
    static String MINUSCULAS = "abcdefghijklmnopwrstuvwxyz";
    static String SIMBOLOS = "!·%$&/()=?¿";´

    String generarPasswd(int longitud)
    {

        return generarPasswd(longitud, false);
        
    }

    String generarPasswd(int longitud, boolean especiales)
    {

        StringBuilder sb = new StringBuilder();
        Random rd = new Random();
        while (sb.length() < longitud)
        {
            int indice = rd.nextInt(MINUSCULAS.length());
            char caracter = MINUSCULAS.charAt(indice);
            sb.append(caracter);

            if (especiales)
            {
                //ARREGLA EL DRY!!!
                int indice_especial = rd.nextInt(SIMBOLOS.length());
                char especial = SIMBOLOS.charAt(indice_especial);
                sb.append(especial);
            }

        }
        return sb.toString();


    }


}