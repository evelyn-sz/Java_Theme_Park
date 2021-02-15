package attractions;

import people.Visitor;

public class Dodgems extends Attraction {

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
