package graficos;

import java.awt.*;
import javax.swing.*;

public class Pruebas {
    public static void main(String[] args) {
        String fuente = JOptionPane.showInputDialog("Introduce fuente");
        boolean pertenece = false;
        String[] nombreFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for (String nombre : nombreFuentes) {
            if (nombre.equalsIgnoreCase(fuente)) {
                pertenece = true;
            }
        }
        if (pertenece) {
            System.out.println(fuente + ": Esa fuente pertenece a tu equipo");
        } else {
            System.out.println(fuente + ": Esa fuente NO pertenece a tu equipo");
        }
    }
}
