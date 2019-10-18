
public class NormalEnemy extends Enemy{
	private final int NORMAL_HEALTH = 50;
	private final int NORMAL_SPEED = 25;
	private final int NORMAL_ARMOUR = 50;
	private final int NORMAL_REWARD = 25;
	public NormalEnemy() {
		this.health = NORMAL_HEALTH;
		this.speed = NORMAL_SPEED;
		this.armour = NORMAL_ARMOUR;
		this.reward = NORMAL_REWARD;
	}
}
