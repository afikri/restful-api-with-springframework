package net.afikri.employee.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.afikri.employee.model.Employee;

@Repository
public class EmployeeDao {

	@Autowired
    SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

	@SuppressWarnings("rawtypes")
    public List getEmployees() {
        Session session = this.sessionFactory.getCurrentSession();
        List employees = session.createQuery("from Employee").list();
        return employees;
    }
	
	public Employee getEmployeeById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Employee employee = (Employee)session.get(Employee.class, new Integer(id));
        return employee;
    }

    public void addEmployee(Employee employee) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(employee);
    }

    public void updateEmployee(Employee employee) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(employee);
    }

    public void deleteEmployee(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Employee employee = (Employee)session.get(Employee.class, new Integer(id));
        if(null != employee) {
            session.delete(employee);
        }
    }
}
