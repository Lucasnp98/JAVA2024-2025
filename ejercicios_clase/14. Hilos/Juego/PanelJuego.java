import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JPanel;

public class PanelJuego extends JPanel implements Runnable{


    private Pelota pelota;
    private Raqueta raqueta;
    private ArrayList<Ladrillo> ladrillos;
    private boolean juegoIniciado;
    private JVentana ventana_juego;

    private int ANCHO;
    private int LARGO;
    final int FILAS = 3;
    final int COLUMNAS = 5;
    final int FPS = 40;
    final int FRAME_TIME = 1000 / FPS;
    private HashMap<Integer, Boolean> teclasPresionadas = new HashMap<>();

    PanelJuego(JVentana ventana_juego)
    {
        super();
        this.ANCHO = ventana_juego.getANCHO();
        this.LARGO = ventana_juego.getLargo();
        this.juegoIniciado = false;
        int mitad_ancho = this.ANCHO / 2;
        int mitad_largo = this.LARGO / 2;
        this.pelota = new Pelota(mitad_largo,mitad_largo,Color.RED, 30);
        this.raqueta = new Raqueta(mitad_ancho, mitad_largo + mitad_largo - 100, Color.WHITE );
        this.ladrillos = new ArrayList<Ladrillo>();
        
    }
    

    public HashMap<Integer, Boolean> getTeclasPresionadas() {
        return teclasPresionadas;
    }


    public Pelota getPelota() {
        return pelota;
    }


    public void setPelota(Pelota pelota) {
        this.pelota = pelota;
    }


    public Raqueta getRaqueta() {
        return raqueta;
    }


    public void setRaqueta(Raqueta raqueta) {
        this.raqueta = raqueta;
    }


    public void setTeclaPresionada(int keyCode, boolean estado) {
        teclasPresionadas.put(keyCode, estado);
    }

    public boolean isTeclaPresionada(int keyCode) {
        return teclasPresionadas.getOrDefault(keyCode, false);
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        pelota.pintar(g);
        raqueta.pintar(g);
        for (Ladrillo l:ladrillos)
        {
            l.pintar(g);
        }
    }


    @Override
    public void run() {
        inicializarLadrillos();
        boolean bucle_juego = true;
        while (bucle_juego) {
            actualizarEstado();
            repaint();
            if (pelota.haTocadoSuelo()) {
               
                bucle_juego = false; 
            }
    
            try {
                Thread.sleep(FRAME_TIME);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    



    private void actualizarEstado() {

        if (juegoIniciado) {
            pelota.checkeaColisiones(ANCHO, LARGO, raqueta, ladrillos);
            pelota.mover();
        }
    
        if (isTeclaPresionada(KeyEvent.VK_RIGHT)) {
            raqueta.moverDerecha();
        }
        if (isTeclaPresionada(KeyEvent.VK_LEFT)) {
            raqueta.moverIzquierda();
        }
    
        if (isTeclaPresionada(KeyEvent.VK_SPACE) && !juegoIniciado) {
            juegoIniciado = true;
        }
    }
    

    public void inicializarLadrillos() {
    
    
        int margenLateral = 40; 
        int margenVertical = 20;
        int separacionEntreLadrillos = 10;
    
        int anchoDisponible = ANCHO - 2 * margenLateral - (COLUMNAS - 1) * separacionEntreLadrillos;
        int anchoLadrillo = anchoDisponible / COLUMNAS;
        int altoLadrillo = 20;
    
        for (int fila = 0; fila < FILAS; fila++) {
            for (int col = 0; col < COLUMNAS; col++) {
                int x = margenLateral + col * (anchoLadrillo + separacionEntreLadrillos);
                int y = margenVertical + fila * (altoLadrillo + separacionEntreLadrillos);
                ladrillos.add(new Ladrillo(x, y, Color.BLUE, anchoLadrillo, altoLadrillo));
            }
        }
    }
    
    


    






  
    
}