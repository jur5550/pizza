// the Decorator
abstract class ToppingDecorator implements Pizza {
    protected Pizza tempPizza;
    String size;
    
    public ToppingDecorator(Pizza newPizza){
        this.size = size;
        tempPizza = newPizza;
    }
    
    public String getDescription() {
        
        return tempPizza.getDescription();
    }

    public double getCost() {
        
        return tempPizza.getCost();
    }
}
