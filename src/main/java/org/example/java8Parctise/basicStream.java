package org.example.java8Parctise;

import java.util.*;
import java.util.stream.Collectors;

public class basicStream {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(10, 5, 20, 15, 30, 25, 40);

        nums.stream().filter(n -> n % 2 == 0).map(n -> n * n).forEach(System.out::println);

        List<Employee> employees = List.of(
                new Employee(1, "Aravindh", "IT", 500000),
                new Employee(2, "Dinesh", "MECH", 60000),
                new Employee(3, "Heman", "IT", 8000),
                new Employee(4, "Ashok", "MECH", 1900)
        );

        employees.stream().filter(n -> n.getSalary() > 50000).map(Employee::getName).forEach(System.out::println);
        List<Employee> emp = employees.stream().filter(n -> n.getSalary() > 50000).collect(Collectors.toList());
        List<String> emp2 = employees.stream().filter(n -> n.getSalary() > 50000).map(Employee::getName).collect(Collectors.toList());
        System.out.println(emp);
        System.out.println(emp2);

        List<Integer> nums3 = nums.stream().filter(n -> n % 2 == 0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(nums3);

        List<String> emp3 = employees.stream().filter(n -> n.getSalary() > 50000).sorted(Comparator.comparing(Employee::getSalary)).map(Employee::getName).collect(Collectors.toList());
        System.out.println(emp3);

        Optional<String> emp4 = employees.stream().distinct().sorted(Comparator.comparing(Employee::getSalary).reversed()).map(Employee::getName).findFirst();
        System.out.println(emp4);

        int res = nums.stream().reduce(0, (a, b) -> a + b);
        System.out.println(res);
        int res2 = nums.stream().reduce(1, (a, b) -> a * b);
        System.out.println(res2);

        Map<String, List<Employee>> emp5 = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(emp5);

        List<String> names =
                Arrays.asList(
                        "Arun", "Bala", "Arun",
                        "Kumar", "Bala", "Arun"
                );

        Map<String, Long> res5 = names.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
        System.out.println(res5);

        Map<String, Long> res6 = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(res6);


        Map<String, Double> res7 = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(res7);
        Map<String, Optional<Employee>> res8 = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        System.out.println(res8+"dd");

        Map<String, String> res9 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
                                f -> f.get().getName())));
        System.out.println(res9);

        Map<Boolean, List<Integer>> nn = nums.stream().collect(Collectors.partitioningBy(n -> n > 25));
        System.out.println(nn);


        Map<String, List<String>> mm = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList())));
        System.out.println(mm);


        Map<String,List<String>> cc=employees.stream().filter(n->n.getSalary()>50000).collect(Collectors.groupingBy(Employee::getDepartment,Collectors.mapping(n->n.getName(),Collectors.toList())));

        System.out.println(cc);
        Map<String,String> ccd=employees.stream().filter(n->n.getSalary()>50000).collect(Collectors.groupingBy(Employee::getDepartment,
                Collectors.mapping(n->n.getName(),Collectors.joining(","))));

        System.out.println(ccd);

        List<List<Integer>> numsF = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7)
        );

      List<Integer> neee=  numsF.stream().flatMap(n->n.stream()).collect(Collectors.toList());

        System.out.println(neee);
    }

}
