/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.evamay.business;

/**
 *
 * @author Eva
 */
public class Staff {
    private String staffId;
    private String lname;
    private String fname;
    private String mname;
    private String designation;
    private String password;
    
     public Staff() {
    }

    
    public Staff(String fname,String lname,  String mname,String staffId,
   String designation, String password)
    {
        this.fname=fname;
        this.lname=lname;
        this.mname=mname;
        this.staffId=staffId;
        this.designation=designation;
        this.password=password;
    }

    /**
     * @return the staffId
     */
    public String getStaffId() {
        return staffId;
    }

    /**
     * @param staffId the staffId to set
     */
    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    /**
     * @return the lname
     */
    public String getLname() {
        return lname;
    }

    /**
     * @param lname the lname to set
     */
    public void setLname(String lname) {
        this.lname = lname;
    }

    /**
     * @return the fname
     */
    public String getFname() {
        return fname;
    }

    /**
     * @param fname the fname to set
     */
    public void setFname(String fname) {
        this.fname = fname;
    }

    /**
     * @return the mname
     */
    public String getMname() {
        return mname;
    }

    /**
     * @param mname the mname to set
     */
    public void setMname(String mname) {
        this.mname = mname;
    }

    /**
     * @return the designation
     */
    public String getDesignation() {
        return designation;
    }

    /**
     * @param designation the designation to set
     */
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    
            
    
}
