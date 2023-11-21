public class Square extends Rectangle {
    public Square() {
        this.width = 1.0;
        this.length = 2.0;
        this.color = "white";
        this.filled = false;
    }

    public Square(double side) {
        this.width = side;
        this.length = side;
        this.color = "white";
        this.filled = false;
    }

    public Square(double side, String color, boolean filled) {
        this.width = side;
        this.length = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }
    @Override
    public void setWidth(double side) {
        this.width = side;
    }

    @Override
    public void setLength(double side) {
        this.length = side;
    }

    @Override
    public String toString() {
        return "Square: width = " + width + ", length = " + length + ", color = " + color + ", filled = " + filled;
    }
}