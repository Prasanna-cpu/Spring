package com.SpringBoot.Spring.Controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.Spring.Entity.Department;
import com.SpringBoot.Spring.Error.DepartmentNotFoundException;
import com.SpringBoot.Spring.Service.DepartmentService;

import jakarta.validation.Valid;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department) {
        return departmentService.saveDepartment(department);
        // return "Department saved";
    }

    @GetMapping("/departments")
    public List<Department> FetchDepartmentList() {
        return (List<Department>) departmentService.FetchDepartmentList();
    }

    @GetMapping("/departments/{id}")
    public Department FetchDepartmentByID(@PathVariable("id") Long departmentId) throws DepartmentNotFoundException {
        Optional<Department> department = departmentService.FetchDepartmentByID(departmentId);

        if (!department.isPresent()) {
            throw new DepartmentNotFoundException("Department Not Available");
        }

        return department.get();
    }

    @DeleteMapping("/departments/{id}")
    public String DeleteDepartmentByID(@PathVariable("id") Long departmentId) {
        departmentService.DeleteDepartmentByID(departmentId);
        return "Data sucessflly deleted";
    }

    @PutMapping("/departments/{id}")
    public Department UpdateDepartment(@PathVariable("id") Long departmentId, @RequestBody Department department) {
        return departmentService.UpdateDepartment(departmentId, department);
    }

    @GetMapping("/departments/name/{name}")
    public Department FetchDepartmentByName(@PathVariable("name") String departmentName) {
        try {
            return departmentService.FetchDepartmentByName(departmentName);
        } catch (DepartmentNotFoundException ex) {
            // Handle DepartmentNotFoundException
            throw ex;
        }
    }
}



