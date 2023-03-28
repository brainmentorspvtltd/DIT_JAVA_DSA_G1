import java.util.ResourceBundle;

interface IProducer{
    void show(); // public abstract void show();
}
class Producer implements IProducer{
    @Override
    public void show(){
        System.out.println("Consume It");
    }
    public void dontUseIt(){
        System.out.println("Dont Use It");
    }
}
class FastProducer implements IProducer{

    @Override
    public void show() {
        System.out.println("Fast Producer Show...");
    }

    public void dontUseIt(){
        System.out.println("Dont Use It :: Fast Producer");
    }


    
}

class Factory{
    private Factory(){}
    private static ResourceBundle r = ResourceBundle.getBundle("config");
    static IProducer createInstance(){
        //FastProducer f = new FastProducer();
        // Producer f = new Producer();
        String className = r.getString("classname");
        Object object =null; 
        try{
         object = Class.forName(className).getDeclaredConstructor().newInstance();
        }
        catch(Exception ex){
            System.out.println(ex);
            return null;
        }
        return (IProducer) object; // Downcasting
    }
}
class ConsumerA{
    void consume(){
        IProducer p = Factory.createInstance();
        // IProducer p  = new Producer(); // Upcasting
        p.show();
        //p.dontUseIt();
    }
}
class ConsumerB{
    void consume(){
        IProducer p = Factory.createInstance();
        // IProducer p  = new Producer(); // Upcasting
        p.show();
        //p.dontUseIt();
    }
}
class ConsumerC{
    void consume(){
        IProducer p = Factory.createInstance();
        // IProducer p  = new Producer(); // Tightly Coupled
        p.show();
        //p.dontUseIt();
    }
}
public class LoosleyCoupledApp {
    public static void main(String[] args) {
        ConsumerA a = new ConsumerA();
        a.consume();
        
        ConsumerB b = new ConsumerB();
        b.consume();
        ConsumerC c = new ConsumerC();
        c.consume();
    }
}
