package com.SpringBoot.Spring.Service;

import org.hibernate.mapping.List;

import com.SpringBoot.Spring.Entity.Department;

public interface DepartmentService {

    public Department saveDepartment(Department department);

    public java.util.List<Department> FetchDepartmentList();

    public Department FetchDepartmentByID(Long departmentId);

    public void DeleteDepartmentByID(Long departmentId);

    public Department UpdateDepartment(Long departmentId, Department department);

    public Department FetchDepartmentByName(String departmentName);


    
}
