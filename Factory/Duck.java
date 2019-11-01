
public class Duck implements Animal{
    
    private String title = "Duck";

    @Override
    public void makeSound() {
        System.out.println("Quack-quack");
    }

    @Override
    public String getTitle() {
        return title;
    }
    
    
}
