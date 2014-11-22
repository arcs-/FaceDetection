package biz.stillhart.face;

import biz.stillhart.face.model.FaceImage;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class FaceImageTest {


    public static void main(String[] args) throws Exception {
          BufferedImage bi = ImageIO.read(FaceImageTest.class.getResourceAsStream("test.jpg"));
      //  BufferedImage bi = ImageIO.read(FaceImageTest.class.getResourceAsStream("me.png"));


        FaceImage face = new FaceImage(bi);
        face.setNoCropMultiplier(0);
        face.setAdditionPadding(30);
        face.setDimension(128,128);

        File outputfile = new File("/home/benutzer/Downloads/result.png");
        ImageIO.write(face.getScaledProfileFace(), "png", outputfile);
    }

}