package homework_9_2;
public class Main {
    public static void main(String[] args) {
        Shape[] figures = {
                new Circle(0, 0, 2),
                new Rectangle(1, 1, 4, 6),
                new Triangle(0, 0, 3, 4, 5),
                new Triangle(0, 0, 5, 5, 8),
                new Circle(3, 3, 1)
        };
        double sumOfPerimeters = 0;
        for (Shape figure : figures) {
            double perimeter = figure.getPerimeter();
            sumOfPerimeters += perimeter;
            System.out.printf("Фигура: %s, периметр: %.2f\n",
                    figure.getClass().getSimpleName(), perimeter);
        }
        System.out.printf("Сумма периметров всех фигур: %.2f\n",sumOfPerimeters);
    }
}

