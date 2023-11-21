public class Car implements Nameable {
    private String model;

    Car(String model) { this.model = model; }

    @Override
    public String getName() { return model; }
}