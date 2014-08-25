package com.csstock.modle;
/**
 * @author Administrator
 *
 */
public class User  implements java.io.Serializable {
     private Integer id;
     private String name;
     private String password;
     private String trueName;
     private String department;
     private String telephone;
     private String mobile;
     private String mail;
     private String address;
     private String description;
     private short status;

     /** minimal constructor */
     public User(){
    	 
     }
    public User(int id, String name, String password, short status) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.status = status;
    }
    
    /**
     * @param id
     * @param name
     * @param password
     * @param trueName
     * @param department
     * @param telephone
     * @param mobile
     * @param mail
     * @param address
     * @param description
     * @param status
     */
    public User(String name,String password,String trueName,String department,String telephone,String mobile,String mail,String address,String description) {
         this.name = name;
        this.password = password;
        this.trueName = trueName;
        this.department = department;
        this.telephone = telephone;
        this.mobile = mobile;
        this.mail = mail;
        this.address = address;
        this.description = description;
        this.status = status;
    }

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getTrueName() {
        return this.trueName;
    }
    
    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    public String getDepartment() {
        return this.department;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTelephone() {
        return this.telephone;
    }
    
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getMobile() {
        return this.mobile;
    }
    
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMail() {
        return this.mail;
    }
    
    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public short getStatus() {
        return this.status;
    }
    
    public void setStatus(short status) {
        this.status = status;
    }
}