package TMS.Task2;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Triangle(5, 5, 5);
        shapes[1] = new Rectangle(9, 8);
        shapes[2] = new Circle(14);
        shapes[3] = new Triangle(5, 12, 13);
        shapes[4] = new Circle(15);

        double allPerimeter = 0;
        for (Shape shape : shapes) {
            allPerimeter += shape.calculatePerimeter();
        }

        System.out.println("Сумма периметров всех фигур: " + allPerimeter);
    }
}
