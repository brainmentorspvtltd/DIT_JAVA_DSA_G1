/*
 * Can we overide the static method in java?
 */
/*
 * static - keyword 
 * static things comes when class will be loaded.
 * static things loaded once.
 */
class StaticExample{
    int count; // Instance Variable, Object Bind (Runtime , Dynamic Binding)
    static int counter ; // Class Variable , Class Bind , Static  Binding
    StaticExample(){
        count++; // 1 1 1
        counter++; // 1 ,2 , 3
        System.out.println("Instance Var Count is "+count+ " Static Var Counter is "+counter);
    }
    static void show(){
        System.out.println("I am the Show...");
    }

}
class ParentClass{
    void disp(){
        System.out.println("I am the Parent class display....");
    }
    static void print(){
        System.out.println(" i am the static method of parent class...");
    }
}
class ChildClass extends ParentClass{
    // Overriding - When there is inheritance...
    // Method signature should be match with parent...
    @Override
    void disp(){
        System.out.println("I am the Child class display....");
    }
    //@Override
    static void print(){
        System.out.println(" i am the static method of child class...");
    }
}
public class OverrideStatic {
    public static void main(String[] args) {
        //StaticExample.show();
        //ParentClass obj1 = new ChildClass(); // Upcasting
        ChildClass obj1= new ChildClass();
         //StaticExample obj1 = new StaticExample();
         //obj1.disp();
         obj1.print();
        // StaticExample obj2 = new StaticExample();
        // StaticExample obj3 = new StaticExample();

    }
}
