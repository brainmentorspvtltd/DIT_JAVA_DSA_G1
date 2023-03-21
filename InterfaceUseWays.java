/*
 * In How many ways we can use interface in Java?
 */
// SAM Interface
@FunctionalInterface
interface Calculator{
    int compute(int x, int y);
    
}
// 1st way - class create and do implement
// a) implements
class MyCalc implements Calculator{
    // b) override abstract method
    @Override
    public int compute(int x, int y){
        return x + y;
    }
}
class Rparent{
    void show(){
        System.out.println("I am the R Show...");
    }
}
public class InterfaceUseWays {
    public static void main(String[] args) {
        Rparent r = new Rparent(){
            @Override
            void show(){
                System.out.println("R Child show....");
                this.print();
            }
            void print(){
                System.out.println("R Child Print...");
            }
        };
        r.show();
        // // c) create object
        // Calculator obj = new MyCalc(); // Upcasting
        // // d) call 
        // int result = obj.compute(10, 20);
        // System.out.println(result);

        // During Object creation we create a class
        // 2nd way - Anonymous class
        // Calculator obj = new Calculator(){
        //     @Override
        //     public int compute(int a, int b){
        //         return a * b;
        //     }
        // };
        // int r = obj.compute(100, 5);
        // System.out.println(r);

        // 3rd way - Java 8 onwards Lambda Expression
        //Calculator obj2  = (int a, int b)->a+b;
        Calculator obj2 = (int a, int b)->{
            System.out.println("A is "+a+" B is "+b);
            int c = a + b;
            return c;
        };
        System.out.println(obj2.compute(10, 3));


    }
}
