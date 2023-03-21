/*
 * IQ = Interface Changes in Java 8
 */
interface MyInterface{
     int MAX = 100;
    void show(); // public abstract void show();
    default void print(){
        System.out.println("MyInterface Print....");
    }
    static void disp(){
        System.out.println("disp....");
    }
}
interface I1 {
    default void print(){
        System.out.println("I1 Print....");
    } 
}
interface I2 extends I1, MyInterface{
    @Override
    default void print(){
        MyInterface.super.print();
        I1.super.print();
        System.out.println("I2 Print.......");
    }
}
class MyClass implements MyInterface{
    public void show(){
        System.out.println("MyClass Show....");
    }
}
class I3 implements I2{

    @Override
    public void show() {
        // TODO Auto-generated method stub
       System.out.println("I3 Show...");
    }
    
}
public class InterfaceInJava8 {
    public static void main(String[] args) {
        I3 obj = new I3();
        obj.print();
        obj.show();

       // MyInterface.disp();
        // MyClass obj = new MyClass();
        // obj.show();
        // obj.print();
    }
}
