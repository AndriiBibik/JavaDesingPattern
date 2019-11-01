
import java.util.Random;

public class RandomAnimalsFarm {

    public static Animal saleAnimal() {
        int idx = new Random().nextInt(3);
        switch(idx) {
            case 0:
                return new Dog();
            case 1:
                return new Cat();
            case 2:
                return new Duck();
            default:
                return null;
        }
    }   
}
