
class Cat implements Animal {
    
    private String title = "Cat";

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public String getTitle() {
        return title;
    }
    
}
