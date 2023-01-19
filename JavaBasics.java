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
        String name = "Amit";
        String name2 = name;
        System.out.println(name);
        System.out.println(name2);
        System.out.println(name == name2);
        //name is a reference variable of String type (Class)

    }
}
