/*
 * Static vs Final
 */
// final with class - can't be inherit , we can;t modify this class.
import static java.lang.System.out;
class Customer{
    final int MIN = 1; // constant but instance 
    // final - Constant (So can't change) but because static it comes in memory only once.
    static final int MAX = 100;
    // static -  when class is loaded then it allocate it's memory
    // class loaded once so it comes once.
    static int counter; // static things will be loaded when class is loaded.
    String name; // Instance Variable - When u create the object then it comes in a memory
    int count; // Instance Variable
    static{
        out.println("Load During Class Loading..");
        counter = 1000;
    }
    Customer(){
        counter++; // Static 
        count++; 
        out.println("Static Counter "+counter+" Instance Count "+count);
    }
    static void show(){
        out.println("Static Show...");
    }
}   // instance variable comes N times if u create object N times.

final class R{
    final int A = 10; // Instance Variable constant
    final int B ;
    R(){
        B = 20;
    }
}
class RR{
    void show(){
        out.println("RR Show...");
    }
    // final with method - prevent overriding.
    final void print(){
        out.println("RR Print...");
    }
}
class RRChild extends RR{
    @Override
    void show(){
        super.show();
        out.println("RR Child Show...");
    }
    // @Override
    // void print(){

    // }
}
// class R2 extends R{

// }
public class StaticAndFinal {
   public static void main(String[] args) {
    Customer.show();
    Customer customer1 = new Customer();
    Customer customer2 = new Customer();
    Customer customer3 = new Customer();
    Customer customer4 = new Customer();
    // R obj  = new R();
    // System.out.println(obj.A+" "+obj.B);
    // //obj.A = 1000;
    //     // final - keyword (No Change)
    //     // final constant - ALL CAPS (Standard)
    //     final int MAX = 100; // Constant
        // final can be use with Local variable, where static can't be
   } 
}
