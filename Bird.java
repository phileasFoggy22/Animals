
public class Bird extends Animal {
	private int wingspan;
	private String eggColour;
	private boolean nests;

	public Bird(int age, String colour, double height, double weight, int wingspan, String eggColour, boolean nests) {
		super(wingspan, eggColour, weight, weight);
		this.wingspan = wingspan;
		this.eggColour = eggColour;
		this.nests = nests;
	}

	public void fly() {
		System.out.println("Bird has flown");
	}

	public void layEggs(boolean nests) {

	}

	public int getWingspan() {
		return wingspan;
	}

	public void setWingspan(int wingspan) {
		this.wingspan = wingspan;
	}

	public String getEggColour() {
		return eggColour;
	}

	public void setEggColour(String eggColour) {
		this.eggColour = eggColour;
	}

	public boolean isNests() {
		return nests;
	}

	public void setNests(boolean nests) {
		this.nests = nests;
	}
}
