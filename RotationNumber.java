public class RotationNumber {
    public static void main(String[] args) {
        int num = 12345;
        int rotation = -2;
        // Step-1 // Count the Digit
        int copy = num;
        int count = 0;
        while(copy!=0){
            copy = copy /10; // Make Number Small
            count++;
        }
        //rotation Larger (Count )
        rotation =  rotation % count; // Now with in the range
        // Negative rotation
        if(rotation<0){
            rotation = rotation + count;
        }
        // Left Part and Right Part
        int power = (int)Math.pow(10, rotation);
        int right = num % power;
        int left  = num / power;
        int diff = count - rotation;
        power = (int)Math.pow(10, diff);
        int result = right * power + left;
        System.out.println(result);
        
    }
}
