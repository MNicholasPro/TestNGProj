package factory;

import org.testng.annotations.Test;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * Created by April_Chou on 2017/5/21.
 */
public class PictureTest {
    private Image image;
    private int width;
    private int height;
    private String path;

    public PictureTest(String path, int width, int height, int depth) throws IOException{
        File f = new File(path);
        this.path = path;
        this.image = ImageIO.read(f);
        this.width = width;
        this.height = height;
    }

    @Test
    public void thstWidth(){

    }

    @Test
    public void testHeight(){

    }
}
