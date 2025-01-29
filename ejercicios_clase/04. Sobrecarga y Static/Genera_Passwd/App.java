public class App
{
    public static void main(String[] args)
    {
        Genera_PWD g = new Genera_PWD();

        System.out.println(g.generarPasswd(10, true));
        System.out.println(g.generarPasswd(10));

        
    }
}