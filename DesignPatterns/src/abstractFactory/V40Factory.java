package abstractFactory;

public class V40Factory implements VolvoFactory {

    @Override
    public Volvo getVolvo(String model, String color, String engine) {
        return new V40(model,color,engine);

    }
}
