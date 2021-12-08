package pro.sky.java.course2.weblibrary2;

import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;


@Service
public class EmployeeServiceimpl implements EmployeeService {
    Set<String> employees;
    public EmployeeServiceimpl(){
        employees = new HashSet<>();
    }

    @Override
    public Set<String> getEmployees() {
        return employees;
    }

    @Override
    public boolean add(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        return employees.add(String.valueOf(employee));
    }

    @Override
    public boolean remove(String firstName, String lastName)  throws EmployeeNotFoundException {
        Employee employee = new Employee(firstName, lastName);
            return employees.remove(String.valueOf(employee));
    }

    @Override
    public boolean findEmployee(String firstName, String lastName) throws EmployeeNotFoundException {
        Employee employee = new Employee(firstName, lastName);
        if (employees.contains(employee)) {
            return true;
        }
        return false;
    }

    // public EmployeeServiceimpl() {employees = new List(Employee.getFirstName(), employees.getLastName());}
    //private int size;

    //@Override
    //public Employee addEmployee(String firstName, String lastName) {
      //  Employee newEmployee = new Employee(firstName, lastName);
        //return add(newEmployee);
   // }
    //@Override
    //public Employee add(Employee employee) {
      //  if(size == employees.size) {
        //    throw new ArrayIsFullException();
        //}
        //employees[size++] = employee;
        //return employee;
        //}

    //@Override
    //public Employee deleteEmployee(String firstName, String lastName) {
      //  Employee newEmployee = new Employee(firstName, lastName);
        //return delete(newEmployee);
    //}
    //public Employee delete(Employee employee) {
      //  int index = indexOf(employee);
       // if (index != -1) {
         //   Employee result = employees[index];
           // System.arraycopy(employees, index + 1, employees, index,size - index);
            //size--;
            //return result;
        //}
        //throw new EmployeeNotFoundException();
    //}
    //@Override
    //public Employee findEmployee(String firstName, String lastName) {
      //  Employee newEmployee = new Employee(firstName, lastName);
        //int index = indexOf(newEmployee);
        //if (index != -1) {
          //  return employees[index];
        //} else {
          //  throw new EmployeeNotFoundException();
        //}
    //}
    //private Employee indexOf(Employee employee) {
      //  for(int i = 0; i < employees.length; i++){
        //    if(employees[i].equals(employee)) {
          //      return i;
            //}
        //}
        //return -1;
    //}



}

