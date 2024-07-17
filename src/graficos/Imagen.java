package graficos;

import java.awt.*;
// import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.swing.*;
import javax.imageio.*;

public class Imagen {
    public static void main(String[] args) {
        MarcoImagen marco = new MarcoImagen();
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoImagen extends JFrame {
    public MarcoImagen() {
        setTitle("Imagen");
        setSize(500, 500);
        setLocation(50, 50);
        LaminaImagen lamina = new LaminaImagen();
        add(lamina);

    }
}

class LaminaImagen extends JPanel {
    public LaminaImagen() {
        // File nuevaImagen = new File("src/graficos/image1.jpg");
        try {
            // imagen = ImageIO.read(nuevaImagen);
            URL url = new URL(
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS_uGpQUdCRi5KIYQEwvLpCxnrRdf4i3PYG8Ur-WBa-oXD8fBFgy8L03Rm_jofzjW5CTrc&usqp=CAU");
            imagen = ImageIO.read(url);
        } catch (IOException e) {
            System.out.println("Error " + e);
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int ancho = imagen.getWidth(this);
        int alto = imagen.getHeight(this);
        g.drawImage(imagen, 0, 0, null);
        for (int i = 0; i < 500; i++) {
            for (int j = 0; j < 500; j++) {
                if (i + j > 0) {
                    g.copyArea(0, 0, ancho, alto, i * ancho, j * alto);
                }

            }
        }
    }

    private Image imagen;
}