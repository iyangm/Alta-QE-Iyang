public class soal2 {
    public static double calculateCubeVolume(double side) {
        return Math.pow(side, 3);
    }

    public static double calculateCuboidVolume(double length, double width, double height) {
        return length * width * height;
    }

    public static double calculateCylinderVolume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public static void main(String[] args) {
        double cubeSide = 10;
        double cuboidLength = 3;
        double cuboidWidth = 6;
        double cuboidHeight = 0;
        double cylinderRadius = 7;
        double cylinderHeight = 10;

        double cubeVolume = calculateCubeVolume(cubeSide);
        double cuboidVolume = calculateCuboidVolume(cuboidLength, cuboidWidth, cuboidHeight);
        double cylinderVolume = calculateCylinderVolume(cylinderRadius, cylinderHeight);

        System.out.println("Kubus");
        System.out.println("Volume: " + cubeVolume);

        System.out.println("Balok");
        System.out.println("Volume: " + cuboidVolume);

        System.out.println("Tabung");
        System.out.println("Volume: " + cylinderVolume);
    }
}

