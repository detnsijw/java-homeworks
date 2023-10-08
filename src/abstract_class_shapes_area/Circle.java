package abstract_class_shapes_area;

public class Circle extends Shape {
    private int radius;
    private double area;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + area +
                '}';
    }

    @Override
    public void area() {
        area = Math.PI * radius * radius;
    }
}