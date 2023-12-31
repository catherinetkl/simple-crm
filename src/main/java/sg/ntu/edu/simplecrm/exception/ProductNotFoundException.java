package sg.ntu.edu.simplecrm.exception;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(String id) {
        super("Could not find product with id: " + id + ".");
    }
}
