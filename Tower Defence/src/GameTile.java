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
		
		graphic.clearRect(0, 0, 600,600 );
		
		graphic.drawImage(this.image,0,0,600,600,null);
		
		graphic.dispose();
		bs.show();
	}
}