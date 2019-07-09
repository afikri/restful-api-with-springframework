package net.afikri.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.afikri.employee.model.Employee;
import net.afikri.employee.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value="/getEmployees", method=RequestMethod.GET, headers="Accept=application/json")
    public List<?> getEmployees() {
        return employeeService.getEmployees();
    }

    @RequestMapping(value="/getEmployees/{id}", method=RequestMethod.GET, headers="Accept=application/json")
    public Employee getEmployeeById(@PathVariable int id) {
        return employeeService.getEmployeeById(id);
    }

    @RequestMapping(value="/addEmployee", method=RequestMethod.POST)
    public void addEmployee(@RequestBody Employee employee) {
    	employeeService.addEmployee(employee);
    }

    @RequestMapping(value="/updateCountry", method=RequestMethod.PUT)
    public void updateEmployee(@RequestBody Employee employee) {
    	employeeService.updateEmployee(employee);
    }

    @RequestMapping(value="/deleteEmployee/{id}", method=RequestMethod.DELETE)
    public void deleteEmployee(@PathVariable int id) {
    	employeeService.deleteEmployee(id);
    }

}
