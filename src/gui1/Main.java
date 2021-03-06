/*
Noel Franciscoco Garcia Trejo
Matricula: 2022580
*/
package gui1;

import java.awt.Color;
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
   
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setTitle("Cesba");
        
        frame.setResizable(true);
        //formato DEFAULT:
        //frame.getContentPane().setBackground(Color.red);
        //FORMATO RGB:
        //frame.getContentPane().setBackground(new Color (28, 26, 198));
        //FORMATO HEXADECIMAL:
        frame.getContentPane().setBackground(new Color (0x1AC3C6));
        
        
    }
    
}
