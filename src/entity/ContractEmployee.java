/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;

/**
 *
 * @author Topu
 */
public class ContractEmployee extends Employee {

    private double perHourRate;
    private Date contractPeriod;

    public double getPerHourRate() {
        return this.perHourRate;
    }

    public void setPerHourRate(double perHourRate) {
        this.perHourRate = perHourRate;
    }

    public Date getContractPeriod() {
        return this.contractPeriod;
    }

    public void setContractPeriod(Date contractPeriod) {
        this.contractPeriod = contractPeriod;
    }
}
