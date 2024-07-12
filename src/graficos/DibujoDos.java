package graficos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DibujoDos {
    public static void main(String[] args) {
        MarcoColores marco = new MarcoColores();
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoColores extends JFrame {
    public MarcoColores() {
        setTitle("Colores");
        setBounds(400, 200, 400, 400);
        LaminaColores lamina = new LaminaColores();
        add(lamina);
        // lamina.setBackground(new Color(140, 200, 250));
        lamina.setBackground(SystemColor.window);

    }
}

class LaminaColores extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
        g2.setPaint(Color.BLACK);
        g2.fill(rectangulo);
        Ellipse2D elipse = new Ellipse2D.Double();
        g2.setPaint(new Color(250, 150, 120).darker());
        elipse.setFrame(rectangulo);
        g2.fill(elipse);

    }
}
