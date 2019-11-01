
public class Pineapple extends ToppingsDecorator {
    
    public Pineapple(Pizza newPizza) {
        super(newPizza);
    }
    
    @Override
    public String getDescription() {
        System.out.println("p");
        return tempPizza.getDescription() + ", Pineapple";
    }
    
    @Override
    public double getCost() {
        return tempPizza.getCost() + 0.45;
    }
    
}
