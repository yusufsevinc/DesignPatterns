package factory;

public class XC90 implements Volvo{

    private String model;
    private String color;
    private String engine;

    public XC90(String model, String color, String engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "XC90{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }
}
