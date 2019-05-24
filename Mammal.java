
public class Mammal extends Animal {
	private boolean noisy;

	public Mammal(int age, String colour, double height, double weight, boolean noisy) {
		super(age, colour, weight, weight);
		this.noisy = noisy;
	}

	public void makeNoise(boolean noisy) {

	}

	public boolean isNoisy() {
		return noisy;
	}

	public void setNoisy(boolean noisy) {
		this.noisy = noisy;
	}
}
