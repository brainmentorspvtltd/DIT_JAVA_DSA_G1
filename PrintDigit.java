import java.util.Scanner;

public class PrintDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter the Number");
        //int num = scanner.nextInt();
        int num = 7245;
        int copy = num;
        int count = 0;
        while(num!=0){
        num = num/10; // MAke the number small
        count++; // Count the Digit
        }
        int power = 1;
        //System.out.println(count);
        while(count>1){
            power = power * 10;
            count--;
        }
        //System.out.println("Power is "+power);
        // Compute the Power

        while(copy!=0){
            System.out.println(copy/power);
            copy = copy % power;
            power = power/10;
        }

    }
}
