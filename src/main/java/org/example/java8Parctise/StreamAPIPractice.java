package org.example.java8Parctise;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamAPIPractice {
    public static void main(String[] args) {

        List<Integer> nums = List.of(5, 10, 15, 20, 25, 30);

//        nums.stream().filter(n->n>15).forEach(System.out::println);
//        nums.stream().filter(n->n%2==0).map(n->n*10).forEach(System.out::println);
        nums.stream().distinct().sorted().forEach(System.out::println);
        nums.stream().distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        List<Integer> nums2 = List.of(10, 40, 20, 50, 30, 60);

        nums2.stream().distinct().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
       Integer n= nums2.stream().reduce(0,(a,b)->a+b);
        Integer n2= nums2.stream().reduce(1,(a,b)->a*b);
       System.out.println(n);
        System.out.println(n2);

        Long g = nums2.stream().filter(j->j>15).count();
        System.out.println(g);

        Optional<Integer> op= nums2.stream().findFirst();
        System.out.println(op.get()+"dddd");
        op.ifPresent(System.out::println);

        Optional<Integer>m= nums2.stream().max(Comparator.naturalOrder());
        m.ifPresent(System.out::println);
        Optional<Integer>m1= nums2.stream().min(Comparator.naturalOrder());
        m1.ifPresent(System.out::println);

        List<Integer> res=nums2.stream().filter(k->k>10).collect(Collectors.toList());
        System.out.println(res+"djdnjndd");

        List<Employee> employees = List.of(
                new Employee(1, "Aravindh", "IT", 5000),
                new Employee(2, "Dinesh", "MECH", 6000),
                new Employee(3, "Heman", "IT", 8000),
                new Employee(4, "Ashok", "MECH", 19000)
        );

       Map<String,Long> c1= employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));

       System.out.println(c1);

       Map<String,Double> c2= employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(c2);

        Map<String,Optional<Employee>> c3= employees.stream().
                collect(Collectors.groupingBy(Employee::getDepartment,
                Collectors.minBy(Comparator.comparing(Employee::getSalary))));
        System.out.println(c3+"j");

        Map<String, List<String>> result =
                employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.mapping(Employee::getName,Collectors.toList())));
        System.out.println(result);

    }
}
