package ro.info.uaic;

public class InvalidDataException extends Exception{

    public InvalidDataException(float rating) {
        super("Invalid data input: " + rating);
    }
}
