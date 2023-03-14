/*
 * Method overloading - Logic Same but arguments change...
 * Number of Arguments
 * Type of Arguments
 * Order of Arguments
 * TypePromotion - 
 */
class TypePromotion{
    // void show(char x){
    //     System.out.println("char...");
    // }
    // void show(int x){
    //     System.out.println("int ....");
    // }   
    void show(byte x){
        System.out.println("byte ...");
    }
    void show(short x){
        System.out.println("short...");
    }
    // void show(long ...x){
    //     System.out.println("long Var args....");
    // }
    // void show(float ...x){
    //     System.out.println("float Var args....");
    // }
    // void show(Integer x){
    //     System.out.println("Integer Wrapper....");
    // }
    void show(Long x){
        System.out.println("Long Wrapper....");
    }
    // void show(float x){
    //     System.out.println("float....");
    // }
    // void show(double x){
    //     System.out.println("double....");
    // }
    // void show(long w){
    //     System.out.println("long...");
    // }
}
class Shopping{
    void search(double amount){

    }
    void search(String name){

    }
    
    void search(String name, double amount){

    }
    void search( double amount, String name){

    }
}
public class MethodOverloadingAndTypePromotion {
    public static void main(String[] args) {
        TypePromotion t = new TypePromotion();
        //t.show(1.2f);
        //t.show((short)1);
       // t.show(10);
       // t.show('A'+2);
        // Shopping obj = new Shopping();
        // obj.search("Apple");
        // obj.search(100000);
        // obj.search("Apple",100000);
        //obj.search(true);
    }
}
