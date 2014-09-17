/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;
import java.util.logging.Logger;
import lab1.Employee;
/**
 *
 * @author sendres1
 */
public class NewEmployee {

    public NewEmployee() {
        
         
        
    }

//    public Employee getEmployee() {
//        
//        return employee;
//    }
//
//    public void setEmployee(Employee employee) {
//        this.employee = employee;
//    }
//    
    public Employee setupEmployee() {
      
    
     Employee employee = new Employee();
       employee.firstName = "Peter";
        employee.lastName = "Piper";
        employee.ssn = "333-1234";
        employee.meetWithHrForBenefitAndSalryInfo();
        employee.meetDepartmentStaff();
        
        employee.reviewDeptPolicies();
        employee.moveIntoCubicle("1");
        return employee;
}
}
