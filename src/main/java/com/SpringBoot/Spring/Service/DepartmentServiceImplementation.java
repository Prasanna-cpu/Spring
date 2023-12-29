package com.SpringBoot.Spring.Service;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot.Spring.Entity.Department;
import com.SpringBoot.Spring.Repository.DepartmentRepository;

@Service
public class DepartmentServiceImplementation implements DepartmentService{


    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public java.util.List<Department> FetchDepartmentList() {
        return departmentRepository.findAll();
    }
    
}
