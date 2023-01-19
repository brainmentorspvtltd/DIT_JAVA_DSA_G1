public strictfp class JavaBasics {
    public static  void main(String[] args) {
        /*
         * variable - Used to store the values
         */
        int id ; // id is a variable name, what the type of id
        // int is a type (Data Type)
        // int store non decimal value , int has there own range.
        id = 1001; 
        byte age = 22; // -128 to 127
        byte rollNo = (byte)130; // TypeCasting (Explicit)
        System.out.println(rollNo);
        //float roi = 9.7F;
        //float roi = 9.7f;
        //float roi = (float) 9.7;
        double amount = 10000.2345;
        boolean att = true; // 1 Byte , 2 Byte , 4 Byte
        char termsAndConditions = 'Y'; // single char 2 Byte (Unicode)
        char value = 'न';
        System.out.println(value);
        String name = "Amit"; // String Literal Object (1st Way )
        String name2 = name;
        String name3 = new String("Amit");
        // new is a keyword , used to allocate a new memory
        System.out.println(name);
        System.out.println(name2);
        System.out.println(name == name2); // True
        System.out.println(name == name3); // False (Reference Compare)
        System.out.println(name.equals(name3)); // True (Value Compare)
        String name4 = "AMIT";
        System.out.println(name.equals(name4)); // False (Case Sensitive)
        System.out.println(name.equalsIgnoreCase(name4));
        System.out.println("Amit".compareTo("Amit")); // 0 (Equals)
        System.out.println("Amit".compareTo("Ram")); // -Negative (First Name is Small)
        System.out.println("Ram".compareTo("Amit"));// First Name is Greater , it give Postive
        //name is a reference variable of String type (Class)
        var empid = 1002; // Type Inference (Implicit )
        //empid = true;
    }
}
