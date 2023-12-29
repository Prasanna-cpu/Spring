package com.SpringBoot.Spring.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.Spring.Entity.Department;
import com.SpringBoot.Spring.Service.DepartmentService;
import com.SpringBoot.Spring.Service.DepartmentServiceImplementation;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);
        //return "Department saved";
    }
    @GetMapping("/departments")
    public List<Department> FetchDepartmentList(){
        return (List<Department>) departmentService.FetchDepartmentList();
    }
}
