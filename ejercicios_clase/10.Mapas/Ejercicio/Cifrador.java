import java.util.HashMap;
import java.util.Map;

public class Cifrador
{

    private Map<Character,String> mapa_radio;
    private Map<String,Character> descifra_radio;
    private Map <String, Integer> mapa_asci;
    Cifrador()
    {
        mapa_radio = new HashMap<>();
        descifra_radio = new HashMap<>();
        mapa_asci = new HashMap<>();
        inicializar_mapa_asci();
        inicializarmapa_radio();
        inicializar_descrifrar_radio();
    }

    public String cifrar_radio(String cadena_cifrar)
    {
        cadena_cifrar = cadena_cifrar.toUpperCase();
        char[] caracteres = cadena_cifrar.toCharArray();
       
        String salida = "";
        for (char c:caracteres)
        {
            System.out.println(c);
            if (mapa_radio.containsKey(c))
            {
                salida += mapa_radio.get(c) + " ";
            }

        }
        return salida;
    }


    public String descifrar(String cadena_cifrada)
    {

        String salida = "";
        String[] palabras = cadena_cifrada.split("\\s+");
       
        for (String palabra:palabras)
        {
            //System.out.println(palabra);
            salida += descifra_radio.get(palabra);
        }


        return salida;
    }



    public void inicializar_mapa_asci()
    {
        char inicio = 'A';
        char letra_final = 'z';
        int inicio_asci = (int) inicio;
        int final_asci = (int) letra_final + 1;
        for (int i = inicio_asci; i < final_asci; i++)
        {
            mapa_asci.put(String.valueOf((char) i), i);
        }



        System.out.println(mapa_asci);
    }


    public String cifrar_asci(String cadena)
    {
        char[] caracteres = cadena.toCharArray();
        String salida = "";

        for (char c:caracteres)
        {

            salida += mapa_asci.get(String.valueOf(c)) + " ";

        }
        return salida;
        }



    public void inicializar_descrifrar_radio()
    {
        

        for (char c:mapa_radio.keySet())
        {
            descifra_radio.put(mapa_radio.get(c), c);
        }




    }


    public void inicializarmapa_radio()
    {
       mapa_radio.put('A', "Alfa");
       mapa_radio.put('B', "Bravo");
       mapa_radio.put('C', "Charlie");
       mapa_radio.put('D', "Delta");
       mapa_radio.put('E', "Echo");
       mapa_radio.put('F', "Foxtrot");
       mapa_radio.put('G', "Golf");
       mapa_radio.put('H', "Hotel");
       mapa_radio.put('I', "India");
       mapa_radio.put('J', "Juliet");
       mapa_radio.put('K', "Kilo");
       mapa_radio.put('L', "Lima");
       mapa_radio.put('M', "Mike");
       mapa_radio.put('N', "November");
       mapa_radio.put('O', "Oscar");
       mapa_radio.put('P', "Papa");
       mapa_radio.put('Q', "Quebec");
       mapa_radio.put('R', "Romeo");
       mapa_radio.put('S', "Sierra");
       mapa_radio.put('T', "Tango");
       mapa_radio.put('U', "Uniform");
       mapa_radio.put('V', "Victor");
       mapa_radio.put('W', "Whiskey");
       mapa_radio.put('X', "X-ray");
       mapa_radio.put('Y', "Yankee");
       mapa_radio.put('Z', "Zulu");

    }
}