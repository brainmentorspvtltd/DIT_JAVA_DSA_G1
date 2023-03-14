/*
 * PassByValue and PassByReference in Java?
 */
class Calc{
    int p,q;
    Calc(){
        p = 10;
        q = 20;
    }
}
class PassByValue{
    void show(int x, int y){
        x = x + 100;
        y = y + 20;
        System.out.println("X is "+x +" Y is "+y);
    }
    void disp(Calc ref){
        ref.p++;
        ref.q--;
        System.out.println("P "+ref.p+" Q "+ref.q);
    }
}
public class PassByValueVsPassByRef {
    public static void main(String[] args) {
        PassByValue obj = new PassByValue();
        Calc c = new Calc();
        obj.disp(c);
        System.out.println(c.p +" "+c.q);
        // int a = 10;
        // int b = 20;
        // obj.show(a, b);
        // System.out.println("A is "+a+" and B is "+b);
    }
}
