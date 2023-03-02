// Parent class
// Abstract - Generic Logic / Common Logic
// It share the logic b/w the childs
// We restrict the object creation of generic.
// abstract class has variables, methods, constrcutors and also abstract methods.
abstract class Account{
    double balance;
    int x; // Instance Var
    Account(){
        x=10;
        System.out.println("Account class default constructor");
    }
    Account(int x){ // x is Local Var
        this();
        // Instance Var = Local Var
        this.x = x;
        System.out.println("Account Class Param Constrcutor");
    }
    void deposit(){
        System.out.println("Account Class :: Deposit");
    }
    void withdraw(){
        System.out.println("Account Class :: WithDraw...");
    }
    abstract void roi(); // May or may not have abstract method
    abstract void services();
    // declare
    // void roi(){
    //     System.out.println("Account Class ::: ROI 3% ");
    // }
}
abstract class CommonAccountLogic extends Account{
    @Override
    void services(){
        System.out.println("Sa and Ca Services....");
    }
}
// extends - keyword - Parent - child relationship (Inheritance)
class SavingAccount extends CommonAccountLogic{
    // child constructor will call parent class constrcutor
    int y;
    int x ; // Instance Variable
    SavingAccount(){
       // super(1); // Explicit parent constructor call (Param Constrcutor)
        // super(); // parent class default constructor Invoke / Implicit super constrcutor call
        this.x = 44;
        y = 20 + super.x + this.x;
        System.out.println("Saving Account Default cons "+y);
    }
    SavingAccount(int x){
         // first line 
         //super(1);
         this(); // Own class constrcutor call
        this.x = x + super.x;
        System.out.println("Saving Account Param Cons Call ");
       
    }
    void limitOfTrans(){
        System.out.println("Saving Account Limit of Trans");
    }
    // When we do override the parent method will be hide.
    @Override
    void roi(){
        // super (keyword) - parent class reference
        // this (keyword) - current class reference
        //super.roi(); // Calling parent roi
        System.out.println("SavingAccount ROI 4%");
    }
}
class CurrentAccount extends CommonAccountLogic{
    void odLimit(){
        System.out.println("Current Account OD Limit...");
    }
    @Override
    void roi(){
        System.out.println("Current Account ROI 5%");
    }
}
class AccountCaller{
    // Upcast
    void call(Account account){
        // Upcasting
        // Common will be called.
        // Account account = new SavingAccount();   // Child Casted to Parent  
        // account = new CurrentAccount();
        //SavingAccount savingAccount = new SavingAccount(1);  
        account.deposit();
        account.withdraw();
       // account.limitOfTrans();
        account.roi();
        // Specific Call
        if(account instanceof SavingAccount){
            SavingAccount sa = (SavingAccount) account; // Downcasting
            sa.limitOfTrans();
        }
        else if(account instanceof CurrentAccount){
            ((CurrentAccount) account).odLimit(); // Downcasting
        }

        System.out.println("****************************");
    }
}
public class ISA {
    public static void main(String[] args) {
        //Account account = new Account(); // Meaning less object
        SavingAccount savingAccount = new SavingAccount(); // Specific
        savingAccount.deposit();
        savingAccount.withdraw();
        savingAccount.services();
        CurrentAccount currentAccount = new CurrentAccount();




        // AccountCaller obj = new AccountCaller();
        // obj.call(new SavingAccount());
        // obj.call(new CurrentAccount());
         /*  SavingAccount savingAccount = new SavingAccount(1);  
          savingAccount.deposit();
          savingAccount.withdraw();
          savingAccount.limitOfTrans();
          savingAccount.roi();
          System.out.println("************************");
          CurrentAccount currentAccount = new CurrentAccount();
          currentAccount.deposit();
          currentAccount.withdraw();
          currentAccount.odLimit();
          currentAccount.roi();
          */
    }
}
