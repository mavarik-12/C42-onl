package homework_9_2;
public class Rectangle extends Shape {
    private final double width;
    private final double height;
    public Rectangle(double x, double y, double width, double height) {
        super(x, y);
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Ширина и высота должны быть положительными");
        }
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea() {
        return width * height;
    }
    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}


