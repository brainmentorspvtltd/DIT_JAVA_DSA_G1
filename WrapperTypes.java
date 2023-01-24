import java.math.BigInteger;
import java.util.Date;
import java.util.LinkedList;

public class WrapperTypes {
    public static void main(String[] args) {
        int a = 10;
        Integer b= 200;
        String str = b.toString();
        System.out.println("String "+str);
        System.out.println(Integer.toBinaryString(a));
        Float e = 90.20f;
        Double t = 999.22;
        Boolean att = true;
        Character singleChar = 'A';
        System.out.println(Character.isLowerCase('A'));
        LinkedList<String> list = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        BigInteger x= new BigInteger("435453453454354353453452423423432");
        BigInteger y = new BigInteger("45435353453423354554353454453");
        BigInteger z =x.add(y);
        System.out.println(z);
        Date d = new Date();
        
        System.out.println("Date is "+d);


    }
}
