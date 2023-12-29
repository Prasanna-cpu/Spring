package com.SpringBoot.Spring.Service;

import java.util.Objects;

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

    @Override
    public Department FetchDepartmentByID(Long departmentId) {
        
        return departmentRepository.findById(departmentId).get();
    }

    @Override
    public void DeleteDepartmentByID(Long departmentId) {
        // TODO Auto-generated method stub
        departmentRepository.deleteById(departmentId);
    }

    @Override
    public Department UpdateDepartment(Long departmentId, Department department) {
        Department depDB=departmentRepository.findById(departmentId).get();
        if(Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName())){
            depDB.setDepartmentName(department.getDepartmentName());
        }

        if(Objects.nonNull(department.getDepartmentCode()) && !"".equalsIgnoreCase(department.getDepartmentCode())){
            depDB.setDepartmentCode(department.getDepartmentCode());
        }

        if(Objects.nonNull(department.getDepartmentAddress()) && !"".equalsIgnoreCase(department.getDepartmentAddress())){
            depDB.setDepartmentAddress(department.getDepartmentAddress());
        }
        return departmentRepository.save(depDB);
    }

    @Override
    public Department FetchDepartmentByName(String departmentName) {
        return departmentRepository.findByDepartmentNameIgnoreCase(departmentName);
    }

    

    

   
    
}
