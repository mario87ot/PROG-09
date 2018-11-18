package cromosUI;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author Mario 
 * version 14/05/2017 
 * Clase para establecer una imagen de fondo del jFrame
 */

public class JPanelBackground extends JPanel {

    public Image imagenFondo;

    
    public JPanelBackground() {
        this.setSize(400, 280);
        this.setBounds(0, 0, 400, 300);

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            //Capturamos la imagen que vamos a poner de fondo
            imagenFondo = ImageIO.read(new File("src/recursos/album.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Dibujamos la imagen de fondo
        g.drawImage(imagenFondo, 0, 0, getWidth(), getHeight(), this);
    }

}
