package exercises.oop.inheritance;

public class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point() {
        this(0, 0);
    }

    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    public double distance(int x, int y) {
        x = Math.abs(x - this.x);
        y = Math.abs(y - this.y);
        return Math.sqrt(x * x + y * y);
    }

    public double distance(Point point) {
        int x = Math.abs(point.x - this.x);
        int y = Math.abs(point.y - this.y);
        return Math.sqrt(x * x + y * y);
    }
}
