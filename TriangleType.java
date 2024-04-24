import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhập vào độ dài các cạnh của tam giác:");
        System.out.print("Cạnh a: ");
        double a = scanner.nextDouble();
        System.out.print("Cạnh b: ");
        double b = scanner.nextDouble();
        System.out.print("Cạnh c: ");
        double c = scanner.nextDouble();
        
        if (isTriangle(a, b, c)) {
            if (isEquilateral(a, b, c)) {
                System.out.println("Tam giác đều.");
            } else if (isIsosceles(a, b, c)) {
                System.out.println("Tam giác cân.");
            } else if (isRightTriangle(a, b, c)) {
                System.out.println("Tam giác vuông.");
            } else {
                System.out.println("Tam giác thường.");
            }
        } else {
            System.out.println("Ba cạnh không tạo thành tam giác.");
        }
        
        scanner.close();
    }
    
    public static boolean isTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }
    
    public static boolean isEquilateral(double a, double b, double c) {
        return a == b && b == c;
    }
    
    public static boolean isIsosceles(double a, double b, double c) {
        return a == b || b == c || a == c;
    }
    
    public static boolean isRightTriangle(double a, double b, double c) {
        double[] sides = {a, b, c};
        java.util.Arrays.sort(sides);
        return Math.pow(sides[0], 2) + Math.pow(sides[1], 2) == Math.pow(sides[2], 2);
    }
}
