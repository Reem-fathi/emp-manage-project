package com.example.project.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "EmployeeList",uniqueConstraints =
  {
    @UniqueConstraint(columnNames = {"emp_id"})})

public class Employee {
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  @Column(name = "emp_id")
  private Integer empId;
  private String name;
  private String Email;
  private String project;
  private String Address;
  private String Skill;
  private String Dob;
  private String JoiningDate;
  private float Salary;
  private String modified="Not edited";
  public String getModified() {
    return modified;
  }

  public void setModified(String modified) {
    this.modified = modified;
  }

}
