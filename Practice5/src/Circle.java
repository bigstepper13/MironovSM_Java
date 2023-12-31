public class Circle extends Shape {
    protected double radius;

    public Circle () {
        this.radius = 1.0;
        this.color ="white";
        this.filled = false;
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color ="white";
        this.filled = false;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public String toString() {
        return "Circle: radius = " + radius + ", color = " + color + ", filled = " + filled;
    }
}