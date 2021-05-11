package abstractFactory;

public class XC90Factory implements VolvoFactory {

    @Override
    public Volvo getVolvo(String model, String color, String engine) {
        return  new XC90(model, color, engine);
    }
}
