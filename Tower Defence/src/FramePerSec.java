
public class FramePerSec {
	private final long SEC = 1000000000;	//1 sec = 1000000000 nanosec
	private final int FPS;		//frame per second(render 60 times per second)
	private final double IPS;	//IPS = Interval per Second (amount of time to the next render within one second)
	public long lastTime;
	private long now;
	private long timer = 0;
	private long ticks = 0;
	private double delta = 0;
	
	public FramePerSec() {
		FPS = 60;		//default for movement
		IPS = SEC / FPS;
	}
	public FramePerSec(int fps) {
		FPS = fps;				//incase to load a tile for example,just only need 30fps for efficiency
		IPS = SEC / FPS;
	}
	public boolean nextRender() {
		now = System.nanoTime();
		delta += (now-lastTime)/IPS ;
		boolean nextRender = false;
		if(delta >= 1) {
			nextRender = true;
			ticks++;		//keep track of numbers of time calling render
			delta--;
		}
		timer += now - lastTime;
		lastTime = now;
		return nextRender;
	}
	public void navigateFPS(){
		if(timer >= SEC) {
			System.out.println("Ticks and Frames: " + ticks);
			ticks = 0;
			timer = 0;
		}
	}
}
