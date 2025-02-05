import java.util.Arrays;
public class App {

    public static void main(String[] args) {

    
       
        Arma a1 = new Arma("Escopeta", 10, 0.7);
        Arma a2 = new Arma("Pistola", 3, 0.3);
        Personaje p1 = new Personaje("Lucas", a1);
        Personaje p2 = new Personaje("Dani", a2);



        PersonajePago p3 = new PersonajePago("Ana", a2,100);

        PersonajeHackeado p4 = new PersonajeHackeado("DIOS", a2, "MUNICIONINFINITA;AIMBOT");
        
        p4.disparar(p2);
        p4.disparar(p1);
        p4.disparar(p3);

        Personaje[] personajes = {p1, p2, p3, p4};


        for (Personaje p:personajes)
        {
            System.out.println(p.getInfo());
        }

        
    }

    
}
