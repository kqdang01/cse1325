import java.util.Scanner;
import java.util.Random;
public class TestPolygon {
    private static Scanner in = new Scanner(System.in);
    private static Random rand = new Random();

    public static void main(String[] args) {
        try {
            System.out.println("Test Vector #1\n");
            Polygon polygon1 = new Polygon();
            polygon1.addPoint(new Point());
            polygon1.addPoint(new Point(3, 0));
            polygon1.addPoint(new Point(3, 4));
            if (polygon1.perimeter() != 12) {
                System.err.println("Incorrect polygon perimeter. Expected 12, got " + polygon1.perimeter());
                System.exit(1);
            } 
            System.out.println("Test Vector #2\n");
            try {
                Polygon polygon2 = new Polygon();
                polygon2.addPoint(new Point());
                polygon2.addPoint(new Point(3, 0));
                polygon2.addPoint(new Point());
            } catch (Exception e) {
                if (e instanceof IllegalArgumentException) {
                }
                else {
                    System.err.println("Expected type IllegalArgumentException, got " + e);
                    System.exit(1);
                }
            }
            System.out.println("Test Vector #3\n");
            try {
                Polygon polygon3 = new Polygon();
                polygon3.addPoint(new Point());
                polygon3.addPoint(new Point(3, 0));
                polygon3.perimeter();
            } catch (Exception e) {
                if (e instanceof RuntimeException) {
                }
                else {
                    System.err.println("Expected RuntimeException, got " + e);
                    System.exit(1);
                }
            }
            System.out.println("Test Vector #4\n");
            try {
                Polygon polygon4 = new Polygon();
                for (int i = 0; i < 13; ++i) {
                    int p1 = rand.nextInt();
                    int p2 = rand.nextInt();
                    polygon4.addPoint(new Point(p1, p2));
                }
            } catch (Exception e) {
                if (e instanceof RuntimeException) {
                }
                else {
                    System.err.println("Expected RuntimeException, got " + e);
                    System.exit(1);
                }
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}