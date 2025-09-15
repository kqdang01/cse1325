public class Polygon {
    public static final int MAX_SIDES = 12;
    private int numSides;
    private Point[] points = new Point[MAX_SIDES];

    public void addPoint(Point point) {
        for (Point p : this.points) {
            if (p.equals(point)) throw new IllegalArgumentException("Duplicate Point: " + point);
        }
        if (this.points.length == this.MAX_SIDES) throw new RuntimeException("Polygon is full");
        this.points[numSides] = point;
        this.numSides++;
    }

    public double perimeter() {
        if (this.numSides < 3) throw new RuntimeException("Polygons required 3+ sides!");
        int j = 0;
        double sum = 0;
        for (int i = 1; i < this.numSides-1; i++) {
            sum += this.lineLength(points[j], points[i]);
        }
        sum += this.lineLength(points[0], points[numSides-1]);
        return sum;
    }
    @Override
    public String toString() {
        String pointString;
        for (Point point : this.points) pointString += point + ",";
        return "Polygon[" + pointString + "]";
    }
    private static double lineLength(Point p1, Point p2) {
        double x = Math.abs(p1.getX() - p2.getX());
        double y = Math.abs(p1.getY() - p2.getY());
        return Math.sqrt(x**2 + y**2);
    }
}