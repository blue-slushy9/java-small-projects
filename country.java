// 'class Program' is a common alternative to 'class Main'
class Program {
	
	public static void main(String[] args) {
	    // Create new instance of Country object called 'c'
	    Country c = new Country();
	    // Set object attributes
	    c.name = "France";
	    c.capital = "Paris";
		// Print fields and object attributes
	    System.out.println("Country: " + c.name);
	    System.out.println("Capital: " + c.capital);
    }
}

// Default access modifier for classes is package-private
class Country {

    // Private access modifier restricts access to only this class
    private String name;
    private String capital;
}