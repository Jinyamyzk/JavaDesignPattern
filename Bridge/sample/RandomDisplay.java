import java.util.Random;

public class RandomDisplay extends CountDisplay {
    private Random random = new Random();
    public RandomDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void randomDisplay(int max) {        
        multiDisplay(random.nextInt(max));
    }
}
