package com.SpringBoot.Spring.Service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.SpringBoot.Spring.Entity.Department;
import com.SpringBoot.Spring.Repository.DepartmentRepository;


@SpringBootTest
public class DepartmentServiceTest {
    @Autowired
    private DepartmentService departmentService;
    @MockBean
    private DepartmentRepository departmentRepository;
    @BeforeEach
    void setup(){
        Department department=
    }
    @Test
    public void ValidDepartmentNameFinder(){
        String departmentName="CSE-AI/ML";
        Department found=departmentService.FetchDepartmentByName(departmentName);
        assertEquals(departmentName, found.getDepartmentName());
    }

}
