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
        addMouseListener(mouse);
    }
}

class EventoMouse implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("click");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("acabas de entrar");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("acabas de salir");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("presion");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("despresion");
    }

}