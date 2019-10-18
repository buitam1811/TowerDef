
public class NormalBullet extends Bullet{
	private final int NORMAL_BULLET = 2;
	private final int NORMAL_DAMAGE = 1;
	private final int NORMAL_RANGE = 2;
	
	public NormalBullet() {
		this.bullet_speed = NORMAL_BULLET;
		this.damage = NORMAL_DAMAGE;
		this.range = NORMAL_RANGE;
	}
}
