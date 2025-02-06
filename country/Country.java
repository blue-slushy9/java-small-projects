import java.util.Scanner;

public class Country {
	
	public static void main(String[] args) {
	    // Scanner block
        Scanner read = new Scanner(System.in);
		String name = read.nextLine();
		String capital = read.nextLine();
        read.close();

		// Create instance of Country object and call Setter methods
	    CountryDetails cd = new CountryDetails();
		cd.setName(name);
		cd.setCapital(capital);

		// Print fields and object attributes using Getter method
	    System.out.println("Country: " + cd.getName());
	    System.out.println("Capital: " + cd.getCapital());
    }
}

// Default access modifier for classes is package-private
class CountryDetails {

    // Private access modifier restricts access to only this class
    private String name;
    private String capital;

	// No-argument constructor (recommended)
	public CountryDetails() {}

	// Setter method for name
	public void setName(String name) {
        this.name = name;
	}
	// Getter method for name
	public String getName() {
		return name;
	}

	// Setter method for capital
	public void setCapital(String capital) {
		this.capital = capital;
	}
	// Getter method for capital
	public String getCapital() {
		return capital;
	}
}