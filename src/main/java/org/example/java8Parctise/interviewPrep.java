package org.example.java8Parctise;

import java.util.*;
import java.util.stream.Collectors;

public class interviewPrep {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 5, 20, 15, 30, 10, 25);

        numbers.stream().filter(n -> n > 15).forEach(System.out::println);
        numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
        numbers.stream().distinct().forEach(System.out::println);
        numbers.stream().sorted().forEach(System.out::println);
        numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        Optional<Integer> res1 = numbers.stream().max(Comparator.naturalOrder());
        System.out.println(res1.get());
        Optional<Integer> res2 = numbers.stream().min(Comparator.naturalOrder());
        System.out.println(res2.get());
        Integer n = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(n);

        OptionalDouble rn = numbers.stream().mapToInt(Integer::intValue).average();
        System.out.println(rn);
        Optional<Integer> res3 = numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(res3.get());

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Arun", "IT", 60000),
                new Employee(2, "Bala", "HR", 45000),
                new Employee(3, "Charan", "IT", 75000),
                new Employee(4, "Divya", "Finance", 55000),
                new Employee(5, "Elango", "HR", 75000),
                new Employee(6, "Fathima", "IT", 70000)
        );

        employees.stream().filter(m -> m.getSalary() > 60000).map(Employee::getName).forEach(System.out::println);
        Optional<Employee> res5 = employees.stream().max(Comparator.comparing(Employee::getSalary));
        System.out.println(res5);
        Optional<Employee> res6 = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).distinct().skip(1).findFirst();
        System.out.println(res6);

        Map<String,List<Employee>> res7=  employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(res7);
        Map<String,Long> res8 = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        System.out.println(res8);
    }
}
