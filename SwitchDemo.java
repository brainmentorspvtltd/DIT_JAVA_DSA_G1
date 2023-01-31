import java.util.Scanner;
/*
 * Enum (Java 5) - Enum is a Special type , that represents a group of constants (like final)
 */
enum FoodItems{
    BURGER, PIZZA, DRINKS , DESSERTS
}
public class SwitchDemo {
    public static void main(String[] args) {
        // final int BURGER = 1;
        // final int PIZZA = 2;
        // final int DRINKS = 3;
        // final int DESSERTS = 4;
        System.out.println("1. Burger");
        System.out.println("2. Pizza");
        System.out.println("3. Drinks");
        System.out.println("4. Desserts");
        //Scanner scanner= new Scanner(System.in);
        //int choice = scanner.nextInt();
        String choice = "Burger";
        switch(choice){
            case "Burger":
            System.out.println("Rs 100");
            break;
            case "Pizza":
            System.out.println("Rs 300");
            
        }
        //FoodItems choice  = FoodItems.PIZZA;
       // System.out.println("Choice is "+choice+" Internal Vallue is "+choice.ordinal());
       /*  switch(choice){
            case BURGER: // case 1:  choice == 1
            System.out.println("Rs 100");
            break; // exit from the switch case
            case PIZZA:
            System.out.println("Rs 300");
            break;
            case DRINKS:
            System.out.println("Rs 80");
            break;
            case DESSERTS:
            System.out.println("Rs 200");
            break;
            default:
            System.out.println("Wrong Choice...");


        }
        */
        //scanner.close();
    }
}
