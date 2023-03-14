import javax.print.DocFlavor.BYTE_ARRAY;

/*
 * Static vs Instance Members
 * Class Members vs Instance Members
 */
class Demo{
    int a; // Instance Member (During Object Creation) (lazy loading)
    static int b; // Class Member (During Class Load) (Eager Loading)
    Demo(){
        a++;
        b++;
        System.out.println("A is "+a+" and B is "+b);
    }
    static{
       // b = 100;
    }
    static void show(){
       // a = 10000;
        System.out.println("Show "+b);
    }
    // Instance Method
    void print(){
        System.out.println("Print call.... "+b);
    }
}
public class StaticVsInstance {
    public static void main(String[] args) {
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();
        Demo obj3 = new Demo();

        //obj.print();
        //Demo.show(); // ClassName.Members
        // static block call --> show 
        // Demo obj = new Demo();
        // obj.show();
    }
}
