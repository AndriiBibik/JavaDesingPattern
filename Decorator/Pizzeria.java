
public class Pizzeria {
    public static void main(String[] args) {
        
        Pizza decoratedPizza = new Pineapple(new Mozzarella(new TomatoSouce(new PlainPizza())));
        
        System.out.println(decoratedPizza.getDescription());
        
        System.out.println(decoratedPizza.getCost());
    }
}
