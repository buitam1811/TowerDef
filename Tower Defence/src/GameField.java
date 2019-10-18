
import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;

public abstract class GameField {
	protected static final int SCREEN_HEIGHT = 20;	//screen height divided as 20 blocks
	protected static final int SCREEN_WIDTH = 20;	//screen width divided as 20 blocks
	protected static final int BLOCK_WIDTH = 30;	//each block has 30 pixels width
	protected static final int BLOCK_HEIGHT = 30;	//each block has 30 pixels height
	
	public static Display display;
	public static BufferStrategy bs;
	public static Graphics2D graphic;

}
