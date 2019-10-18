

public class Game extends GameField implements Runnable{
	
	public int WIDTH,HEIGHT;
	public String title;
	
	private FramePerSec f;
	private boolean running = false;
	private Thread thread;
	
	private int MAP_MATRIX = SCREEN_WIDTH*SCREEN_HEIGHT;
	private GameTile tile[] = new GameTile[MAP_MATRIX];
	int a[][] = new int[][]{
						{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
						{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
						{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0},
						{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0},
						{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
						{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
						{0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
						{0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
						{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
						{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
						{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0},
						{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0},
						{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
						{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
						{0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
						{0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
						{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
						{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
						{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0},
						{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0},
					};
	public Game(String title,int width,int height) {
		this.WIDTH = width;
		this.HEIGHT = height;	
		this.title = title;
	}
	
	private void init() {
		GameField.display = new Display(title,WIDTH,HEIGHT);
		int count = 0;
		for(int i=0;i<SCREEN_WIDTH;i++) {
			for(int j=0;j<SCREEN_HEIGHT;j++) {
				if(a[j][i] == 0) {
					tile[count] = new Road(i*BLOCK_WIDTH,j*BLOCK_HEIGHT);
					tile[count].setImage("textures/dirt.png");
				}
				else {
					tile[count] = new Mountain(i*BLOCK_WIDTH,j*BLOCK_HEIGHT);
					tile[count].setImage("textures/grass.jpg");
				}
				count++;
			}
		}
	}
	private void tick() {
	}
	private void render() {
		for(int i = 0;i<MAP_MATRIX;i++) {
			tile[i].render();
		}
	}
	
	public void run() {
		
		init();
		f = new FramePerSec(1);
		f.lastTime = System.nanoTime();
		
		while(running) {
			if(f.nextRender()) {
				render();
				tick();
				GameTile.show();
			}
			f.navigateFPS();
		}
		stop();
	}
	public synchronized void start() {
		if(running) return;
		running = true;
		thread = new Thread(this);
		thread.start();
	}
	public synchronized void stop() {
		if(!running) return;
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
