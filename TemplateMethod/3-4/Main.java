public class Main {
    public static void main(String[] args) {
        // AbstractDisplay d = new StringDisplay("HELLO WORLD");
        InterfaceDisplay d = new StringDisplay("HELLO WORLD");

        d.display();
    }
    
}
