package graficos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EventoAcciones {
    public static void main(String[] args) {
        MarcoAcciones marco = new MarcoAcciones();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}

class MarcoAcciones extends JFrame {
    public MarcoAcciones() {
        setTitle("Acciones");
        setBounds(200, 50, 400, 400);
        PanelAccion panel = new PanelAccion();
        add(panel);
    }
}

class PanelAccion extends JPanel {
    public PanelAccion() {
        CambiarColor accionAmarillo = new CambiarColor("Amarillo", new ImageIcon("src/graficos/amarillo.jpg"),
                Color.YELLOW);
        CambiarColor accionAzul = new CambiarColor("Azul", new ImageIcon("src/graficos/azul.jpg"), Color.BLUE);
        CambiarColor accionRojo = new CambiarColor("Rojo", new ImageIcon("src/graficos/rojo.jpg"), Color.RED);

        add(new JButton(accionAmarillo));
        add(new JButton(accionAzul));
        add(new JButton(accionRojo));

    }

    private class CambiarColor extends AbstractAction {
        public CambiarColor(String nombre, Icon icono, Color btnColor) {
            putValue(Action.NAME, nombre);
            putValue(Action.SMALL_ICON, icono);
            putValue(Action.SHORT_DESCRIPTION, "Poner la lámina de color " + nombre);
            putValue("Color_fondo", btnColor);
        }

        public void actionPerformed(ActionEvent e) {
            Color c = (Color) getValue("Color_fondo");
            setBackground(c);
        }

    }

}
