package org.example.collectionPractice;


import java.util.*;

public class ListFile {
    public static void main(String[] args) {

        List<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.set(1, 50);
        num.remove(1);
        System.out.println(num.contains(10));

        System.out.println(num);

        for (Integer i : num) {
            System.out.println(i);
        }

        List<String> names = new LinkedList<>();
        names.add("Java");
        names.add("Spring");
        names.add("React");
        names.add("Angular");

        System.out.println(names);
        System.out.println(names.get(0));
        System.out.println(names.get(names.size() - 1));
        names.add(0, "SQL");
        names.remove("React");
        System.out.println(names);
        for (String s : names) {
            System.out.println(s);
        }

        Set<Integer> setValues = new HashSet<>();

        setValues.add(10);
        setValues.add(20);
        setValues.add(30);
        setValues.add(20);
        setValues.add(10);
        setValues.remove(20);

        System.out.println(setValues);
        System.out.println(setValues.contains(30));
        System.out.println(setValues.size());
        for (Integer s : setValues) {
            System.out.println(s);
        }

        Map<Integer, String> mapValues = new HashMap<>();
        mapValues.put(101, "Aravindh");
        mapValues.put(102, "Dinesh");
        mapValues.put(103, "Heman");

        System.out.println(mapValues);
        System.out.println(mapValues.get(102));
        mapValues.put(102, "Ashok");
        System.out.println(mapValues.containsKey(101));
        mapValues.remove(103);
        System.out.println(mapValues.keySet());
        System.out.println(mapValues.values());

        for (Map.Entry<Integer, String> entry : mapValues.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
        mapValues.forEach((k,v)->{
            System.out.println(k+"-"+v);
        });
    }
}
