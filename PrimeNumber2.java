public class PrimeNumber2 {
    public static void main(String[] args) {
        int num = 36;
        for(int i = 2; i<=Math.sqrt(num); i++){
            if(num % i ==0){
                System.out.println("Not a Prime Number");
                return ; // exit from the fn 
            }
        }
        System.out.println("Prime Number");
    }
}
