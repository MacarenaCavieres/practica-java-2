
package graficos;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EscribirMarco {
    public static void main(String[] args) {
        MarcoTexto elMarco = new MarcoTexto();
        elMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MarcoTexto extends JFrame {
    public MarcoTexto() {
        setVisible(true);
        setSize(600, 450);
        setLocation(400, 200);
        setTitle("Primer texto");
        Lamina laLamina = new Lamina();
        add(laLamina);
    }
}

class Lamina extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Aprendiendo swing", 100, 100);
    }
}