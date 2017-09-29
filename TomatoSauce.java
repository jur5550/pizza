// a Concrete Decorator
public class TomatoSauce extends ToppingDecorator {

    public TomatoSauce(Pizza newPizza) {

        super(newPizza);
        System.out.println("Adding sauce");
    }
    
    public String getDescription(){
        
        return tempPizza.getDescription() + ", tomato sauce";
    }
    
    public double getCost(){
        size = getSize();
        double price;
        if(size == "S")
        {
            price = .35;
        } else if (size == "M")
        {
            price = .40;
        } else {
            price = .45;
        }

        System.out.println("Cost of sauce: "+ price);
        return tempPizza.getCost() + price;
    }

    @Override
    public String getSize() {
        return null;
    }

    @Override
    public void setSize(String size) {

    }
}