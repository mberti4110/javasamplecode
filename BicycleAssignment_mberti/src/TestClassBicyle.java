/* Bicycle Assignment
 * March 11, 2023
 * COP 2800C
 * Monica Berti
 * Main Class
 * This program will allow users to input characteristics of at least 5 bicycles, and output the data.  
 */
import java.util.Scanner;

public class TestClassBicyle {
	// main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // create scanner object

		// create variables for bicycle
		String bicycleColor, bicycleBrand, bicycleType;
		char bicycleGear, bicycleKids, bicycleElectric;
		int wheelHeight, bicycleCount = 0;
		boolean inputValid = false;

		// welcome user to program
		System.out.println("Welcome to the Bicycle Program!");
		while (!inputValid) {
			try {
				System.out.println("How many bicycles would you like to enter? (must be at least 5)");
				bicycleCount = input.nextInt();
				if (bicycleCount <5 ) {
					System.out.println("Invalid entry. Please enter a number equal to or greater than 5:");
					bicycleCount = input.nextInt();
				} else {
					inputValid = true;
				}
			} catch (Exception e){
				System.out.println("Invalid entry. Please enter a number.");
				inputValid = false;
			}
			}
		
		Bicycle[] bicycleInfo = new Bicycle[bicycleCount]; // create bicycle object
		// for loop for user input
		for (int i = 0; i < bicycleCount; i++) {
			//create new bicycle object in array
			bicycleInfo[i] = new Bicycle();
		
			System.out.println("Bicycle #" + (i + 1));
			// request color from user and set
			System.out.println("Please enter the color: ");
			bicycleColor = input.next().trim();
			bicycleInfo[i].setColor(bicycleColor);
			
			// request brand from user and set
			System.out.println("Please enter the brand: ");
			bicycleBrand = input.next().trim();
			bicycleInfo[i].setBrand(bicycleBrand);
			
			// request gear from user and set
			System.out.println("Does the bicycle have gear? ('Y' or 'N')");
			bicycleGear = input.next().charAt(0);
			bicycleGear = Character.toUpperCase(bicycleGear);
			bicycleInfo[i].setGear(bicycleGear);
			
			// request type from user and set
			System.out.println("Please enter the type of bicyle: ");
			bicycleType = input.next().trim();
			bicycleInfo[i].setType(bicycleType);
			
			// request wheel height from user and set
			System.out.println("Please enter the wheel height (in inches; must be equal to or greater than 12 inches): ");
			wheelHeight = input.nextInt();
			bicycleInfo[i].setWheelHeight(wheelHeight);
			
			// request if bicycle was made for children from user and set
			System.out.println("Is this bicycle made for children? ('Y' or 'N') ");
			bicycleKids = input.next().charAt(0);
			bicycleKids = Character.toUpperCase(bicycleKids);
			bicycleInfo[i].setKids(bicycleKids);
			
			// request if bicycle is electric from user and set
			System.out.println("Is the bicycle electric? ('Y' or 'N')");
			bicycleElectric = input.next().charAt(0);
			bicycleElectric = Character.toUpperCase(bicycleElectric);
			bicycleInfo[i].setElectric(bicycleElectric);
			
			//output data from bicycle
			System.out.println("Bicycle #" + (i+1) + ":\n" + bicycleInfo[i].toString());
			System.out.println();
			}
		
		//for loop to output bicycle data
		for (int i=0; i<bicycleCount;i++) {
			System.out.println("Bicycle #" + (i+1) + ":\n" + bicycleInfo[i].toString());
			System.out.println();
		}
		input.close(); //close scanner

	}
	
}
