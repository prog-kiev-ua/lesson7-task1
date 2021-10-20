package ua.kovalev;

public class ShipIsEmptyException extends Exception {
    public ShipIsEmptyException() {
        super();
    }

    public ShipIsEmptyException(String message) {
        super(message);
    }
}
