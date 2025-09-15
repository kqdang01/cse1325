public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Point() {
        this(0,0);
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null || o.getClass() != getClass()) return false;
        Point p = (Point) o;
        return p.x == this.x && p.y == this.y;
    }
    @Override
    public int hashCode() {
        return Objects.hash(this.x, this.y)
    }
    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}