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
public class UserC {
    private String name;
    private String loginid;
    private String password;
    private int date;
    
    UserC(String name,String loginid,String password,int date)
    {
        this.name=name;
        this.loginid=loginid;
        this.password=password;
        this.date=date;
    }
    
    String getName()
            {
                return name;
            }
            
    String getLoginid()
            {
                return loginid;
            }
    String getPassword()
    {
        return password;
    }
    int getDate()
    {
        return date;
    }
}
