package pck1;

import worldEntities.Person;
import worldEntities.Rock;

public class World {
	
	public Person[] population = new Person[2];
	public Rock[] rocks = new Rock[20];
	public int currPopulation = 0;
	public int currRocks = 20;

    World() {
        // Initialize some people if needed
    }

    public void addPerson(Person person) {
        if (currPopulation >= 0 && currPopulation < population.length) {
            population[currPopulation] = person;
            currPopulation++;
        } else {
            System.out.println("Invalid index");
        }
    }
    
    public void addRock(Rock rock) {
        if (currRocks >= 0 && currRocks < rocks.length) {
            rocks[currRocks] = rock;
            currRocks++;
        } else {
            System.out.println("Invalid index");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("World: ");
        for (Person person : population) {
            if (person != null) {
                sb.append(person.getName()).append(", ");
            }
        }
        return sb.toString();
    }
	
	
}
