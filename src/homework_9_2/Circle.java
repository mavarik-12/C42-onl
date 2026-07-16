package homework_9_2;
public class Circle extends Shape {
    private final double radius;
    public Circle(double x, double y, double radius) {
        super(x, y);
        if (radius <= 0) {
            throw new IllegalArgumentException("Радиус должен быть положительным");
        }
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
