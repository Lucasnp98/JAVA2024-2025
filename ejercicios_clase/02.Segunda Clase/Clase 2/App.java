public class App{
    public static void main(String []args)
    {

        Coche c1 = new Coche("12445GHT", "Golf", 4);
        Coche c2 = new Coche("1256JYH", "Mercedes", 4);
        Persona p1 = new Persona("Lucas", "1234kj", c1);
        Persona p2 = new Persona("Guille", "897uJ", c2);


        Persona[] personas = new Persona[10];
        personas[0] = p1;
        personas[1] = p2;
        int contador = 0;
        while (contador < personas.length)
        {
            if (personas[contador] != null)
            {
            System.out.println(personas[contador].mostrar_info());
            
            }
            contador +=  1;
        }


        // Coche[] array_coches = new Coche[10];
        // array_coches[0] = c1;
        // array_coches[1] = c2;
        // System.out.println("Vamos a imprimir los coches...");
        // for (int i = 0; i < array_coches.length; i++)
        // {

            
        //     if (array_coches[i] != null)
        //     {
        //     System.out.println("----------------------------");
        //     System.out.println("Vamos con la posicion: "+ i);
        //     System.out.println(array_coches[i].mostrar_info());

        //     }
    //}
        }





      


    
}