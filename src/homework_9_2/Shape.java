package homework_9_2;
abstract class Shape {
    protected double x, y;
    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}


