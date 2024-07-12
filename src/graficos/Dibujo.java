package graficos;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.*;

public class Dibujo {
    public static void main(String[] args) {
        MarcoDibujo marco = new MarcoDibujo();
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoDibujo extends JFrame {
    public MarcoDibujo() {
        setTitle("Dibujo");
        setSize(400, 400);
        setLocation(400, 200);
        LaminaFigura lamina = new LaminaFigura();
        add(lamina);
    }
}

class LaminaFigura extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // g.drawRect(50, 50, 200, 200);
        // g.drawLine(100, 100, 300, 200);
        // g.drawArc(50, 100, 100, 200, 120, -180);
        // g.drawArc(50, 100, 100, 200, 120, 200);
        Graphics2D g2 = (Graphics2D) g;
        Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
        g2.draw(rectangulo);
        Ellipse2D elipse = new Ellipse2D.Double();
        elipse.setFrame(rectangulo);
        g2.draw(elipse);
        g2.draw(new Line2D.Double(100, 100, 300, 250));
        double centroX = rectangulo.getCenterX();
        double centroy = rectangulo.getCenterY();
        double radio = 125;
        Ellipse2D circulo = new Ellipse2D.Double();
        circulo.setFrameFromCenter(centroX, centroy, centroX + radio, centroy + radio);
        g2.draw(circulo);
    }
}