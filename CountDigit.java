import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = scanner.nextInt();
        int count = 0;
        while(num!=0){
        num = num/10; // MAke the number small
        count++; // Count the Digit
        }
        System.out.println(count);
        scanner.close();
    }
}
