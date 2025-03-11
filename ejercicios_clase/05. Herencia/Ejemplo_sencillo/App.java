public class App
{
    public static void main(String[] argv)
    {
        Persona p = new Persona("Pepe", "577jH");
        System.out.println(p.presentarse());
        Estudiante e = new Estudiante("Lucas", "505j", "Teleco", 240);
        System.out.println(e.presentarse());



    }
}