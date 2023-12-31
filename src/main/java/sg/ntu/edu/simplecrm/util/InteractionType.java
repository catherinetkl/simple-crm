package sg.ntu.edu.simplecrm.util;

public enum InteractionType {

    EMAIL("Email"), PHONE("Phone"), MEETING("Meeting"), CHAT("Chat");

    private String type;

    InteractionType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
