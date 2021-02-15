package attractions;

import behaviours.IReviewed;
import themePark.ThemePark;

public abstract class Attraction extends ThemePark implements IReviewed {
    private int rating;
    private int visitCount;

    public Attraction(String name, int rating) {
        super(name, rating);
        this.visitCount = 0;
    }

//    public int getRating() {
//        return rating;
//    }

    public int getVisitCount() {
        return visitCount;
    }
}
