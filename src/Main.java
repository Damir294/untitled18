import Product.Product;
import Table.MultiplicationTable;
import Table.Task;
import PhoneBook.PhoneBook;
import PhoneBook.FullName;

import java.util.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        numbersSetRemoveEven();
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        System.out.println(multiplicationTable);
        Task task = new Task(5, 3);
        Set<Task> set = new HashSet<>();
        set.add(task);
        System.out.println(set);
    }
    PhoneBook phoneBook = new PhoneBook();
        phoneBook.addPhone(new FullName("Дорин", "Максим"), "89582543352");
        phoneBook.addPhone(new FullName("Шилкин", "Антон"), "89613854342");
        phoneBook.addPhone(new FullName("Стёпын", "Кирилл"), "89645940023");
        System.out.println(phoneBook);

    public static void numbersSetRemoveEven() {
        Set<Integer> numbers = new HashSet<>(20);
        Random random = new Random();
        while (numbers.size() < 20) {
            numbers.add(random.nextInt(1000));
        }
        System.out.println(numbers);
        Iterator<Integer> numberIterator = numbers.iterator();
        while (numberIterator.hasNext()) {
            int number = numberIterator.next();
            if (number % 2 != 0) {
                numberIterator.remove();
            }
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