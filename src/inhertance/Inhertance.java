/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inhertance;

import entity.ContractEmployee;
import entity.Employee;
import entity.RegularEmployee;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Topu
 */
public class Inhertance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        
        Employee employee = new Employee();
        employee.setName("Employee");
        
        
        RegularEmployee regularEmployee = new RegularEmployee();
        regularEmployee.setName("Regular");
        regularEmployee.setSalary(20_000);
        regularEmployee.setBonus(1_000);
        
        ContractEmployee contractEmployee = new ContractEmployee();
        contractEmployee.setName("Contract");
        contractEmployee.setPerHourRate(2_500);
        contractEmployee.setContractPeriod(new Date());
        
        session.save(employee);
        session.save(regularEmployee);
        session.save(contractEmployee);        
        
        transaction.commit();
        session.close();
        
    }
}
