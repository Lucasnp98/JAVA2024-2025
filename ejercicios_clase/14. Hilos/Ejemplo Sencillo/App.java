public class App{
    public static void main(String[] argv)
    {
        
        for (int i = 0; i < 5; i ++)
        {
           
        HiloSimple hilo = new HiloSimple(i);
        hilo.start();
        
        }

        System.out.println("He arrancado todos los hilos!!!");
    }
}