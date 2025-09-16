public class Polygon {
    public static final int MAX_SIDES = 12;
    private int numSides;
    private Point[] points = new Point[MAX_SIDES];

    public void addPoint(Point point) {
        for (int i = 0; i < numSides; ++i) {
            if (points[i].equals(point)) throw new IllegalArgumentException("Duplicate Point: " + point);
        }
        if (this.numSides == this.MAX_SIDES) throw new RuntimeException("Polygon is full");
        this.points[this.numSides] = point;
        this.numSides++;
    }

    public double perimeter() {
        if (this.numSides < 3) throw new RuntimeException("Polygons required 3+ sides!");
        int j = 0;
        double sum = 0;
        for (int i = 1; i < this.numSides; ++i) {
            sum += this.lineLength(points[j], points[i]);
            j++;
        }
        sum += this.lineLength(points[0], points[numSides-1]);
        return sum;
    }
    @Override
    public String toString() {
        String pointString = "";
        for (Point point : this.points) pointString += point + ",";
        return "Polygon[" + pointString + "]";
    }
    private static double lineLength(Point p1, Point p2) {
        double x = Math.abs(p1.getX() - p2.getX());
        double y = Math.abs(p1.getY() - p2.getY());
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
}