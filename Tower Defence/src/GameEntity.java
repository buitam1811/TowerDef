
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;


public abstract class GameEntity extends GameField{
	
	//every thing in the field needs to have possition
	protected int posX;	
	protected int posY;
	protected BufferedImage image;		//everything has a texture
	
	
	public BufferedImage loadImage(String path) {
		try {	//just in case there is error
			return ImageIO.read(ImageLoader.class.getResource(path));	//this is a image
		} catch (IOException e) {
			e.printStackTrace();	//if there is no image then dont run
			System.exit(1);
		}
		return null;
	}
	
	public GameEntity() {
		
	}
	public GameEntity(int posX,int posY) {
		this.posX = posX;
		this.posY = posY;
	}
	public void setImage(String path) {
		this.image = loadImage(path);
	}
	public void crop(int x,int y,int width,int height) {
		this.image = this.image.getSubimage(x, y, width, height);
	}
	public int getX() {
		return this.posX;
	}
	public int getY() {
		return this.posY;
	}
	public void render() {	
	}
	public void tick() {
	}
}
