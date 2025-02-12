public class App 
{
    public static void main (String args [])
    {

        

        // Persona personas [] = new Persona[2];
        // personas[0] = new Trabajador("Lucas", "50X", 25,"Profe", 10, 0.25 );
        // personas[1] = new Persona("Pepe","1234X",40);

        // // for(Persona p : personas)
        // // {
        // // System.out.println(p.getInfo());
        // // }
        

        // // for(Persona p : personas)
        // // {
        // //     System.Out.println(p.calculaSueldoNeto());
        // // }

        // for(Persona p : personas)
        // {
        //     if(p instanceof Trabajador)

        //     {
        //         Trabajador t = (Trabajador) p;
        //         System.out.println(t.calculaSueldoNeto());
        //     }
        // }

        Remunerable[] remunerables = new Remunerable[2];


        Trabajador p = new Trabajador("Lucas", "50X", 25,"Profe", 10, 0.25 );
        Empresa e = new Empresa(10,200,10, 10);


        remunerables[0] = p;
        remunerables[1] = e;

        for (Remunerable r:remunerables)
        {
            System.out.println(r.calcularBeneficio());
        }

       

    }
}