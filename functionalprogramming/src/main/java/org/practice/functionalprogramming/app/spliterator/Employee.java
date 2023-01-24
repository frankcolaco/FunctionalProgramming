package org.practice.functionalprogramming.app.spliterator;

import lombok.*;

import java.sql.Date;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Comparable<Employee>{

    private int id;
    private String name;
    private char gender;
    private Date dob;
    private String city;
    private String designation;
    private Date doj;
    private double salary;


    @Override
    public int compareTo(Employee o) {

        if(this.id<o.id)
            return -1;
        else if(this.id>o.id)
            return 1;
        else
            return 0;
    }
}
