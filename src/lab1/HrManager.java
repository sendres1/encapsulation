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
public class HrManager {

//     private Employee new Employee;
       private Employee employee;
// 
  //  public void orientateNewEmployee() {
      public void orientateNewEmployee(String firstName, String lastName, String ssn) {
  //      Employee employee = new Employee();
  //    Employee employee = new Employee(firstname, lastname, ssn);
          Employee e1 = new Employee();
        e1.setFirstName(firstName);
        e1.setLastName(lastName);
        e1.setSsn(ssn);
   
        e1.meetWithHrForBenefitAndSalryInfo();
        e1.meetDepartmentStaff();

        e1.reviewDeptPolicies();
        e1.moveIntoCubicle("1");
        
     //   e1.doOrientation("A101");
        employee = e1;
    }
 
    
    public String getEmployeeStatus() {
        return employee.getStatus();
    }
}