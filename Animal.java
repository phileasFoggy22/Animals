
public class Animal {
	private int age;
	private String colour;
	private double height;
	private double weight;

	public int getOld() {
		return this.age++;
	}

	public Animal(int age, String colour, double height, double weight) {
		super();
		this.age = age;
		this.colour = colour;
		this.height = height;
		this.weight = weight;
	}

	public double grow() {
		this.height = height * 1.1;
		return this.height;
	}

	public double starve() {
		this.weight = weight * 0.9;
		return this.weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
}
