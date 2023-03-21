/*
 * Interface Rules
 * 1. 100% Abstract + 100% public
 */
interface Q{
    int MAX = 100; // public static final int MAX = 100;
    void show(); // public abstract void show();
    void print(); 
}
interface K{
    int MAX = 200;
    void show();
}
interface J extends Q, K{
    void disp();
}
class V{

}
class H2 implements J{
    @Override
    public void disp(){

    }
    @Override
    public void show() {
       System.out.println(Q.MAX);
       System.out.println(K.MAX);
    }

    @Override
    public void print() {
       
        System.out.println("H2 print...");
    }
    
}
class H extends V implements Q, K{

    @Override
    public void show() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'show'");
    }

    @Override
    public void print() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'print'");
    }
    
}
public class InterfaceRules {
    public static void main(String[] args) {
        H2 obj = new H2();
        obj.show();
        obj.print();
    }
}
