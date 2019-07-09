package net.afikri.employee.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.afikri.employee.dao.EmployeeDao;
import net.afikri.employee.model.Employee;

@Service("employeeService")
public class EmployeeService {

    @Autowired
    EmployeeDao employeeDao;
    
    @Transactional
    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Transactional
    public List<?> getEmployees() {
        return employeeDao.getEmployees();
    }

    @Transactional
    public Employee getEmployeeById(int id) {
        return employeeDao.getEmployeeById(id);
    }

    @Transactional
    public void addEmployee(Employee employee) {
    	employeeDao.addEmployee(employee);
    }

    @Transactional
    public void updateEmployee(Employee employee) {
    	employeeDao.updateEmployee(employee);
    }

    @Transactional
    public void deleteEmployee(int id) {
    	employeeDao.deleteEmployee(id);
    }
}
