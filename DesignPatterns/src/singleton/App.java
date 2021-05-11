package singleton;

public class App  {

    public static void main(String[] args) {
        Operations operations = new Operations();
        operations.AddChange(22);
        //
        int id = Singleton.getSingleton().getId();
        System.out.println("New Id: " + id);



    }


}
