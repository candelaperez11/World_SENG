package worldEntities;

public class Person extends Animates {

	private String name;
	private int age;
	private boolean sex; // 0 female, 1 male
	private String nif;
	private boolean alive;
	
	public Person(String name, int age, boolean sex, String nif, boolean alive) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.nif = nif;
		this.alive = alive;
	}
	
	public String getName() {
		return name;
	}
	
	public void breath() {
		if (alive)
			System.out.println(name + " is breathing");
		else
			System.out.println(name + " has passed away");
	}
}
