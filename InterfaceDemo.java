/*
 * IQ - What is Interface? Why we need it ?
 * interface - keyword 
 * interface - Standards
 * What to do - Interface
 * How to do - classes
 * interface = abstract methods + constants
 */
// abstract interface DBOperations{
    // What to do
interface DBOperations{
    // public static final int MAX_CONNECTIONS = 10;
    int MAX_CONNECTIONS = 10;
    // 100% Abstract and 100% public 
    //public abstract void add();
    void add();
    void remove();
    void update();
    void read();
}
// How to do
class OracleDB implements DBOperations{

    @Override
    public void add() {
       // MAX_CONNECTIONS++;
        // TODO Auto-generated method stub
        System.out.println("Oracle DB Add");
    }

    @Override
    public void remove() {
        System.out.println("Oracle DB Remove");
    }

    @Override
    public void update() {
        System.out.println("Oracle DB Update");
    }

    @Override
    public void read() {
        System.out.println("Oracle DB read");
    }
    
}
class PosGresDB implements DBOperations{

    @Override
    public void add() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public void remove() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public void update() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void read() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'read'");
    }
    
}
public class InterfaceDemo {
    
}
