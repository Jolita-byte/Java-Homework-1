package SDA_exercises.Ex24;

public class BasketEmptyException extends RuntimeException{
    public BasketEmptyException() {
        super("Basket is empty");
    }
}
