public class StringExample {
    public static void main(String[] args) {
        String name= "Amit"; // String Literal Way (Object 1 or 0)
        String name2 = "Amit"; // String Literal Way
        System.out.println("Ref Same "+(name == name2));
        String c = new String("Amit"); // 2 or 1 
        System.out.println("Again Ref Check "+(name == c));
        System.out.println("Value Compare "+(name.equals(c)));
        String d = new String("Amit").intern();
        System.out.println("After Intern "+(name==d));

    }
}
