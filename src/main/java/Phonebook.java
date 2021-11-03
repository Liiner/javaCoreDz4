import java.util.ArrayList;
import java.util.HashMap;

public class Phonebook {

       HashMap<String, ArrayList<String>> phonebook = new HashMap<>();


    public void   addNombers(String name, String telephone){
        if (phonebook.get(name) == null) {
            ArrayList<String> phonelist = new ArrayList<>();
            phonelist.add(telephone);
            phonebook.put(name, phonelist);
        }
        else {
            phonebook.get(name).add(telephone);
        }
    }

    public ArrayList<String> getNombers(String name){
        System.out.print(name + " ");
        return phonebook.get(name);
    }
}
