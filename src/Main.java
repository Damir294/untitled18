import PhoneBook.PhoneBook;
import PhoneBook.FullName;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addPhone(new FullName("Дорин", "Максим"), "89582543352");
        phoneBook.addPhone(new FullName("Шилкин", "Антон"), "89613854342");
        phoneBook.addPhone(new FullName("Стёпын", "Кирилл"), "89645940023");
        System.out.println(phoneBook);

        Map<Integer, String> orderedMap = new LinkedHashMap<>();
        orderedMap.put(4,"Дыни");
        orderedMap.put(5,"Бананов");
        orderedMap.put(2,"Яблока");
        orderedMap.put(1,"Ананас");
        orderedMap.put(8,"Мандаринов");
        orderedMap.put(7,"Груш");
        orderedMap.put(3,"Апельсина");
        orderedMap.put(6,"Слив");
        orderedMap.put(9,"Огурцов");
        orderedMap.put(10,"Киви");
        for (Map.Entry<Integer, String> entry : orderedMap.entrySet()) {
            System.out.println(entry.getKey()+":  "+ entry.getValue());
        }
    }
}