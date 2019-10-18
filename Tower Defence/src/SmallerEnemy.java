
public class SmallerEnemy extends Enemy{
	private final int NORMAL_HEALTH = 25;
	private final int NORMAL_SPEED = 100;
	private final int NORMAL_ARMOUR = 10;
	private final int NORMAL_REWARD = 30;
	public SmallerEnemy() {
		this.health = NORMAL_HEALTH;
		this.speed = NORMAL_SPEED;
		this.armour = NORMAL_ARMOUR;
		this.reward = NORMAL_REWARD;
	}
}
