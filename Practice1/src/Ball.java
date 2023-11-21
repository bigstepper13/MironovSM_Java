public class Ball {
    private String color;
    private int radius;

    public Ball(String color, int radius) {
        this.color = color;
        this.radius = radius;
    }
    public Ball(String color) {
        this.radius = 1;
        this.color = color;
    }
    public Ball(int radius) {
        this.radius = radius;
        this.color = "White";
    }
    public Ball(){
        this.radius = 1;
        this.color = "White";
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    @Override
    public String toString(){
        return this.color + ", radius " + this.radius;
    }
    public int getDiametr() {
        return 2 * radius;
    }
}