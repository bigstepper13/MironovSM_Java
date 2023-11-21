public class Plate extends Dish {
    private int diameter;

    public Plate(String material, String color, int diameter) {
        super(material, color);
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public void wash() {
        System.out.println("Washing the plate");
    }
}