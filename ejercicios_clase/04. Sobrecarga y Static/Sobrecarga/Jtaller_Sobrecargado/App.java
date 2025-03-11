public class App
{
    public static void main(String[] args)
    {
        Coche c1 = new Coche("1234JHG", "Golf", 4);
        Persona p = new Persona("Lucas", "1234JHK");
        Coche c2 = new Coche("4321YHT", "Mercedes", 4);
        Coche c3 = new Coche("4321KH", "Seat", 4);
        Coche[] coches = {c1, c2, c3};
        Taller taller = new Taller("Humanes", p, coches); 
        taller.mostrar_coches();

        

    }
}