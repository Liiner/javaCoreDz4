import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Phonebook phonebook = new Phonebook();
        phonebook.addNombers("Roma", "8(888)888-88-88");
        phonebook.addNombers("Roma", "8(888)888-88-99");
        phonebook.addNombers("Tolya", "8(888)888-88-77");
        phonebook.addNombers("Petya", "8(888)888-88-66");
        phonebook.addNombers("Petya", "8(888)888-88-88");

        System.out.println(phonebook.getNombers("Roma"));
        System.out.println(phonebook.getNombers("Tolya"));
        System.out.println( phonebook.getNombers("Petya"));




        int a = 0;
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Рома","Плотник");
        hashMap.put("Коля","Слесарь");
        hashMap.put("Степа","Плотник");
        hashMap.put("Саша","Плотник");
        hashMap.put("Паша","Плотник");
        hashMap.put("Сеня","Слесарь");
        hashMap.put("Толя","Плотник");
        hashMap.put("Тихон","Сантехник");
        hashMap.put("Петя","Слесарь");
        hashMap.put("Антон","Слесарь");

        //вывод массива
        System.out.println(hashMap);

        //вывод уникальных
        Set<String> uniqueValues = new HashSet<>(hashMap.values());
        System.out.println(uniqueValues);

        //кол-во повторения

        }
    }


