import javax.swing.JButton;

/*
 * IQ - Abstract Class vs Final in Java
 */
abstract class Course{
   int duration;
   double amount;
   String eligable; 
   abstract void apply();
}
class Eng extends Course{

    @Override
    void apply() {
        // TODO Auto-generated method stub
        System.out.println("PCM");
    }

}
class Mgmt extends Course{

    @Override
    void apply() {
        // TODO Auto-generated method stub
        System.out.println("Commerce...");
    }

}
final class Tri{

}
class Account{
   final void withDraw(){

    }
    void deposit(){

    }
}
class FixedDepositAccount extends Account{
    final int MIN = 1; // Instance Variable
    @Override
    void deposit(){

    }
    // @Override
    // void withDraw(){

    // }
}
// class MathOpr extends Tri{

// }
public class AbstractClassvsFinal {
    public static void main(String[] args) {
        JButton j = new JButton();
       final int MAX = 100; // constant
       final double PI = 3.14; // Final with Local
      // MAX++;
    }
}
