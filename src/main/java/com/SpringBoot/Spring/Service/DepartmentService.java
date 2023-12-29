package com.SpringBoot.Spring.Service;

import org.hibernate.mapping.List;

import com.SpringBoot.Spring.Entity.Department;

public interface DepartmentService {

    public Department saveDepartment(Department department);

    public java.util.List<Department> FetchDepartmentList();
    
}
