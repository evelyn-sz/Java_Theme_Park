package themePark;

public class ThemePark {
    private String name;
    private int rating;

    public ThemePark(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getRating(){
        return rating;
    }
}
