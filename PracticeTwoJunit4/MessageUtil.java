package PracticeTwoJunit4;

public class MessageUtil {
    private String message;

    public MessageUtil(String message) {
        this.message = message;
    }

    public String printMessage() {
        return message;
    }

    public String salutationMessage() {
        return "Hi!" + message;
    }
}
