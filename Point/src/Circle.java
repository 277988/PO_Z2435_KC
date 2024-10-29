public class Circle {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) throws BadShapeException {
        try {
            if (center == null) {
                throw new BadShapeException("Punkt środka nie może być null");
            }
            if (radius <= 0) {
                throw new BadShapeTwoException("Promień musi być większy od zera");
            } else if (radius < 1) {
                throw new BadShapeTwoException("Średnica koła nie może być mniejsza niż 1");
            }

            this.center = center;
            this.radius = radius;
        } catch (BadShapeTwoException e) {
            System.out.println("Złapano BadShapeTwoException: " + e.getMessage());
        } catch (BadShapeException e) {
            System.out.println("Złapano BadShapeException: " + e.getMessage());
        } finally {
            System.out.println("Blok finalny: Próba konstrukcji koła zakończona.");
        }
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }
}
