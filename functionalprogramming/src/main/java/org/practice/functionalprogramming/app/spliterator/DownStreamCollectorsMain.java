package org.practice.functionalprogramming.app.spliterator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class DownStreamCollectorsMain {

    public static void main(String[] args) {
        Path empData = Paths.get("C:\\Users\\FrankColaco\\study\\gitHub\\FunctionalProgramming\\functionalprogramming\\src\\main\\java\\org\\practice\\functionalprogramming\\app\\spliterator\\EmployeeData.txt");
        try(Stream<String> lines = Files.lines(empData)){

            Spliterator<String> baseSpliterator = lines.flatMap(line -> Arrays.stream(line.split(","))).spliterator();
            Spliterator<Employee> empSpliterator = new EmployeeSpliterator(baseSpliterator);
            List<Employee> employees =  StreamSupport.stream(empSpliterator,false).collect(Collectors.toList());
            // to find designations and how many employees per designation
            Map<String, Long> employeesByDesignation = employees.stream().collect(Collectors.groupingBy(Employee::getDesignation,Collectors.counting()));
            System.out.println(employeesByDesignation);
            // to find fund distribution among employees

            Map<String, Double> fundDistribution = employees.stream().collect(Collectors.groupingBy(Employee::getDesignation, Collectors.summingDouble(Employee::getSalary)));
            System.out.println(fundDistribution);

            // to find max salaried Employees

            Map<String, Optional<Employee>> maxSalariesEmployees = employees.stream().collect(Collectors.groupingBy(Employee::getDesignation
                    , Collectors.maxBy(Comparator.comparing(Employee::getSalary))
            ));
            System.out.println(maxSalariesEmployees);

            // to find max salaried employees per designation
            Map<String, Optional<Double>> maxSalariedEmployees = employees.stream().collect(Collectors.groupingBy(Employee::getDesignation,
                    Collectors.mapping(Employee::getSalary,
                            Collectors.maxBy(Comparator.comparing(
                                    Function.identity()))
                    )));
            System.out.println(maxSalariedEmployees);

        }catch (IOException ioException){
            System.out.println(ioException.getCause());
        }
    }
}
