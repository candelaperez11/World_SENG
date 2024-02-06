package fool;

import java.util.ArrayList;

public class Country {
	
	private String name;
	private String capital;
	private ArrayList<City> Cities = new ArrayList<City>();
	
	public Country(String name){ this.name = name; this.capital = "Unknown"; }
	
	public String toString() {return "Country " + name + " with capital city " + capital;}

	public ArrayList<City> getCities() {
		return Cities;
	}
	
	public void setCapital(String capital) {
		this.capital = capital;
	}

	public void addCity(City city) {
		Cities.add(city);
	}
	
	public boolean isEqual(Country country) {
		return this.name == country.name;
	}
}
