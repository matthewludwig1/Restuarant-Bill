/*
  Matthew Ludwig
  March 6 2018
  This program calculates the total amount for a restaurnant bill.
 */

package restaurantbill;

/**
 *
 * @author malud0519
 */
import java.text.*; 
public class RestaurantBill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double meal = 10.50; // this is the input price of the meal
        double hst = meal *0.13; // this formula calculates the cost of tax
        double total = meal + hst; // this is the total sum of the meal 
        
        DecimalFormat x = new DecimalFormat ("##.##");
        DecimalFormat y = new DecimalFormat ("##.##");
        DecimalFormat z = new DecimalFormat ("##.##");
        
        
        System.out.println("Restaurant Bill");
        System.out.println("***************");
                
                
        System.out.println("Meal:      " +  x.format (meal));
        System.out.println("HST:       "  +  y.format (hst));
        System.out.println("Total      " +  z.format (total));
    }
    
}
