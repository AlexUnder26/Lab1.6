/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figures;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Admin
 */
public class FIGURES {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Фигуры");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750,700);
        
        
        Canvas c = new Canvas() {
        @Override
        public void paint(Graphics g){
        g.setColor(Color.black);
        g.drawLine(50,325,640,325);
        g.setColor(Color.blue);
        g.fillRect(50,100,120,200);
        g.setColor(Color.blue);
        g.drawRect(50,350,120,200);
        g.setColor(Color.red);
        g.fillRoundRect(200,100,120,200,40,40);
        g.setColor(Color.red);
        g.drawRoundRect(200, 350,120,200,40,40);
        g.setColor(Color.green);
        g.fillOval(350,100,120,200);
        g.setColor(Color.green);
        g.drawOval(350,350,120,200);
        g.setColor(Color.yellow);
        g.fillOval(500, 100, 180, 180);
        g.setColor(Color.yellow);
        g.drawOval(500, 350, 180, 180);
        }
    };
        frame.add(c);
        frame.setVisible(true);
    }
    
}
