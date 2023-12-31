package sg.ntu.edu.simplecrm.exception;

public class CustomerNotFoundException extends RuntimeException {
    CustomerNotFoundException(String id) {
        super("Could not find customer with id: " + id + ".");
    }
}
