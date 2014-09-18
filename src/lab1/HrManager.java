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

// 
    public void OrientateEmployee() {
  
        Employee employee = new Employee();
  //    Employee employee = new Employee(firstname, lastname, ssn);
        employee.setFirstName("Peter");
        employee.setLastName("Piper");
        employee.setSsn("333-1234");
        employee.meetWithHrForBenefitAndSalryInfo();
        employee.meetDepartmentStaff();

        employee.reviewDeptPolicies();
        employee.moveIntoCubicle("1");
      
    }
}
