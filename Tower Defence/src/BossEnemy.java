
public class BossEnemy extends Enemy{
	private final int NORMAL_HEALTH = 300;
	private final int NORMAL_SPEED = 5;
	private final int NORMAL_ARMOUR = 100;
	private final int NORMAL_REWARD = 100;
	public BossEnemy() {
		this.health = NORMAL_HEALTH;
		this.speed = NORMAL_SPEED;
		this.armour = NORMAL_ARMOUR;
		this.reward = NORMAL_REWARD;
	}
}
