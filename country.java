import java.util.Scanner;

// 'class Program' is a common alternative to 'class Main'
class Program {
	
	public static void main(String[] args) {
	    // Scanner block
        Scanner read = New Scanner();
		String name = read.nextLine();
		String capital = read.nextLine();

		// Create instance of Country object and call Setter methods
	    Country c = new Country();
		c.name = setName(name);
	    c.capital = setCapital(capital);

		// Print fields and object attributes using Getter method
	    System.out.println("Country: " + getName());
	    System.out.println("Capital: " + getCapital());
    }
}

// Default access modifier for classes is package-private
class Country {

    // Private access modifier restricts access to only this class
    private String name;
    private String capital;

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