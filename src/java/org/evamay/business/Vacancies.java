/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.evamay.business;

/**
 *
 * @author user
 */
public class Vacancies {
    private String department;
    private String section;
    private String title;
    private String type;
    private String endDate;
    private String startDate;
    private String qualifications;
    private String duties;
    
     public Vacancies(){
    }

    public Vacancies(String department, String section, String type, String title, String qualifications,
                  String startDate, String endDate, String duties){
        this.department=department;
        this.section=section;
        this.type=type;
        this.title=title;
        this.qualifications=qualifications;
        this.startDate=startDate;
        this.endDate=endDate; 
        this.duties=duties;
    }

    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * @return the section
     */
    public String getSection() {
        return section;
    }

    /**
     * @param section the section to set
     */
    public void setSection(String section) {
        this.section = section;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the endDate
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * @return the startDate
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the qualifications
     */
    public String getQualifications() {
        return qualifications;
    }

    /**
     * @param qualifications the qualifications to set
     */
    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    /**
     * @return the duties
     */
    public String getDuties() {
        return duties;
    }

    /**
     * @param duties the duties to set
     */
    public void setDuties(String duties) {
        this.duties = duties;
    }
    
}
