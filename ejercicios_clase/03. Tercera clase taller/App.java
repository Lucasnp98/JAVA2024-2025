public class App
{
    public static void main(String[] args)
    {
        Coche c1 = new Coche("1234JHG", "Golf", 4);
        Persona p = new Persona("Lucas", "1234JHK");
        Taller taller = new Taller("Humanes", p, 1 );
        taller.add_coche(c1);
        Coche c2 = new Coche("4321YHT", "Mercedes", 4);
        taller.add_coche(c2);

        taller.mostrar_coches();

        

    }
}