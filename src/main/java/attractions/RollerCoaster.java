package attractions;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster extends Attraction implements ITicketed {

    private double price;
    public RollerCoaster(String name, int rating) {
        super(name, rating);
        this.price = 8.50;
    }

    public double defaultPrice(){
        return this.price;
    }

    public double priceFor(Visitor visitor){
        return visitor.getHeight() > 200 ? 2 * this.price : this.price;
    }
}
