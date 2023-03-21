interface IPlayer{
    void walk();
    void jump();
    void kick();
    void punch();
}
class Ken implements IPlayer{

    @Override
    public void walk() {
        System.out.println("Average Speed.");
    }

    @Override
    public void jump() {
       System.out.println("Nice Jump..");
    }

    @Override
    public void kick() {
       System.out.println("Less Power...");
    }

    @Override
    public void punch() {
        System.out.println("More PowerFul...");
    }
    
}
class Ryu implements IPlayer{

    @Override
    public void walk() {
        System.out.println("Walk Slow...");
    }

    @Override
    public void jump() {
        System.out.println("Good Jump");
    }

    @Override
    public void kick() {
        System.out.println("Take lot of Damage of Enemy ...");
    }

    @Override
    public void punch() {
        // TODO Auto-generated method stub
        System.out.println("Take Less Power...");
    }
    
}
public class InterfaceDemo2 {

    static void loadPlayer(IPlayer player){
        player.jump();
        player.kick();
        player.punch();
        player.walk();
        System.out.println("*************************");
    }
    public static void main(String[] args) {
        loadPlayer(new Ryu());
        loadPlayer(new Ken());
        // Ryu ryu = new Ryu();
        // ryu.jump();
        // ryu.kick();
        // ryu.punch();
        // ryu.walk();
        // Ken ken = new Ken();
        // ken.jump();
        // ken.kick();
        // ken.punch();
        // ken.walk();
    }
}
