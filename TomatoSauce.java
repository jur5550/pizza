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
        if(size == "S")
        {
            System.out.println("Cost of plain pizza: " + 3.50);
            return 3.50;
        } else if (size == "M")
        {
            System.out.println("Cost of plain pizza: " + 4.00);
            return 4.00;
        } else {
            System.out.println("Cost of plain pizza: " + 4.50);
            return 4.50;
        }


//        System.out.println("Cost of sauce: " + .35);
//        return tempPizza.getCost() + .35;
    }

    @Override
    public String getSize() {
        return null;
    }

    @Override
    public void setSize(String size) {

    }
}