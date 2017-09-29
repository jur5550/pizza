// a Concrete Component
public class PlainPizza implements Pizza {
    String size;
    public String getDescription() {
        
        return "Just a plain pizza";
    }

    public double getCost() {
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
