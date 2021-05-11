package factory;

public class VolvoCars {

    public static void main(String[] args) {
        Volvo XC90 =  VolvoFactory.getVolvo("XC90","RED","20V HYBİRD");
        System.out.println(XC90);


        Volvo V40 = VolvoFactory.getVolvo("V40" , "BLUE","16V HYBİRD");
        System.out.println(V40);


        Volvo Y5512 = VolvoFactory.getVolvo("Y5512", "WHİTE", "1.6 TDI");
        System.out.println(Y5512);


    }


}
