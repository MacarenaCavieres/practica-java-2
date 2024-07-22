package graficos;

import java.awt.event.*;
import javax.swing.*;

public class EventoVentana extends JFrame implements WindowFocusListener {
    public static void main(String[] args) {
        EventoVentana ventana = new EventoVentana();
        ventana.iniciar();
    }

    public void iniciar() {
        marco_uno = new EventoVentana();
        marco_dos = new EventoVentana();
        marco_uno.setVisible(true);
        marco_dos.setVisible(true);
        marco_uno.setBounds(50, 100, 600, 350);
        marco_dos.setBounds(700, 100, 600, 350);
        marco_uno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco_dos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco_uno.addWindowFocusListener(this);
        marco_dos.addWindowFocusListener(this);
    }

    @Override
    public void windowGainedFocus(WindowEvent e) {
        if (e.getSource() == marco_uno) {
            marco_uno.setTitle("Gano foco");
        } else {
            marco_dos.setTitle("Gano foco");
        }

    }

    @Override
    public void windowLostFocus(WindowEvent e) {
        if (e.getSource() == marco_uno) {
            marco_uno.setTitle("");
        } else {
            marco_dos.setTitle("");
        }
    }

    EventoVentana marco_uno;
    EventoVentana marco_dos;

}
