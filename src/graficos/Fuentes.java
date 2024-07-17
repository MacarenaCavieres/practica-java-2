package graficos;

import java.awt.*;
import javax.swing.*;

public class Fuentes {
    public static void main(String[] args) {
        MarcoFuentes marco = new MarcoFuentes();
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoFuentes extends JFrame {
    public MarcoFuentes() {
        setTitle("Fuentes");
        setSize(400, 400);
        setLocation(400, 200);
        LaminaFuentes lamina = new LaminaFuentes();
        add(lamina);
        lamina.setForeground(Color.GREEN);

    }
}

class LaminaFuentes extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        Font fuente = new Font("Tahoma", Font.BOLD, 26);
        g2.setFont(fuente);
        g2.setColor(Color.MAGENTA);
        g2.drawString("Maca", 100, 100);
        g2.setFont(new Font("Serif", Font.ITALIC, 30));
        g2.drawString("Curso de Java, aprendiendolo", 10, 50);
    }
}