package homework_9_2;


public class Triangle extends Shape {
    private final double a;
    private final double b;
    private final double c;

    public Triangle(double x, double y, double a, double b, double c) {
        super(x, y);
        validateTriangle(a, b, c);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    private void validateTriangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Стороны треугольника должны быть положительными");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Неверный набор сторон: треугольник не существует");
        }
    }
    @Override
    public double getArea() {
        double p = (a + b + c) / 2.0;
        double value = p * (p - a) * (p - b) * (p - c);

        if (value < 0) {
            value = 0;
        }
        return Math.sqrt(value);
    }
    @Override
    public double getPerimeter() {
        return a + b + c;
    }
}