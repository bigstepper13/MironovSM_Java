public class Rectangle extends Shape {
    protected double width, length;

    public Rectangle() {
        this.width = 1.0;
        this.length = 2.0;
        this.color = "white";
        this.filled = false;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        this.color = "white";
        this.filled = false;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle: width = " + width + ", length = " + length + ", color = " + color + ", filled = " + filled;
    }
}