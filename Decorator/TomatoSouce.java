
public class TomatoSouce extends ToppingsDecorator {
    
    public TomatoSouce(Pizza newPizza) {
        super(newPizza);
    }
    
    @Override
    public String getDescription() {
        System.out.println("t");
        return tempPizza.getDescription() + ", TomatoSouce";
    }
    
    @Override
    public double getCost() {
        return tempPizza.getCost() + 0.35;
    }
    
}
