
public class Dog implements Animal {
    
    private String title = "Dog";

    @Override
    public void makeSound() {
        System.out.println("Woof-woof!!!");
    }

    @Override
    public String getTitle() {
        return title;
    }
    
}
