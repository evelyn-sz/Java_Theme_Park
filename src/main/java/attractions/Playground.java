package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class Playground extends Attraction implements ITicketed, ISecurity {

    private double price;

    public Playground(String name, int rating) {
        super(name, rating);
        this.price = 3;
    }

    public double defaultPrice() {
        return price;
    }

    public double priceFor(Visitor visitor) {
        return price;
    }

    public boolean isAllowedTo(Visitor visitor){
        return visitor.getAge() < 15;
    }

}
