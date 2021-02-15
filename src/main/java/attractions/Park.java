package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class Park extends Attraction implements ITicketed {

    private double price;
    public Park(String name, int rating) {
        super(name, rating);
        this.price = 5;
    }

    public double defaultPrice() {
        return price;
    }

    public double priceFor(Visitor visitor) {
        return price;
    }
}
