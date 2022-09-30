package Collections;

import java.sql.DriverManager;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "Một");
        map.put("2", "Hai");
        map.put("3", "Ba");
        map.put("4", "Bốn");
        List<Integer> list = new ArrayList<>();
        Integer[] arr = {1, 5, 4, 6, 7, 3, 6, 4};


        // 1. Sort Array Integer
            // Convert arr to list
        list = Arrays.asList(arr);
            // get list distinct by Stream API
        list = list.stream().distinct().collect(Collectors.toList());
        Set<Integer> set = new HashSet<>(list);
            // Sort
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -o1.compareTo(o2);
            }
        });
        System.out.println("List : ");
        System.out.println(list.toString());
        System.out.println(list.get(1));
        System.out.println("----Set----");
        set.forEach(p -> System.out.print(p + " "));
        // 2. Convert Map to List
            // Get Set Entry
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        System.out.println("\n" + "----EntrySet----");
        entrySet.forEach(p -> System.out.print(p + " "));

            // Get List Entry use by Set Entry
        List< Map.Entry<String, String>> entryList = new ArrayList<>(entrySet);
        System.out.println("\n" + "-----EntryList-----");
        entryList.forEach(p -> System.out.print(p + " "));



//        double a = 39/6d;
//
//        double eps = 23000/3560d;
//        System.out.println(eps);
//        System.out.println();
    }
}
