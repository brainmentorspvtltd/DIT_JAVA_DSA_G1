public class PrimeNumber {
    public static void main(String[] args) {
        // Approach - 1
        int num = 24;
        int factor = 0;
        // for(int i = 1 ; i<=num ; i++){
        //     if(num % i ==0){
        //         factor++;
        //     }
        // }
        for(int i = 2 ; i<=num-1 ; i++){
            if(num % i ==0){
                factor++;
            }
            if(factor==1){
                break;
            }
        }
        // System.out.println(factor==2?"Prime No ":"Not Prime No");
        System.out.println(factor==0?"Prime No ":"Not Prime No");

    }
}
