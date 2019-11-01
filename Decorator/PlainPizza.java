
public class PlainPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Dough";
    }

    @Override
    public double getCost() {
        return 4;
    }
    
}
