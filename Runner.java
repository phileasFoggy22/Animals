
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mammal dog = new Mammal(10, "purple", 15.2, 3.7, true);
		Mammal lion = new Mammal(4, "yellow", 35.2, 8.7, true);
		Bird penguin = new Bird(4, "Tux", 5.2, 1.7, 2, "white", true);

		System.out.println(dog.getAge());
		dog.getOld();
		System.out.println(dog.getAge());

		System.out.println(lion.getWeight());
		lion.starve();
		System.out.println(lion.getWeight());

		penguin.fly();

	}

}
