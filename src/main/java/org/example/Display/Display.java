package org.example.Display;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.util.Arrays;

public class Display {

    private static boolean created = false;
    private static JFrame window;
    private static Canvas content;

    private static BufferedImage buffer;
    private static int[] bufferData;
    private static Graphics bufferGraphics;
    private static int clearColor;

    public static void create(int width, int height, String title, int _clearColor) {
        if (created) {
            return;
        }
        window = new JFrame(title);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        content = new Canvas();

        Dimension size = new Dimension(width, height);
        content.setPreferredSize(size);


        window.setResizable(false);
        window.getContentPane().add(content);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        buffer = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        bufferData = ((DataBufferInt) buffer.getRaster().getDataBuffer()).getData();
        bufferGraphics = buffer.getGraphics();
        clearColor = _clearColor;

        created = true;
    }
    public static void clear(){
        Arrays.fill(bufferData,clearColor);
    }

    public static void render(){
        bufferGraphics.setColor(new Color(0xff0000ff));
        bufferGraphics.fillOval(350,250,100,100);


    }
    public static void swapBuffers(){
        Graphics g = content.getGraphics();
        g.drawImage(buffer,0,0,null);

    }
}
