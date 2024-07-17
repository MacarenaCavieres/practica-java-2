package graficos;

import javax.swing.*;
import java.awt.event.*;

public class EventosVentana {
    public static void main(String[] args) {
        MarcoVentana marco = new MarcoVentana();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MarcoVentana marcoDos = new MarcoVentana();
        marcoDos.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        marco.setTitle("Ventana1");
        marcoDos.setTitle("Ventana2");
        marco.setBounds(100, 100, 400, 400);
        marcoDos.setBounds(600, 100, 400, 400);
    }
}

class MarcoVentana extends JFrame {
    public MarcoVentana() {
        // setTitle("Ventana");
        // setBounds(100, 50, 400, 400);
        setVisible(true);
        ModuloVentana ventana = new ModuloVentana();
        addWindowListener(ventana);
    }
}

class ModuloVentana implements WindowListener {
    public void windowActivated(WindowEvent e) {
        System.out.println("Ventana activada");
    }

    public void windowClosed(WindowEvent e) {
        System.out.println("ventana cerrada");

    }

    public void windowClosing(WindowEvent e) {
        System.out.println("Cerrando");
    }

    public void windowDeactivated(WindowEvent e) {
        System.out.println("Desactivada");
    }

    public void windowDeiconified(WindowEvent e) {
        System.out.println("restaurar");
    }

    public void windowIconified(WindowEvent e) {
        System.out.println("Minimizar");
    }

    public void windowOpened(WindowEvent e) {
        System.out.println("Ventana abierta");
    }

}