class Parent{

}
class A extends Parent{

}
class B extends Parent{

}
public class Operators {
    public static void main(String[] args) {
        Parent obj = new A();
        Parent obj2 = new B();
        System.out.println(obj instanceof A);
        System.out.println(obj2 instanceof B);
        System.out.println(obj instanceof B);
        System.out.println(obj2 instanceof A);
        byte a = 100;
        byte b = 30;
        a+=b; // a = a + b;
        System.out.println(a);
        
        // byte c = (byte) (a + b);
        // System.out.println(c);
        // System.out.println();
    }
}
