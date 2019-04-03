import java.util.Objects;
import java.util.Scanner;




/**
 * 
 * CellPhone uses linked lists to manipulates a set of records of cell phones and performs some operations on these records.
 * 
 * COMP 249
 * Assignment 4 Part II
 * Due Date: April 8th, 2019
 *  
 * @author Samantha Guillemette, ID 26609198
 * 
 * 
 * 
 */

// -----------------------------------------------------
// Assignment 4
// Question: Part II
// Written by: Samantha Guillemette, ID 26609198
// -----------------------------------------------------


public class CellPhone implements Cloneable{

	//Attributes
	
	/**Long number of the serialNum of the object CellPhone */
	private long serialNum;
	/**String brand name of the object CellPhone */
	private String brand;
	/**Int number of the manufacturing year of the object CellPhone */
	private int year;
	/**Double number of the price of the object CellPhone */
	private double price;
	
	//Construtors
	
	//Default
	/**
	 * Default constructor
	 * 
	 * initializes object to valid values
	 * @param serialNum is set to 0.
	 * @param brand is set to null.
	 * @param year is set to 0.
	 * @param price is set to 0.
	 */
	public CellPhone() {
		this.serialNum = 0;
		this.brand = null;
		this.year = 0;
		this.price = 0;
	}
		
	//Parametrized
	/**
	 * Parameterized Constructor
	 * initializes object using passed parameters
	 * @param SN is the serialNum of the CellPhone, type long. Required.
	 * @param B is the brand of the CellPhone, type String. Required.
	 * @param Y is the year of the CellPhone, type int. Required.
	 * @param P is the price of the CellPhone, type double. Required.
	 */
	public CellPhone(long SN, String B, int Y, double P) {
		this.serialNum = SN;
		this.brand = B;
		this.year = Y;
		this.price = P;		
	}
		
	//Copy
	/**
	 * Copy Constructor
	 * Makes a copy of the object passed
	 * @param CP is the object type CellPhone passed. Required.
	 * @param SN is the serialNum of the CellPhone, type long. Required.
	 */
	public CellPhone(CellPhone CP, long SN) {
		serialNum = SN;
		brand = CP.brand; 
		year = CP.year;
		year = CP.year;
	}
	
	
	//Methods
	
	//Accessors
		
	/** @return serialNum passed to the constructor.  */
	public long getSerialNum() {
		return serialNum;
	}
	
	/** @return brand passed to the constructor.  */
	public String getBrand() {
		return brand;
	}
	
	/** @return year passed to the constructor.  */
	public int getYear() {
		return year;
	}
	
	/** @return price passed to the constructor.  */
	public double getPrice() {
		return price;
	}
	
	//Mutators
	
	/** Set serial number passed to the constructor.  
	 * @param SN serialNum to set.
	 */
	public void setSerialNum(long SN) {
		serialNum = SN;
	}
	
	/** Set brand passed to the constructor.  
	 * @param B brand to set.
	 */
	public void setBrand(String B) {
		brand = B;
	}
	
	/** Set year passed to the constructor.  
	 * @param Y year to set.
	 */
	public void setYear(int Y) {
		year = Y;
	}
	
	/** Set price passed to the constructor.  
	 * @param P price to set.
	 */
	public void setPrice(double P) {
		price = P;
	}
	
	//Clone method RECHECK!!!
	//clone() method. This method will prompt the user to enter a new serial number, then creates and returns a clone of the calling object with the exception of the serial number, which is assigned the value entered by the user
	/** Creates and returns copy of the object CellPhone
	 * @return deep clone of copy of CellPhone object
	 */
	@Override
	public CellPhone clone() throws CloneNotSupportedException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a new serial number:");
		long SN = sc.nextLong();
		
		
		sc.close();
		
		CellPhone CP = (CellPhone)super.clone();
	    CP.serialNum = SN; 
	    return CP;	
	}
	
	
	//Additionally, the class should have a toString() and an equals() methods. 
	//Two cell phones are equal if they have the same attributes, with the exception of the serial number, which could be different.

	//toStrong method
	/**
	 * The string representation is 
	 * "[serialNum: brand price$ year]"
	 */
	@Override
	public String toString() {
		return("[" + serialNum + ": " + brand + " " + price + "$ " + year + "]");
	}
		
	//equals 
	/**
	 *
	 * Compare two CityBus objects for equality. 
	 * Two CityBus objects are considered equal if they have the same numOfStops, ticketPrice, lineName, routeNum, beginOperationYear and driversName.
	 * @param other parameter of class type Object to be compared.
	 * @return boolean true if the two CityBus objects are equal, and false if the object passed is null and if the object is not the right type.
	 */
	@Override
	public boolean equals(Object other) {
		//self check
		if(this == other) {
			return true;
		}
			
		//check if null
		if(other == null) {
			return false;
		}
				
		//check type
		if(this.getClass() != other.getClass()) {
			return false;
		}
				
		//cast
		CellPhone CP = (CellPhone)other;
				
		//check field comparison
		return (Objects.equals(brand, CP.brand)&&
				Objects.equals(year, CP.year)&&
				Objects.equals(price, CP.price));
	}

}
