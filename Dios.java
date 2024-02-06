package firstPackage;

public class Dios {
	private int age;
	private String name;
	
	public Dios(int age, String name){
		this.age = age;
		this.name = name;
	}
	public int getAge() {
        return age;
    }
	public String toStringAge(int age) {
		return " Edad " + age;
	}
	
    public String getName() {
        return name;
    }
    public String setCadena() {
    	return toStringAge(getAge()) + " " +  name;
    }
    public String toString() {
    	return setCadena();
    }
}
