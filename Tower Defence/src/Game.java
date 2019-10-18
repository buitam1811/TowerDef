

public class Game implements Runnable{
	
	public int WIDTH,HEIGHT;
	public String title;
	
	private FramePerSec f;
	private boolean running = false;
	private Thread thread;
	
	
	private GameEntity entity = new Road(0,0);
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
		entity.setImage("/textures/trish.jpg");
	}
	private void tick() {
	}
	private void render() {
		entity.render();
	}
	
	public void run() {
		
		init();
		f = new FramePerSec(1);
		f.lastTime = System.nanoTime();
		
		while(running) {
			if(f.nextRender()) {
				render();
				tick();
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
