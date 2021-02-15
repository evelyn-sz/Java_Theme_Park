package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    private double price;

    public Dodgems(String name, int rating) {
        super(name, rating);
        this.price = 4.50;
    }

    public double defaultPrice() {
        return price;
    }

    public double priceFor(Visitor visitor){
        return visitor.getAge() < 12 ? this.price /2 : this.price;
    }

}
