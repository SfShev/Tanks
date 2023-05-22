package org.example.Display;

import javax.swing.*;
import java.awt.*;

public class Display {

    private static boolean created = false;
    private static JFrame window;
    private static Canvas content;

    public static void create ( int width, int height, String title){
        if (created){
            return;
        }
        window = new JFrame(title);
        content = new Canvas();

        Dimension size = new Dimension(width,height);
        content.setPreferredSize(size);

        window.setResizable(false);
        window.getContentPane().add(content);
        window.pack();
        window.setVisible(true);
    }

}
