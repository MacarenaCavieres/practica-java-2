package graficos;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class MarcoCentrado {
    public static void main(String[] args) {
        System.out.println("imprime bien");
        Marco elMarco = new Marco();
        elMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        elMarco.setVisible(true);

    }
}

class Marco extends JFrame {
    public Marco() {
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Dimension sizePantalla = pantalla.getScreenSize();
        int altura = sizePantalla.height;
        int ancho = sizePantalla.width;
        setSize(ancho / 2, altura / 2);
        setLocation(ancho / 4, altura / 4);
        setTitle("Marco centrado");
        Image icono = pantalla.getImage("icono.jpg");
        setIconImage(icono);
    }
}