package ro.info.uaic;

import java.io.Serializable;

public class Book extends CatalogEntry {

    private float rating;
    private float releaseYear;

    public Book() {
    }

    public Book(String id, String name, String location) {
        super(id, name, location);
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) throws InvalidDataException {
        if(rating < 0 && rating > 10)
            throw new InvalidDataException(rating);
        else this.rating = rating;
    }

    public float getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(float releaseYear) {
        this.releaseYear = releaseYear;
    }

}
