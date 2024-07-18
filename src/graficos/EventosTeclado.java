package graficos;

import java.awt.event.*;
import javax.swing.*;

public class EventosTeclado {
    public static void main(String[] args) {
        MarcoTeclado marco = new MarcoTeclado();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoTeclado extends JFrame {
    public MarcoTeclado() {
        setTitle("Teclado");
        setVisible(true);
        setBounds(100, 50, 400, 400);
        EventoTeclado evento = new EventoTeclado();
        addKeyListener(evento);
    }
}

class EventoTeclado implements KeyListener {

    public void keyPressed(KeyEvent e) {
        // int codigo = e.getKeyCode();
        // System.out.println(codigo);
    }

    public void keyReleased(KeyEvent e) {

    }

    public void keyTyped(KeyEvent e) {
        char caracter = e.getKeyChar();
        System.out.println(caracter);

    }

}