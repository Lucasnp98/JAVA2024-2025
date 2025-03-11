
public class App {
    
    public static void main(String[] args) {
        Coche c1 = new Coche("Golf", "rojo", "1234JV", 100);
        Coche c2 = new Coche("Golf", "Verde", "1234JX",200);
        Taller taller1 = new Taller("Autorecambios Luis", 5);
        taller1.aniadir_coche(c1);
        taller1.aniadir_coche(c2);
        taller1.listar_coches();

        Coche coche_maximo = taller1.calcular_max_km();
        System.out.println("------------------");
        System.out.println("El coche con mas km es: "+ coche_maximo.mostrar_info());

      
    }
   
}
