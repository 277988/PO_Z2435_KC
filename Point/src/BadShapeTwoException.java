public class BadShapeTwoException extends BadShapeException {
    public BadShapeTwoException(String message) {
        super(message);
        System.out.println("Błąd: " + message);
    }
}