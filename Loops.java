public class Loops {
    public static void main(String[] args) {
        // for(int i = 1; i<=5; i++){
        //     System.out.println("Amit "+i);
        // }
        //while loop
        // int i =1; // Init (Step-1)
        // // 2nd Step (Condition)
        // while(i<=5){
        //     // 3rd Step (Repeat Logic)
        //     System.out.println("Amit");
        //     // 4th Step
        //     if(i%2==0){
        //         i=i+2;
        //     }
        //     else{

        //         i++;
        //     }
        // }

        // do while loop
    //     int j = 1; // Step-1 Init
    //     do{
    //         // Step-2 Repeat Logic
    //         System.out.println("Amit");
    //         j++; // Step-3 Operation
    //     }while(j>5); // Step-4 Condition Check

        int age = 21;
        // Box Syntax
        int arrOfAges []= {22,21,20,19,18};
        // Trad Loop
        // for(int i = 0; i<arrOfAges.length; i++){
        //     System.out.println(arrOfAges[i]);
        // }
        // Enhance For Loop (Java 5)
        for(int e : arrOfAges){
            System.out.println(e);
        }    
     }
}
