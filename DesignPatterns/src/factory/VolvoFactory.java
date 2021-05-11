package factory;

public class VolvoFactory {

    public static Volvo getVolvo(String model , String color , String engine){

        Volvo volvo;

        if ("XC90".equalsIgnoreCase(model)){
            volvo = new XC90(model,color,engine);

        }else if("V40".equalsIgnoreCase(model)){
            volvo = new V40(model, color, engine);
        }else{
               throw  new RuntimeException("Not found model!");
        }

    return volvo;
    }



}
