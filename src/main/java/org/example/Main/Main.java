package org.example.Main;

import org.example.Display.Display;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Main {
    public static void main(String[] args) {
        Display.create(800,800,"Tanks");

        Timer t = new Timer(1000/60, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.render();
            }
        });
        t.setRepeats(true);
        t.start();
    }
}