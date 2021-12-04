package pro.sky.java.course2.weblibrary2;


public interface EmployeeService {
    Employee addEmployee(String firstName, String lastName) throws ArrayIsFullException;
    Employee add(Employee employee);

    Employee deleteEmployee(String firstName, String lastName) throws EmployeeNotFoundException;

    Employee findEmployee(String firstName, String lastName) throws EmployeeNotFoundException;
}
