import java.awt.Graphics2D;

public class GameTile extends GameEntity{
	public GameTile(int posX,int posY) {
		super(posX,posY);
	}
	public void render() {
		bs = GameField.display.getCanvas().getBufferStrategy();
		if(bs == null) {
			GameField.display.getCanvas().createBufferStrategy(3);
			return ;
		}
		graphic = (Graphics2D) bs.getDrawGraphics();
		
		
		
		graphic.drawImage(this.image,posX,posY,BLOCK_WIDTH,BLOCK_HEIGHT,null);
		
		graphic.dispose();
	}
	public static void show() {
		//graphic.clearRect(0, 0, SCREEN_WIDTH*BLOCK_WIDTH,SCREEN_HEIGHT*BLOCK_HEIGHT ); //if this code activated then it gonna be messed up
		bs.show();
	}
}