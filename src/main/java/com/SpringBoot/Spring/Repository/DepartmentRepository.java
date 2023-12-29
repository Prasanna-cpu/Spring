package com.SpringBoot.Spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBoot.Spring.Entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
    public Department findByDepartmentNameIgnoreCase(String departmentName);
}
