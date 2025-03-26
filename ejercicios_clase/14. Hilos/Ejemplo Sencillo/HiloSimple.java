public class HiloSimple extends Thread

{
    public int numero; 

    public HiloSimple(int numero)
    {
        this.numero = numero;
        System.out.println("Creando Hilo" + numero);
       
    }


    @Override
    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Hilo número: " + "(" + numero + ") : " + i);
        }
    }


    
}