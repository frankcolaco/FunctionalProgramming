package org.practice.functionalprogramming.app.spliterator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class CollectorsMain {

    public static void main(String[] args) {

        Path empData = Paths.get("C:\\Users\\FrankColaco\\study\\gitHub\\FunctionalProgramming\\functionalprogramming\\src\\main\\java\\org\\practice\\functionalprogramming\\app\\spliterator\\EmployeeData.txt");
        try(Stream<String> lines = Files.lines(empData)){

            Spliterator<String> baseSpliterator = lines.flatMap(line -> Arrays.stream(line.split(","))).spliterator();
            Spliterator<Employee> empSpliterator = new EmployeeSpliterator(baseSpliterator);
            // to get List from custom spliterator
            List<Employee> employees =  StreamSupport.stream(empSpliterator,false).collect(Collectors.toList());
            System.out.println(employees);
            // To get a sorted TreeSet, we will collect it to "toCollection" and give the constructor reference
            //TreeSet<Employee> sortedEmployees = StreamSupport.stream(empSpliterator,false).collect(Collectors.toCollection(TreeSet::new));
            //System.out.println(sortedEmployees);
            
            //to collect using partioningBy
            Map<Boolean, List<Employee>> partitionedData = employees.stream().collect(Collectors.partitioningBy(emp -> emp.getGender() == 'M'));
            List<Employee> maleEmployees = partitionedData.get(true);
            List<Employee> femaleEmployees = partitionedData.get(false);
            System.out.println(maleEmployees);
            System.out.println(femaleEmployees);

            Map<String, List<Employee>> employeesByDesignation = employees.stream().collect(Collectors.groupingBy(Employee::getDesignation));
            System.out.println(employeesByDesignation);

        }catch (IOException ioException){
            System.out.println(ioException.getCause());
        }

    }
}
