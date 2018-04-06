
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
	public static void Sum(int customerArray){
		int totalPrice = 0;
		for(int i = 0; i <= customerArray.length; i++){
			totalPrice += customerArray[i];
		}
	}
	
	
	// This method will take the sum of the items selected and tax them appropriately 
	public static void Tax(int totalPrice){
		
		int taxTotalPrice = (int) ((totalPrice * 1.3) + totalPrice);  
		// nxt line show the sum with tax on a label or textbox in GUI
		
	}
	
	
	//This method will take off 10% of the total price of the users selected items
	public static void Coupon(int taxTotalPrice){
		
		int newTotalPrice = (int)((taxTotalPrice * 0.10) + taxTotalPrice);
	}
}
