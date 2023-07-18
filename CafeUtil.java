// import java.util.ArrayList;
import java.util.ArrayList;

public class CafeUtil {
    // Get Streak Goal

    public int getStreakGoal(int numWeeks) {
        int sum = 0;
        for (int i = 1; i <= numWeeks; i++) {
            sum += i;
        }
        return sum;
    }

    
    public double getOrderTotal(double[] prices) {
        double total = 0;
        for (int i = 0; i < prices.length; i++) {
            total = total + prices [i]; 

        }
        return total; 
    }

    void displayMenu(ArrayList<String> menuItems) {
        // to access an element in an ArrayList using an index
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.printf("%s %s\n", i, menuItems.get(i));

        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your precious name:");
        String userName = System.console().readLine();
        System.out.println("Hello," + userName); 
        System.out.printf("There are %s people in front of you", customers.size());
        customers.add(userName);
    }
    
}
