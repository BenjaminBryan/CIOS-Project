
/*
 * The goal of this class is to collect information from the user pertaining to selected items 
 * from the items list. Each item will have a price and be taxed accordingly. Afterwards
 * if a coupon is available to the user, a certain percent may be taken off the total cost
 * resulting in a new sale total appearing prior to purchase. 
 */
import java.util.*;
import java.util.Calendar;
 
public class Functionality {
//ArrayList<//Whatever info from database is> customerArray = new ArrayList<>();
	//This method will take all the items from the selected list and add their prices together

Calendar rightNow = Calendar.getInstance(); 
/* clerk creates every item and it is automatically inserted into the database via SQL.
 * Then this code connects to the SQL main RetrieveItem method, so when you type
 * the item id a price is returned, then put into an array here. after the sum method
 * then adds all the prices from the newly made array.
*/

	public static void Sum(double customerArray){
		double totalPrice = 0;
		for(double i = 0; i <= customerArray.length; i++){
			totalPrice += customerArray[i];
		}
	}
	
	
	// This method will take the sum of the items selected and tax them appropriately 
	public static void Tax(double totalPrice){
		
		double taxTotalPrice = (double) ((totalPrice * 1.3) + totalPrice);  
		// next line show the sum with tax on a label or textbox in GUI
		
	}
	
	
	//This method will take off 10% of the total price of the users selected items
	public static void Coupon(double taxTotalPrice){
		
		double newTotalPrice = (double)((taxTotalPrice * 0.10) + taxTotalPrice);
	}
}
