/*
 * Abstract class
 */
// Loan Common/Generic Features
// abstract may have abstract methods
// if class has any abstract method so that class be abstract.
abstract class Loan{
    double deposit;
    String name;
    int id;
    Loan(){
        System.out.println("Loan Class Cons Call....");
    }
    void applyForLoan(){
        System.out.println("Loan :: Apply For Loan...");
    }
    // abstract methods (body less or no defination ) only declare
    abstract void emi();
    abstract void roi();
}
// Partial Abstract Implemention
abstract class Common extends Loan{
    @Override
    void emi() {
        System.out.println("Home Loan EMI");
    }
}
class HomeLoan extends Common{
    HomeLoan(){
       // super();  // Calling Parent class constructor
        System.out.println("Home Loan Cons Call....");
    }
    void insurance(){
        System.out.println("HOme Loan Insurance...");
    }
    void payBack(){
        System.out.println("No Charges Applied...");
    }
   
    @Override
    void roi() {
        // TODO Auto-generated method stub
        System.out.println("ROI 9.5 % on Home Loan...");
    }
}
class EduLoan extends Loan{

    @Override
    void emi() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'emi'");
    }

    @Override
    void roi() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'roi'");
    }

}
class CarLoan extends Loan{

    @Override
    void emi() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'emi'");
    }

    @Override
    void roi() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'roi'");
    }

}
class AbstractClassDemo{
    public static void main(String[] args) {
       // Loan l = new Loan();
        HomeLoan loan= new HomeLoan();
        loan.applyForLoan();
        loan.insurance();
        loan.payBack();
        loan.emi();
        loan.roi();
    }
}