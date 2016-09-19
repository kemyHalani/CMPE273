public class Generic<G> {
	private G g;

	public void setvalue(G g) {
		this.g = g;
	}

	public G getvalue() {
		return g;
	}

	public static String stringOb() {
		Generic<String> gs = new Generic<String>();
		gs.setvalue("Kemy");
		String name = gs.getvalue();
		System.out.println("Name of the person is: " + name);
		return name;
	}

	public static int integerOb() {
		Generic<Integer> gi = new Generic<Integer>();
		gi.setvalue(22);
		int age = gi.getvalue();
		System.out.println("Age of the person is: " + age);
		return age;
	}
}