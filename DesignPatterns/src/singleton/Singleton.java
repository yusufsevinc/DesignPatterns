package singleton;

public class Singleton extends  Employee{


    private static Singleton singleton = null;

    private Singleton (){

    }
    public static Singleton getSingleton(){
       if (singleton == null){
           synchronized (Singleton.class){
               System.out.println("Singleton worked for the first time.");
              return   singleton = new Singleton();
           }
       }
       return singleton;
    }
}
