public class Travis implements CharacterInterface {

	@Override
	public String getHit() {
		// TODO Auto-generated method stub
		String travisGotHit = "That tickled a bit!";
		return travisGotHit;
	}

	@Override
	public int damage(int curHealth, int damage) {
		// TODO Auto-generated method stub
		int newHealth = curHealth - damage;
		if (newHealth > 0) {
			return newHealth;
		} else {
			return 0;
		}

	}
}