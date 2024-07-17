package graficos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EventosDos {
    public static void main(String[] args) {
        MarcoBtnes marco = new MarcoBtnes();
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoBtnes extends JFrame {
    public MarcoBtnes() {
        setTitle("Botones");
        setBounds(100, 50, 400, 400);
        LaminaBtnes lamina = new LaminaBtnes();
        add(lamina);

    }
}

class LaminaBtnes extends JPanel {
    JButton btnAzul = new JButton("Azul");
    JButton btnAmarillo = new JButton("Amarillo");
    JButton btnRojo = new JButton("Rojo");

    public LaminaBtnes() {
        add(btnAmarillo);
        add(btnAzul);
        add(btnRojo);

        ColorFondo Amarillo = new ColorFondo(Color.YELLOW);
        ColorFondo Rojo = new ColorFondo(Color.RED);
        ColorFondo Azul = new ColorFondo(Color.BLUE);

        btnAzul.addActionListener(Azul);
        btnAmarillo.addActionListener(Amarillo);
        btnRojo.addActionListener(Rojo);
    }

    private class ColorFondo implements ActionListener {
        public ColorFondo(Color c) {
            backColor = c;
        }

        public void actionPerformed(ActionEvent e) {
            setBackground(backColor);
        }

        private Color backColor;
    }

}
