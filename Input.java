public class Input {
    public static void main(String[] args) {
        // String convert int type
        // int firstNumber = Integer.parseInt(args[0]);
        // int secondNumber = Integer.parseInt(args[1]);
        // int result = firstNumber + secondNumber;
        //System.out.println("Sum is "+result);
        int sum =0;
        for(int i = 0 ; i<args.length; i++){
            sum = sum + Integer.parseInt(args[i]);
        }
        System.out.println("Sum is "+sum);
    }
}
