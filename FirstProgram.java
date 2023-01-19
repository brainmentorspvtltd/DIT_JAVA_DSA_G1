// Java OOPS
// Every Program in Java Start with class
// class is a keyword (reserved word) . It is use to define a class
// class name should be match with file name
// mandate : when class is public it is mandate the filename and class name must be same
// public : Access - the class will be avaliable outside the package (Folder)
// to Save : Ctrl + S
// javac command - to compile source code
// javac <FileName.java>
// When u compile the source code , u get a Byte Code and Byte Code file name same as class name
// To Execute the code we need to write java command . java command trigger JRE.
// java <ByteCodeFileName>
class SecondClass{
    /*
     * main is a entry point of a Java Program
     * main is a method ()
     * main having some signature
     * void is a keyword - it return nothing
     * static is a keyword - When U run your program , java <ByteCodeFileName>
     * It Trigger JRE --> JVM --> Class Loading
     * During Class Load --> static things will be loaded.
     * public is a keyword - Access Scope --> so it can access outside the package (folder)
        String args[] - It is a command line argument
        String is a predefine class in Java
        String is a collection of chars
        args[] - args is an argument and it name can be anything
        [] - Box Syntax - It is an Array (Arguments can Be N)
        ... this is var args (Java 1.5)
     */
    static public  void main(String ...arguments){
        /*
         * print is a method, and print in a same line
         * print method is access by using out object
         * out is an object of PrintStream class, who create the object
         * System class create the object of PrintStream so we can use directly
         * so out object is static define in System.
         * System is a predefine class , and it has out , in,  err object
         * all are define static , so they avaliable (Eagerly) 
         * static things use ClassName.staticThing
         */
        //System.out.print("Hello Java");
        //System.out.println("Hello Java");
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
        System.out.println("* * * * * * * *");
        // System.out.print("* ");
        // System.out.print("* ");
        // System.out.print("* ");
        // System.out.print("* ");
        // System.out.print("* " );
        // System.out.print("* ");
        // System.out.print("* ");
        // System.out.print("* ");
        //System.out.println();
        // println - print in a new line.
    }
}
