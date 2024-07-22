package graficos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EventoFoco {
    public static void main(String[] args) {
        MarcoFoco marco = new MarcoFoco();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoFoco extends JFrame {
    public MarcoFoco() {
        setTitle("Foco");
        setVisible(true);
        setBounds(500, 100, 400, 400);
        LaminaFoco lamina = new LaminaFoco();
        add(lamina);
    }
}

class LaminaFoco extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setLayout(null);
        cuadro_uno = new JTextField();
        cuadro_dos = new JTextField();
        cuadro_uno.setBounds(120, 10, 150, 20);
        cuadro_dos.setBounds(120, 50, 150, 20);
        add(cuadro_uno);
        add(cuadro_dos);
        Foco inputFoco = new Foco();
        cuadro_uno.addFocusListener(inputFoco);
    }

    private class Foco implements FocusListener {

        @Override
        public void focusGained(FocusEvent e) {
            System.out.println("Gana foco");
        }

        @Override
        public void focusLost(FocusEvent e) {
            System.out.println("Pierde foco");
            String email = cuadro_uno.getText();
            boolean comprobacion = false;
            int contador = 0;
            for (int i = 0; i < email.length(); i++) {
                if (email.charAt(i) == '@') {
                    comprobacion = true;
                    contador++;
                }
            }

            if (comprobacion && contador == 1) {
                System.out.println("Email valido");
            } else {
                System.out.println("Email no valido");
            }
        }

    }

    JTextField cuadro_uno, cuadro_dos;
}
