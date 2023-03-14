/*
 * Can we override Private , final , static
 */
class Loan{
    //private void emi(){
        //final void emi(){
           // static void emi(){
             void emi(){
        System.out.println("ROI 9%");
    }
}
class EduLoan extends Loan{
    //@Override
     void emi(){
        System.out.println("ROI 8%");
    }
}
public class OverridePrivateFinalStatic {
    public static void main(String[] args) {
        //Loan.emi();

        Loan obj = new EduLoan();
        obj.emi();
    }
}
