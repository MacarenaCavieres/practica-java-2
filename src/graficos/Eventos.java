package graficos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Eventos {
    public static void main(String[] args) {
        MarcoBoton marco = new MarcoBoton();
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoBoton extends JFrame {
    public MarcoBoton() {
        setTitle("Botones");
        setBounds(100, 50, 400, 400);
        LaminaBoton lamina = new LaminaBoton();
        add(lamina);
    }
}

class LaminaBoton extends JPanel implements ActionListener {

    JButton botonAmarillo = new JButton("Amarillo");
    JButton botonAzul = new JButton("Azul");
    JButton botonRojo = new JButton("Rojo");

    public LaminaBoton() {
        add(botonAmarillo);
        add(botonAzul);
        add(botonRojo);
        botonAmarillo.addActionListener(this);
        botonAzul.addActionListener(this);
        botonRojo.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        Object btnClick = e.getSource();
        if (btnClick == botonAmarillo) {
            setBackground(Color.YELLOW);

        } else if (btnClick == botonAzul) {
            setBackground(Color.BLUE);
        } else {
            setBackground(Color.RED);
        }
    }
}