/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical;

/**
 *
 * @author nidhi
 */
public class UserB {
    private String name;
    private String company;
    private String batchno;
    private int expirydate;
    private float rate;
    private int availability;
    
    UserB(String name,String company,String batchno,int expirydate,float rate,int availability)
    {
        this.name=name;
        this.company=company;
        this.batchno=batchno;
        this.expirydate=expirydate;
        this.rate=rate;
        this.availability=availability;
       
    }
    String getName()
    {
        return name;
    }
    String getCompany()
    {
        return company;
    }
    String getBatchno()
    {
        return batchno;
    }
    int getExpirydate()
    {
        return expirydate;
    }
    float getRate()
    {
        return rate;
    }
    int getAvailability()
    {
        return availability;
    }
}
