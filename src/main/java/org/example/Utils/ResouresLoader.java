package org.example.Utils;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ResouresLoader {

    public static final String PATH = "Res/";

    public static BufferedImage LoadImage(String fileName) {

        BufferedImage image = null;

        try {

            image = ImageIO.read(new File(PATH + fileName));

        } catch (IOException e) {
            e.printStackTrace();
        }

        return image;
    }


}
