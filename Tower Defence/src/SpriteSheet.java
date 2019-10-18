import java.awt.image.BufferedImage;

public class SpriteSheet {
	private BufferedImage sheet;
	
	public SpriteSheet(BufferedImage image) {
		this.sheet = image;
	}
	public void setSpriteSheet(BufferedImage image) {
		this.sheet = image;
	}
//	public void resize(int width,int height) {
//		Scalr.resize(sheet, Scalr.Method.BALANCED, width, height);
//	}
	public BufferedImage crop(int x,int y,int width,int height) {
		return sheet.getSubimage(x, y, width, height);
	}
}
