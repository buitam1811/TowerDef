
public class SniperBullet extends Bullet{
	private final int SNIPER_SPEED = 1;
	private final int SNIPER_DAMAGE = 3;
	private final int SNIPER_RANGE = 2;
	
	public SniperBullet() {
		this.bullet_speed = SNIPER_SPEED;
		this.damage = SNIPER_DAMAGE;
		this.range = SNIPER_RANGE;
	}
}
