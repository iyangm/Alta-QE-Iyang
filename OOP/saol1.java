public class saol1 {
    public static double calculateSquareArea(double side) {
        return side * side;
    }

    public static double calculateSquarePerimeter(double side) {
        return 4 * side;
    }

    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    public static double calculateRectanglePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static double calculateTrianglePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    public static void main(String[] args) {
        // Contoh penggunaan fungsi-fungsi perhitungan luas dan keliling
        double squareSide = 5;
        double squareArea = calculateSquareArea(squareSide);
        double squarePerimeter = calculateSquarePerimeter(squareSide);
        System.out.println("Persegi");
        System.out.println("Luas: " + squareArea);
        System.out.println("Keliling: " + squarePerimeter);

        double rectangleLength = 4;
        double rectangleWidth = 6;
        double rectangleArea = calculateRectangleArea(rectangleLength, rectangleWidth);
        double rectanglePerimeter = calculateRectanglePerimeter(rectangleLength, rectangleWidth);
        System.out.println("Persegi Panjang");
        System.out.println("Luas: " + rectangleArea);
        System.out.println("Keliling: " + rectanglePerimeter);

        double triangleBase = 8;
        double triangleHeight = 5;
        double triangleArea = calculateTriangleArea(triangleBase, triangleHeight);
        double trianglePerimeter = calculateTrianglePerimeter(5, 6, 7); // Contoh segitiga dengan sisi 5, 6, dan 7
        System.out.println("Segitiga");
        System.out.println("Luas: " + triangleArea);
        System.out.println("Keliling: " + trianglePerimeter);
    }
}

