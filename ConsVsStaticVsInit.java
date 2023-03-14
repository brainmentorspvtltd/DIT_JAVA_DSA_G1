/*
 * static block vs init block
 * static block vs init block vs constructor
 */
class ParentInit{
    static int x;
    static{
        x = 10;
        System.out.println("Parent Static Block...");
    }
    static{
        System.out.println("Parent Static Block2....");
    }
    {
        System.out.println("I am the Parent Init Block...");
    }
    ParentInit(){
        System.out.println("I am the Parent Default Constructor");
    }
}
class ChildInit extends ParentInit{
    static int y ;
    static{
        y = x + 20;
        System.out.println("Child Static Block..."+y);
    }
    static{
        System.out.println("Child Static Block2...");
    }
    {
        System.out.println("I am Child  Init Block...");
    }
    ChildInit(){
        // super(); // Call parent class default constructor (Implicit constructor )
        System.out.println("I am the Child Default Constructor");
    }
}
class Q{
    static int a; // Eager Binding, Eager Loading...
    int b; // Instance Variable , During Object creation (Lazy Loading..)
    Q(){
        System.out.println(" I am the Constructor , During Object Creation...");
        b = 10;
    }
    {
      System.out.println("Pre Constructor call.... ");
      b = 1000;  
    }
    {
        System.out.println("Pre Constructor call2.... ");
        b = 1000;  
      }
    static {
        a = 100;
        System.out.println("Static Block will execute during class loading time..."+a);
    }
    static{
        a = 200;
        System.out.println("I am the Another Static Block "+a);
    }
    static void show(){
        System.out.println("A Is "+a);
    }
}
public class ConsVsStaticVsInit {
    public static void main(String[] args) {
        //Q.show(); // Class Load First , Static Block + Static Method.
    //     Q obj = new Q();
    //    // Q obj2 = new Q();
    //     System.out.println(obj.b);
        ChildInit c = new ChildInit();
        //ChildInit c1 = new ChildInit();

    }
}
