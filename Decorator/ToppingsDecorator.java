
public class ToppingsDecorator implements Pizza {
    
    protected Pizza tempPizza;
    
    public ToppingsDecorator(Pizza newPizza) {
        tempPizza = newPizza;
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription();
    }

    @Override
    public double getCost() {
        return tempPizza.getCost();
    }
    
}
