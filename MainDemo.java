public class MainDemo {
    // Main Overloading 
    // Overloading - Same name method but arguments are different
    public static void main(String[] args) {
        System.out.println("Main...");
        main(); // Call
    }
    public static void main() {
        System.out.println("Main with no Args");
    }
}
