// a Concrete Decorator
public class Mozzarella extends ToppingDecorator {
    public String size;
    public Mozzarella(Pizza newPizza) {
        
        super(newPizza);
        System.out.println("Adding Mozzarella");
    }
    
    public String getDescription(){
        
        return tempPizza.getDescription() + ", mozzarella";
    }
    
    public double getCost(){
        size = getSize();
        double price;
        if(size == "S")
        {
            price = .50;
        } else if (size == "M")
        {
            price = .60;
        } else {
            price = .70;
        }

        System.out.println("Cost of mozzarella: " + price);
        return tempPizza.getCost() + price;
    }

    @Override
    public String getSize() {
        return size;
    }

    @Override
    public void setSize(String newSize) {
        size = newSize;
    }
}
