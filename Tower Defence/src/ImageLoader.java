import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageLoader {
	public static BufferedImage loadImage(String path) {
		try {	//just in case there is error
			return ImageIO.read(ImageLoader.class.getResource(path));	//this is a image
		} catch (IOException e) {
			e.printStackTrace();	//if there is no image then dont run
			System.exit(1);
		}
		return null;
	}
}
