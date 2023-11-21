import java.awt.*;

abstract class Shape {
    protected Color color;
    protected Point position;

    public Shape(Color color, Point position) {
        this.color = color;
        this.position = position;
    }

    public abstract void draw(Graphics g);
}

class Circle extends Shape {
    private int radius;

    public Circle(Color color, Point position, int radius) {
        super(color, position);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(position.x - radius, position.y - radius, radius * 2, radius * 2);
    }
}

class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(Color color, Point position, int width, int height) {
        super(color, position);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(position.x - width / 2, position.y - height / 2, width, height);
    }
}