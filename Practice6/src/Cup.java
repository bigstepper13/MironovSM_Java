public class Cup extends Dish {
    private int volume;

    public Cup(String material, String color, int volume) {
        super(material, color);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void wash() {
        System.out.println("Washing the cup");
    }
}