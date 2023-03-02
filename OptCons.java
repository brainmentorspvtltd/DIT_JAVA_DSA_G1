class V{
    int a[];
    V(int ...a){
        this.a = a;
        System.out.println("V Optional Args Cons");
        for(int w : this.a){
            System.out.println(w);
        }
    }
}
public class OptCons {
    public static void main(String[] args) {
        V obj = new V();
        V obj2 = new V(10);
        V obj3 = new V(10,20);
        V obj4 = new V(10,20,30);
        V obj5 = new V(10,20,30,40);

    }
}
