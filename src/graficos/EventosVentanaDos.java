package graficos;

import javax.swing.*;

import java.awt.Frame;
import java.awt.event.*;

public class EventosVentanaDos {
    public static void main(String[] args) {
        MarcoEstado marco = new MarcoEstado();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MarcoEstado extends JFrame {
    public MarcoEstado() {
        setTitle("Ventana");
        setVisible(true);
        setBounds(100, 50, 400, 400);
        CambioEstado estado = new CambioEstado();
        addWindowStateListener(estado);
    }
}

class CambioEstado implements WindowStateListener {
    public void windowStateChanged(WindowEvent e) {
        System.out.println("Cambio de estado ");
        // System.out.println(e.getNewState());
        if (e.getNewState() == Frame.MAXIMIZED_BOTH) {
            System.out.println("la ventana esta a pantalla completa");
        }
    }
}