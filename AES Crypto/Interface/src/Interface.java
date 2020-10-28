
import java.awt.Image;
import java.awt.Toolkit;
import java.io.InputStream;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RafaSantana
 */
public class Interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ImageIcon icon = new ImageIcon("/Users/RafaSantana/NetBeansProjects/Interface/src/aes_security.png");
        
        JFrame a = new CryptoInterface();
        ImageIcon icon = new ImageIcon("/aes_security.png");
        a.setIconImage(icon.getImage());
        a.setVisible(true);
    }
    
  
}
