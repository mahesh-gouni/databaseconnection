package com.example.databaseConnectivity.plainJPA;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ENTITYCLASS")
public class EntityClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="EmployeeID",nullable = false)
    private Long EmployeeID;


    @Column(name="EmployeeName",nullable = false)
    private String EmployeeName;


    @Column(name="Age",nullable = false)
    private int Age;


    @Column(name="DepartmentID",nullable = false)
    private int DepartmentID;


//    @Column(name="joiningdate",nullable = false)
//    private Date joiningdate;


    @Column(name="Salary",nullable = false)
    private double Salary;


    @Column(name="Location",nullable = false)
    private String  Location;


    @Column(name="gmail",nullable = false)
    private String  gmail;



}
