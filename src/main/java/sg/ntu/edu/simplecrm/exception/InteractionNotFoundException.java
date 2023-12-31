package sg.ntu.edu.simplecrm.exception;

public class InteractionNotFoundException extends RuntimeException  {
    InteractionNotFoundException(String id) {
        super("Unable to find interactiong with id: "+ id + ",");
    }
}
