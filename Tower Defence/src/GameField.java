
import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;

public abstract class GameField {
	protected final int SCREEN_HEIGHT = 20;	//blocks
	protected final int SCREEN_WIDTH = 20;	//blocks
	protected final int BLOCK_WIDTH = 30;	//each block has 30 pixels width
	protected final int BLOCK_HEIGHT = 30;	//each block has 30 pixels height
	
	public static Display display;
	public static BufferStrategy bs;
	public static Graphics2D graphic;

}
