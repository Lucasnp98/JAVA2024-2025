import java.util.ArrayList;


// Se pretende implementar un programa que sirva de gestor de una biblioteca. 
// En nuestra biblioteca, podremos almacenar Revistas o libros.  Todas ellas tendrán
// año de publicación, título, numero de ejemplares disponibles y precio. 
// Los libros, ademñas, tendrán un isbn y las revistas, tendrán un título. 
// - Ambas clases presentarán un método obtenerClaves, pero el funcionamiento de este difiere entre
// las revistas y los libros. Simularemos el comportamiento devolviendo un System.out.println("SOy un libro") o  System.out.println("Soy una revista")
// Debemos tener una clase biblioteca que tiene como atributo varias publicaciones
//Las acciones que debe implementar nuestra biblioteca, son: 
// - Aádir una publicacion al conjunto de publicaciones disponibles en la biblioteca
// - Prestar una publicación y si está disponible, restar uno al número de ejemplares simulando que se ha prestado
// - Mostrar todas las publicaciones
// - Mostrar todas las revistas por temática
// - Calcular el valor del inventario 
// NOTA: DOS PUBLICACIONES SERÁN IGUALES SI SUS TITULOS SON IGUALES
// NOTA: DOS LIBROS SON IGUALES SI SUS TITULOS Y SUS ISBNS SON IGUALES
// NOTA: DOS REVISTAS SON IGUALES SI SUS TITULOS Y TEMATICAS SON IGUALES
// NOTA: PARA PRESTAR UNA PUBLICACIÓN, TENDREMOS QUE SER CAPACES DE BUSCARLA SOLO POR SU TÍTULO
// TENEMOS QUE TENER VARIOS CONSTRUCTORES DE PUBLICACIÓN
// UTILIZAR SOBRECARGA DE METODOS, HERENCIA Y CLASES ABSTRACTAS

    


public class App{
    public static void main(String[] args)
    {

        
        Publicacion p1 =  new Revista(2023, "Publicacion1", "Ciencia",0,123);
        Publicacion p2 = new Revista(2023, "Publicacion2", "Ciencia",10,123);
        ArrayList<Publicacion> publicaciones = new ArrayList<Publicacion>();
        publicaciones.add(p1);
        publicaciones.add(p2);
        Biblioteca biblioteca = new Biblioteca(publicaciones);

        biblioteca.prestarPublicacion(new Revista("Publicacion1"));
        biblioteca.addPublicacion(new Libro(2020,"Titulolibro2", 20,3, "1234"));
        biblioteca.mostrarPublicaciones();
        //System.out.println(biblioteca.calculaValor());


        //ArrayList<Revista> revistas = biblioteca.obtenerTematicas("Ciencia");
        // for (Revista r:revistas)
        // {
        //     System.out.println(r.toString());
        // }

    











    
        
     
    }
}