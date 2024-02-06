package fool;

import java.util.ArrayList;

public class Continent {
	
	private String name;
	private ArrayList<Country> Countries = new ArrayList<Country>();
	
	public Continent(String name) { this.name = name; }
	
	public String toString() {return "Continent: " + name;}

	public ArrayList<Country> getCountries() {
		return Countries;
	}

	public void addCountry(Country country) {
		Countries.add(country);
	}
	
	public int findCountry(Country country) {
		int idx = 0;
		boolean found = false;
		while (idx < Countries.size() && !found) {
			if (country.isEqual(Countries.get(idx)))
				found = true;
			else
				idx++;
		}
		if (!found)
			idx = -1;
		return idx;
	}
}
