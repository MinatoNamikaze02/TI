package ast;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Image;


public class display {

    public static void main(String[] args){

        try {
            
            JFrame astframe = new JFrame("AST");
            JPanel astpanel = new JPanel();
            Image image = new ImageIcon("./out/output.png").getImage();
            int width = image.getWidth(null);
            int height = image.getHeight(null);
            double min = Math.min(1800/(double)width, 700/(double)height);
            int newWidth = (int)Math.round(width *min);
            int newHeight = (int)Math.round(height *min);

            Image scaledImage = image.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(scaledImage);
            JLabel label = new JLabel(icon);
            astpanel.add(label);
            astframe.add(astpanel);
            astframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            astframe.pack();
            astframe.setVisible(true);
            

        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        

    }
    
}

