package com.example.project.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "project")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Project {
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private Integer EmpId;
  private String Project_Name;
  private Integer Start_Date;
  private Integer End_Date;
  private String Technology;

}
