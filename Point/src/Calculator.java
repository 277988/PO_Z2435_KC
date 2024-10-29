public class Calculator {


    public double distance(Point a, Point b) {
        return Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
    }


    public double distanceX(Point a, Point b) {
        return Math.abs(b.getX() - a.getX());
    }


    public double distanceY(Point a, Point b) {
        return Math.abs(b.getY() - a.getY());
    }

    public double calculateAreaSum(Shape shape1, Shape shape2) {
        return shape1.area() + shape2.area();
    }
}
