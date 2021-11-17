public class Producent {
    private String model;
    private String type;

    public Producent(String model, String type) {
        this.model = model;
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Producent{" +
                "model='" + model + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
