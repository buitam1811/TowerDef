
public class TankerEnemy extends Enemy{
	private final int NORMAL_HEALTH = 75;
	private final int NORMAL_SPEED = 15;
	private final int NORMAL_ARMOUR = 75;
	private final int NORMAL_REWARD = 50;
	public TankerEnemy() {
		this.health = NORMAL_HEALTH;
		this.speed = NORMAL_SPEED;
		this.armour = NORMAL_ARMOUR;
		this.reward = NORMAL_REWARD;
	}
}
