
public class Mozzarella extends ToppingsDecorator {
    
    public Mozzarella(Pizza newPizza) {
        super(newPizza);
    }
    
    @Override
    public String getDescription() {
        System.out.println("m");
        return tempPizza.getDescription() + ", Mozzarella";
    }
    
    @Override
    public double getCost() {
        return tempPizza.getCost() + 0.5;
    }
    
}
