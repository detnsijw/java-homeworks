package abstract_class_shapes_area;

public abstract class Shape implements Comparable<Shape> {
    private double area;

    public abstract void area();

    public double getArea() {
        return area;
    }

    @Override
    public int compareTo(Shape o) {
        return (int) (this.getArea() - o.getArea());
    }
}