package core.basesyntax;

public class Circle extends BaseShape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea()
                + " sq. units, radius: " + radius
                + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        radius = Math.sqrt(radius / Math.PI);
        return radius;
    }
}
