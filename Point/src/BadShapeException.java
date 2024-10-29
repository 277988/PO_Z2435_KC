public class BadShapeException extends Exception {
    public BadShapeException(String message) {
        super(message);
        System.out.println("Błąd: " + message);
    }

    public void printErrorMessage() {
        System.out.println("Komunikat błędu: " + getMessage());
    }
}

