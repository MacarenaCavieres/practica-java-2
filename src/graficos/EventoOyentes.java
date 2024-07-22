package graficos;

import java.awt.event.*;
import javax.swing.*;

public class EventoOyentes {
    public static void main(String[] args) {
        MarcoPrincipal marco = new MarcoPrincipal();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}

class MarcoPrincipal extends JFrame {
    public MarcoPrincipal() {
        setTitle("Prueba varios");
        setBounds(800, 50, 400, 400);
        LaminaPrincipal lamina = new LaminaPrincipal();
        add(lamina);
    }
}

class LaminaPrincipal extends JPanel {
    public LaminaPrincipal() {
        JButton newBtn = new JButton("Nuevo");
        add(newBtn);
        btnCerrar = new JButton("Cerrar todo");
        add(btnCerrar);
        OyenteNuevo oyente = new OyenteNuevo();
        newBtn.addActionListener(oyente);

    }

    private class OyenteNuevo implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            MarcoEmergente newMarco = new MarcoEmergente(btnCerrar);
            newMarco.setVisible(true);
        }

    }

    JButton btnCerrar;
}

class MarcoEmergente extends JFrame {
    public MarcoEmergente(JButton btnPrincial) {
        contador++;
        setTitle("Ventana " + contador);
        setBounds(40 * contador, 40 * contador, 300, 150);
        CerrarTodos cerrar = new CerrarTodos();
        btnPrincial.addActionListener(cerrar);
    }

    private class CerrarTodos implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            dispose();
        }

    }

    private static int contador = 0;
}