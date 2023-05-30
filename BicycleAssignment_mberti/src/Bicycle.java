/* Bicycle Assignment
 * March 11, 2023
 * COP 2800C
 * Monica Berti
 * Bicycle Class
 * This program will allow users to input characteristics of at least 5 bicycles, and output the data.  
 */
public class Bicycle {
	private String color;
	private String brand;
	private Character gear;
	private String type;
	private Integer wheelHeight;
	private Character kids;
	private Character electric;
	
	//constructor
	public Bicycle(String color, String brand, Character gear, String type, Integer wheelHeight, Character kids,
			Character electric) {
		this.color = color;
		this.brand = brand;
		this.gear = gear;
		this.type = type;
		this.wheelHeight = wheelHeight;
		this.kids = kids;
		this.electric = electric;
	}
	
	//default constructor (no arguments)
	public Bicycle() {
		this(null, null, null, null, 0, null, null);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if (color != null) {
            this.color = color;
        } else {
            throw new IllegalArgumentException("Color cannot be null or empty.");
        }
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		if (brand != null) {
            this.brand = brand;
        } else {
            throw new IllegalArgumentException("Brand cannot be null or empty.");
        }
	}

	public Character getGear() {
		return gear;
	}

	public void setGear(Character gear) {
		if (gear == 'N' || gear == 'Y') {
            this.gear = gear;
        } else {
            throw new IllegalArgumentException("Gear must be 'Y' or 'N'.");
        }
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		if (type != null) {
            this.type = type;
        } else {
            throw new IllegalArgumentException("Type cannot be null or empty.");
        }
	}

	public Integer getWheelHeight() {
		return wheelHeight;
	}

	public void setWheelHeight(Integer wheelHeight) {
		if (wheelHeight >= 12) {
            this.wheelHeight = wheelHeight;
        } else {
            throw new IllegalArgumentException("Wheel Height must be equal to or greater than 12 inches.");
        }
	}

	public Character getKids() {
		return kids;
	}

	public void setKids(Character kids) {
		if (kids == 'N' || kids == 'Y') {
            this.kids = kids;
        } else {
            throw new IllegalArgumentException("Entry must be 'Y' or 'N'.");
        }
	}

	public Character getElectric() {
		return electric;
	}

	public void setElectric(Character electric) {
		if (electric == 'N' || electric == 'Y') {
            this.electric = electric;
        } else {
            throw new IllegalArgumentException("Entry must be 'Y' or 'N'.");
        }
	}

	@Override
	public String toString() {
		String output;
		output = "color: " + color + "\nbrand: " + brand + "\ngear included: " + gear + "\nbicycle type: " + type + "\nwheel height: " + wheelHeight + "\nchild bicycle: " + kids + "\nelectric: " + electric;
		return output;
	}
	
	
	
}
