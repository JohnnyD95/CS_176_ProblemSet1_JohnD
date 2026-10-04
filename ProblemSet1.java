package edu.monmouth.ProblemSet1;

public class ProblemSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	CampusVehicle vehicle1 = new CampusVehicle("001","Library",true); //creates vehicle 1 with values
	System.out.println(vehicle1.getId());
	System.out.println(vehicle1.getLocation());
	System.out.println(vehicle1.isAvailable()); // prints vehicle 1 values
	
	CampusVehicle vehicle2 = new CampusVehicle(); // creates vehicles 2-4 with defualt constructor
	CampusVehicle vehicle3 = new CampusVehicle();
	CampusVehicle vehicle4 = new CampusVehicle();
	
	System.out.println(vehicle2.getId()); // prints defaults
	System.out.println(vehicle2.getLocation());
	System.out.println(vehicle2.isAvailable());
	
	System.out.println(vehicle3.getId()); // prints defaults
	System.out.println(vehicle3.getLocation());
	System.out.println(vehicle3.isAvailable());
	
	System.out.println(vehicle4.getId()); // prints defaults
	System.out.println(vehicle4.getLocation());
	System.out.println(vehicle4.isAvailable());
	
	vehicle2.setId("002"); // Setter method for 2nd vehicle
	vehicle2.setLocation("Parking Lot");
	vehicle2.setAvailable(false);
	
	System.out.println(vehicle2.getId()); // prints new values in getter method above.
	System.out.println(vehicle2.getLocation());
	System.out.println(vehicle2.isAvailable());
	
	
	vehicle3.setId("003"); // Setter method for 3rd vehicle
	vehicle3.setLocation("University Bluffs");
	vehicle3.setAvailable(true);
	
	vehicle4.setId("004"); // Setter method for 4th vehicle
	vehicle4.setLocation("Spruce Hall");
	vehicle4.setAvailable(true);
	
	System.out.println(vehicle3.getId()); // prints new values in getter method above.
	System.out.println(vehicle3.getLocation());
	System.out.println(vehicle3.isAvailable());
	
	System.out.println(vehicle4.getId()); // prints new values in getter method above.
	System.out.println(vehicle4.getLocation());
	System.out.println(vehicle4.isAvailable());
	

	}

}
