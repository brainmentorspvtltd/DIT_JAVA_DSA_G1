import java.util.Scanner;


public class Input2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Id ");
        int id = scanner.nextInt();
        System.out.println("Id is "+id); // 1002 \n
        System.out.println("Enter your Name");
        scanner.nextLine(); // eat \n
        String name = scanner.nextLine();
        System.out.println("Your Name is "+name);
        
        scanner.close();
        // int x = System.in.read();
        // System.out.println(x);
       // byte arr[]= System.in.readAllBytes();
        //System.out.println(arr);
    }
}
