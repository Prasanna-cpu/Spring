package com.SpringBoot.Spring.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentID;
    @NotBlank(message = "Add Department Name")
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;



    // public Department(Long departmentID,String departmentName,String departmentAddress,String departmentCode){

    //     this.departmentID=departmentID;
    //     this.departmentName=departmentName;
    //     this.departmentCode=departmentCode;
    //     this.departmentAddress=departmentAddress;

    // }


    // public Department() {
    // }
    
    // public Long getDepartmentID() {
    //     return this.departmentID;
    // }

    // public void setDepartmentID(Long departmentID) {
    //     this.departmentID = departmentID;
    // }

    // public String getDepartmentName() {
    //     return this.departmentName;
    // }

    // public void setDepartmentName(String departmentName) {
    //     this.departmentName = departmentName;
    // }

    // public String getDepartmentAddress() {
    //     return this.departmentAddress;
    // }

    // public void setDepartmentAddress(String departmentAddress) {
    //     this.departmentAddress = departmentAddress;
    // }

    // public String getDepartmentCode() {
    //     return this.departmentCode;
    // }

    // public void setDepartmentCode(String departmentCode) {
    //     this.departmentCode = departmentCode;
    // }



    
}
