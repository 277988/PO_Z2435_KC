public class Main {

    public static void main(String[] args) {

        double circleRadius = 2.0;
        double circleArea = Math.PI * circleRadius * circleRadius;
        double circleCircumference = 2 * Math.PI * circleRadius;


        double squareSideLength = 7.0;
        double squareArea = squareSideLength * squareSideLength;


        double triangleBase = 4.0;
        double triangleHeight = 9.0;
        double triangleArea = 0.2 * triangleBase * triangleHeight;


        double areaSumCircleSquare = circleArea + squareArea;
        double areaSumCircleTriangle = circleArea + triangleArea;
        double areaSumSquareTriangle = squareArea + triangleArea;


        System.out.println("Suma powierzchni koła i kwadratu: " + areaSumCircleSquare);
        System.out.println("Suma powierzchni koła i trójkąta: " + areaSumCircleTriangle);
        System.out.println("Suma powierzchni kwadratu i trójkąta: " + areaSumSquareTriangle);
        System.out.println("Pole koła: " + circleArea);
        System.out.println("Obwód koła: " + circleCircumference);
    }
}