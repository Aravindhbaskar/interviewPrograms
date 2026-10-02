package org.example.java8Parctise;

import java.util.*;
import java.util.stream.Collectors;

public class Infosys {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Arun", "IT", 60000),
                new Employee(2, "Bala", "HR", 45000),
                new Employee(3, "Charan", "IT", 75000),
                new Employee(4, "Divya", "Finance", 55000),
                new Employee(5, "Elango", "HR", 75000),
                new Employee(6, "Fathima", "IT", 70000)
        );

        List<String> res1 = employees.stream().filter(n -> n.getSalary() > 60000).map(Employee::getName).collect(Collectors.toList());
        System.out.println(res1);

        List<String> res2 = employees.stream().filter(n -> n.getSalary() > 50000).map(Employee::getDepartment).distinct().collect(Collectors.toList());
        System.out.println(res2);


        Map<String, List<String>> res3 = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList())));
        System.out.println(res3);

        Map<String, List<Employee>> res4 = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(res4);

        Map<String, Long> res5 = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(res5);
        Map<String, Double> res6 = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(res6);

        Map<String, Optional<Employee>> res7 = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        System.out.println(res7);

        Map<String, String> res8 = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                Collectors.collectingAndThen(
                        Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
                        m -> m.get().getName())));
        System.out.println(res8);

        Map<String, String> res9 = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(Employee::getSalary)), n -> n.get().getName())));
        System.out.println(res9);

        Map<String, List<String>> res10 = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(n -> n.getName(), Collectors.toList())));
        System.out.println(res10);

        Map<Boolean, List<Employee>> res11 = employees.stream().collect(Collectors.partitioningBy(n -> n.getSalary() > 60000));
        System.out.println(res11);

        Map<Boolean, List<String>> res12 = employees.stream().collect(Collectors.partitioningBy(k -> k.getSalary() > 60000, Collectors.mapping(Employee::getName, Collectors.toList())));
        System.out.println(res12);

        List<List<Integer>> numbers1 = List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(7, 8)
        );

        List<Integer> res13 = numbers1.stream().flatMap(integers -> integers.stream().filter(n -> n > 3)).toList();
        System.out.println(res13);


        List<Integer> numbers = Arrays.asList(
                10, 25, 30, 15, 40, 25, 50, 10, 60, 35
        );

        numbers.stream().filter(n -> n % 2 == 0).filter(n -> n > 20).distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        Integer res15 = numbers.stream().filter(n -> n > 20).reduce(0, (a, b) -> a + b);
        System.out.println(res15);

        Optional<Integer> res16 = numbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(res16.get());

        List<Integer> res17 = numbers.stream().map(n -> n * n).filter(n -> n > 30).collect(Collectors.toList());
        System.out.println(res17);

        Optional<Integer> res18 = numbers.stream().filter(n -> n % 2 == 0).max(Comparator.naturalOrder());
        System.out.println(res18);

        Map<String, List<String>> res19 = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.filtering(n -> n.getSalary() > 60000, Collectors.mapping(Employee::getName, Collectors.toList()))));
        System.out.println(res19);

        Map<Integer,Long> res20= numbers.stream().collect(Collectors.groupingBy(n->n,Collectors.counting()));
        System.out.println(res20);
    }

}
