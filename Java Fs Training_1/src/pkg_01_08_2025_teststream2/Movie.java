package pkg_01_08_2025_teststream2;

public class Movie {
	private String name;
	private int year;
	private String hero;
	private String heroin;

	// Constructor
	public Movie(String name, int year, String hero, String heroin) {
		this.name = name;
		this.year = year;
		this.hero = hero;
		this.heroin = heroin;
	}

	
	@Override
	public String toString() {
		return "Movie [Name=" + name + ", Year=" + year + ", Hero=" + hero + ", Heroin=" + heroin + "]";
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public String getHero() {
		return hero;
	}


	public void setHero(String hero) {
		this.hero = hero;
	}


	public String getHeroin() {
		return heroin;
	}


	public void setHeroin(String heroin) {
		this.heroin = heroin;
	}
	


	// Main method
	public static void main(String[] args) {
		Movie m = new Movie("Ek Tha Tiger", 2012, "Salman Khan", "Katrina Kaif");
		
		System.out.println(m);
	}
}