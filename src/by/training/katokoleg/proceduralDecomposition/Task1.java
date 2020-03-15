import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) throws IOException {
        List<Point> points = getPoints();
        Double result = calculateTriangleArea(points);
        System.out.println(result);
    }

    public static List<Point> getPoints() throws IOException {
        List<Point> points = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Creating point number: " + (i + 1));
            points.add(createPoint());
        }
        return points;
    }

    public static Point createPoint() throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Enter X coordinate: ");
            double x = Double.parseDouble(reader.readLine());
            System.out.println("Enter Y coordinate: ");
            double y = Double.parseDouble(reader.readLine());
            return new Point(x, y);
        }
    }

    public static double calculateTriangleArea(List<Point> points) {
        Point A = points.get(0);
        Point B = points.get(1);
        Point C = points.get(2);
        return 0.5 * Math.abs((B.x - A.x) * (C.y - A.y) - (C.x - A.x) * (B.y - A.y));
    }


    static class Point {
        private double x;
        private double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }
}

