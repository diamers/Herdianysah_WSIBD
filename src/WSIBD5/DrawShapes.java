/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WSIBD5;

/**
 *
 * @author Herdiansyah
 */

import java.awt.*;
import javax.swing.*;

public class DrawShapes extends JPanel {
    Font font;
    Color redColor;
    Color blueColor;
    Color backgroundColor;
    
     public DrawShapes() {
        font = new Font("Arial", Font.ITALIC, 18);

        redColor = Color.red;
        backgroundColor = Color.orange;

        blueColor = new Color(0, 0, 122);

        setBackground(backgroundColor);
    }
     @Override
    protected void paintComponent(Graphics graph) {
        super.paintComponent(graph);

        graph.setFont(font);

        graph.drawString("Draw Shapes", 90, 20);

        graph.setColor(blueColor);

        graph.drawRect(120, 120, 120, 120);

        graph.fillRect(115, 115, 90, 90);

        graph.setColor(redColor);

        graph.fillArc(110, 110, 50, 50, 0, 360);

        graph.setColor(Color.CYAN);

        graph.drawRect(50, 50, 50, 50);

        graph.fillRect(50, 50, 60, 60);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Draw Shapes");
        DrawShapes panel = new DrawShapes();
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
