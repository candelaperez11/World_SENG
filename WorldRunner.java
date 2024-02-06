package pck1;

import worldEntities.Person;
import worldEntities.Rock;

public class WorldRunner {

	public static void main(String[] args) {
		
		World wrld = new World();
		//Person michaelJ = new Person("Michael Jackson", 65, true, "HEEHEEE2009");
		
		wrld.addPerson(new Person("Michael Jackson", 65, true, "HEEHEEE2009", false));
		wrld.addPerson(new Person("Doramion", 44, true, "GORROCOPTERO0", true));

		for (int i = 0; i < wrld.currRocks; i++)
			wrld.rocks[i] = new Rock();
		
		for (Person indiv : wrld.population)
			indiv.breath();
		
		for (Rock rock : wrld.rocks)
			System.out.println(rock.getImage());
		
		
	}

}
