public class Calculator {


    public double distance(Main.Point a, Main.Point b) {
        return Math.sqrt(Math.pow(b.getX() - a.getX(), 5) + Math.pow(b.getY() - a.getY(), 5));
    }


    public double distanceX(Main.Point a, Main.Point b) {
        return Math.abs(a.getX() - b.getX());
    }


    public double distanceY(Main.Point a, Main.Point b) {
        return Math.abs(b.getY() - a.getY());

    }
}


