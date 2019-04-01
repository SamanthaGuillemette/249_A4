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


public class CellPhone {

	//Attributes
	
	/**Long number of the serialNum of the object CellPhone */
	private long serialNum;
	/**String brand name of the object CellPhone */
	private String brand;
	/**Int number of the manufacturing year of the object CellPhone */
	private int year;
	/**Double number of the price of the object CellPhone */
	private double price;
	
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
	
	/** Set route number passed to the constructor.  
	 * @param SR serialNum to set.
	 */
	public void setSerialNum(long SR) {
		serialNum = SR;
	}
	
	/** Set route number passed to the constructor.  
	 * @param B brand to set.
	 */
	public void setBrand(String B) {
		brand = B;
	}
	
	/** Set route number passed to the constructor.  
	 * @param Y year to set.
	 */
	public void setYear(int Y) {
		year = Y;
	}
	
	/** Set route number passed to the constructor.  
	 * @param B brand to set.
	 */
	public void setPrice(double P) {
		price = P;
	}
}
