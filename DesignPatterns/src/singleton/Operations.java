package singleton;

public class Operations implements SingletonIDAL{

    public void AddChange(int newId){
        getSingleton().setId(newId);
    }

    public void nameChange(String newName){
        getSingleton().setName(newName);
    }


    public void surnameChange(String newSurname){
        getSingleton().setSurname(newSurname);
    }


    public void eMailChange(String newEMail){
        getSingleton().seteMail(newEMail);
    }

    @Override
    public Singleton getSingleton() {
        return Singleton.getSingleton();
    }
}
