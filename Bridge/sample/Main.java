public class Main {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello Japan."));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello World."));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello Universe."));
        RandomDisplay d4 = new RandomDisplay(new StringDisplayImpl("This is America."));
        Display d5 = new Display(new FileDisplayImpl("/Users/jinya/Documents/JavaDesignPattern/Bridge/sample/sample.text"));
        d1.display();
        d2.display();
        d3.multiDisplay(5);
        d4.randomDisplay(10);
        d5.display();
    }
    
}
