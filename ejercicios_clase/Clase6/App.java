public class App
{
    public static void main(String[] args)
    {

        Persona[] personas = new Persona[2];
        personas[0] = new Persona("Lucas","564H");
        personas[1] = new Trabajador("pepe","2563",100, 0.25);
        for (Persona p:personas)
        {
            if(p instanceof Trabajador)
            {
                //DOWNCASTING
                Trabajador t = (Trabajador)p;
                System.out.println(t.calculaBeneficio());
            }
        }

        for (Persona p:personas)
        {
            System.out.println(p.getInfo());
        }

        Empresa e = new Empresa(1000,10,10)

        Trabajador t = new Trabajador("pepe","2563",100, 0.25);
        /// Hagais un array de remunarables y accedais al método.

       
    }
}