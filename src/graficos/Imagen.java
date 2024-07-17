package graficos;

import java.awt.*;
import java.io.File;
import java.io.IOException;

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
        setSize(400, 400);
        setLocation(450, 250);
        LaminaImagen lamina = new LaminaImagen();
        add(lamina);

    }
}

class LaminaImagen extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        File nuevaImagen = new File("src/graficos/image1.jpg");
        try {
            imagen = ImageIO.read(nuevaImagen);
        } catch (IOException e) {
            System.out.println("Error " + e);
        }
        g.drawImage(imagen, 10, 10, null);

    }

    private Image imagen;
}