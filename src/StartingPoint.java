public class StartingPoint {
	public static void main(String yuri[]) {

		Travis t = new Travis();

		System.out.print(t.getHit());
		int i = t.damage(200, 1);
		System.out.print("\n" + i);
	}
}
