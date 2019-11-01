
public class Market {
    public static void main(String[] args) {
        Animal a1 = RandomAnimalsFarm.saleAnimal();
        Animal a2 = RandomAnimalsFarm.saleAnimal();
        Animal a3 = RandomAnimalsFarm.saleAnimal();
        
        a1.makeSound(); a2.makeSound(); a3.makeSound();
    }
}
