public class App {

    public static void main(String[] args)
    {
    Generador_Passwd g = new Generador_Passwd();
    String pwd = g.generaPwd(10, true);
    System.out.println(pwd);

    String pwd2 = g.generaPwd(10);
    System.out.println(pwd2);
    String pwd3 = g.generaPwd("Lucas");
    System.out.println(pwd3);


    }

    
}
