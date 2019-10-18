
public class MachineBullet extends Bullet{
	private final int MACHINE_SPEED = 3;
	private final int MACHINE_DAMAGE = 2;
	private final int MACHINE_RANGE = 1;
	
	public MachineBullet() {
		this.bullet_speed = MACHINE_SPEED;
		this.damage = MACHINE_DAMAGE;
		this.range = MACHINE_RANGE;
	}
}
