package graficos;

import java.awt.event.*;
import javax.swing.*;

public class EventosMouse {
    public static void main(String[] args) {
        MarcoMouse marco = new MarcoMouse();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoMouse extends JFrame {
    public MarcoMouse() {
        setTitle("Mouse");
        setVisible(true);
        setBounds(100, 50, 400, 400);
        EventoMouse mouse = new EventoMouse();
        // addMouseListener(mouse);
        addMouseMotionListener(mouse);

    }
}

// class EventoMouse implements MouseListener {

// @Override
// public void mouseClicked(MouseEvent e) {
// System.out.println("click");
// }

// @Override
// public void mouseEntered(MouseEvent e) {
// System.out.println("acabas de entrar");
// }

// @Override
// public void mouseExited(MouseEvent e) {
// System.out.println("acabas de salir");
// }

// @Override
// public void mousePressed(MouseEvent e) {
// System.out.println("presion");
// }

// @Override
// public void mouseReleased(MouseEvent e) {
// System.out.println("despresion");
// }

// }
// class EventoMouse extends MouseAdapter {
// // public void mouseClicked(MouseEvent e) {
// // // System.out.println("Coordenada x: " + e.getX() + " Coordenada y: " +
// // // e.getY());
// // System.out.println(e.getClickCount());
// // }
// public void mousePressed(MouseEvent e) {
// // System.out.println(e.getModifiersEx());
// if (e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
// System.out.println("Izquierdo");
// } else if (e.getModifiersEx() == MouseEvent.BUTTON2_DOWN_MASK) {
// System.out.println("Rueda");
// } else if (e.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK) {
// System.out.println("Derecho");
// }
// }
// }

class EventoMouse implements MouseMotionListener {
    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("Arrastrando");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("Moviendo");
    }
}