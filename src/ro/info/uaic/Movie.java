package ro.info.uaic;

import java.io.Serializable;

public class Movie extends CatalogEntry  {

    private float rating;
    private int releaseYear;

    public Movie(){

    }

    public Movie(String id, String name, String location) {
        super(id, name, location);
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) throws InvalidDataException {
        if(rating < 0 || rating > 10)
            throw new InvalidDataException(rating);
        else this.rating = rating;

    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}
