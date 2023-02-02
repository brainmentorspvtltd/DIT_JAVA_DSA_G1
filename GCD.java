public class GCD {

    static int computeGCD(int x, int y){
        while(x%y!=0){
            int rem = x % y;
            x = y;
            y = rem;

       }
       return y;

    }
    public static void main(String[] args) {
        // Simple Approach
        // int x = 40;
        // int y = 48;
        // //int min = Math.min(x,y);
        // int min = x<y?x:y;
        // while(min>0){
        //     if(x%min ==0 && y % min ==0){
        //         System.out.println("GCD "+min);
        //         return ;
        //     }
        //     min--;
        // }
        // Euclidean Algo (Sub Method)
        //  while(x!=y){
        //     if(x>y){
        //         x = x - y;
        //     }
        //     else{
        //         y = y - x;
        //     }
        //  } 
        //  System.out.println(x);  
       // Euclidean Algo (Division Method)
      
       //System.out.println("GCD "+y);

       int nums [] = {40,42,44,48};
       int x = nums[0];
       for(int i = 1; i<nums.length; i++){
        int y = nums[i];   
        x = computeGCD(x,y);
       }
       System.out.println(x);

    }
}
