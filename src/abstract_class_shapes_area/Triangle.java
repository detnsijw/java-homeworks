package abstract_class_shapes_area;

public class Triangle extends Shape {
    private int side;
    private int height;
    private double area;

    public Triangle(int side, int height) {
        this.side = side;
        this.height = height;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
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
        return "Triangle{" +
                "side=" + side +
                ", height=" + height +
                ", area=" + area +
                '}';
    }

    @Override
    public void area() {
        area = (double) (side * height) / 2;
    }
}
