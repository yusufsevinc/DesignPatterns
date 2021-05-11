package abstractFactory;

public class VolvoCars {

    public static void main(String[] args) {

        V40Factory v40Factory = new V40Factory();
        V40 v40 = (V40) v40Factory.getVolvo("V40", "BLUE", "16V HYBİRD");
        System.out.println(v40);

        XC90Factory xc90Factory = new XC90Factory();
        Volvo xc90 = xc90Factory.getVolvo("XC90 T8" , "GREEN" , "4.0 T8 HYBİRD");
        System.out.println(xc90);






    }


}
