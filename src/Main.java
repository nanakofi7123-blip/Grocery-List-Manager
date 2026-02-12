import java.util.Arrays;
import java.util.Scanner;
// Nana Kofi Owusu- Ampadu, 10/13/2025, Grocery List Manager
public class Main{
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int count = 0;
        String[] GroceryList = new String[6];

// Use a while loop for the reading of 6 grocery lists until it's valid
        while (count < 6){
            System.out.print("Enter grocery item: ");
            String item = input.nextLine();
            if (isDuplicate(item, GroceryList, count)){
                System.out.println("Sorry, item: " + item + " is a duplicate");
            } else {
                GroceryList[count] = item;
                count++;
            }
        }
        Arrays.sort(GroceryList);
        System.out.println("\nYour Grocery List");
        for (String item : GroceryList){
            System.out.println(item);
        }
    }
    private static boolean isDuplicate(String item, String[] GroceryList, int count){
        for (int i = 0; i < count; i++){
            if (GroceryList[i].equalsIgnoreCase(item)){
                return true;
            }
        }
        return false;
    }


}
