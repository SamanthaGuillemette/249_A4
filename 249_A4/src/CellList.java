import java.util.Scanner;

public class CellList {

	public class CellNode implements Cloneable{
		
		
		//Attributes
		/**CellPhone object as attribute for object CellNode */
		private CellPhone CP;
		/**CellNode object as pointer for object CellNode */
		private CellNode pointer;
		
		
		//Constructor
		
		//Default
		/**
		 * Default constructor
		 * 
		 * initializes object to valid values
		 * @param CP is set to null.
		 * @param pointer is set to null.
		 */
		public CellNode() {
			this.CP = null;
			this.pointer = null;
			
		}
		
		//Parametrized
		/**
		 * Parameterized Constructor
		 * initializes object using passed parameters
		 * @param CP is the CellPhone object of CellNode, type CellPhone object. Required.
		 * @param CN is the pointer of the CellNode, type CellNode object. Required.
		 */
		public CellNode(CellPhone CP, CellNode CN) {
			this.CP = CP;
			this.pointer = CN;	
		}
		
		//Copy
		/**
		 * Copy Constructor
		 * Makes a copy of the object passed
		 * @param CN is the object type CellNode passed. Required.
		 */
		public CellNode(CellNode CN) {
			CP = CN.CP; 
			pointer = CN.pointer;
		}
		
		//Methods
		
		//Accessors
		
		/** @return CP passed to the constructor.  */
		public CellPhone getCP() {
			return CP;
		}
		
		/** @return pointer passed to the constructor.  */
		public CellNode getPointer() {
			return pointer;
		}
		
		//Mutators
		
		/** Set CP passed to the constructor.  
		 * @param CP CellPhone to set.
		 */
		public void setCP(CellPhone cp) {
			CP = cp;
		}
		
		/** Set CP passed to the constructor.  
		 * @param CP CellPhone to set.
		 */
		public void setPointer(CellNode P) {
			pointer = P;
		}
		
		//clone method
		//Recheck later
		/** Creates and returns copy of the object CellNode
		 * @return deep clone of copy of CellNode object
		 */
		@Override
		public CellNode clone() throws CloneNotSupportedException{
			
			CellNode clonedCN = (CellNode)super.clone();
			clonedCN.setCP((CellPhone)clonedCN.getCP().clone());
			clonedCN.setPointer((CellNode)clonedCN.getPointer().clone());
			
		    return clonedCN;	
		}
		
		
	}
}
