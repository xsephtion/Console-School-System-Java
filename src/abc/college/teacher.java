/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc.college;

/**
 *
 * @author joseph
 */
public class teacher extends person {
     private String fname,lname, add, gender, uniqueID, Des, Dept;
     public int pNumber;
     private double netSalary;
    public teacher(){
    fname = "";
    lname = "";
    add = "";
    gender = "";
    pNumber = 0;
    }
    
    public teacher(String uniqueID, String fname,String lname,String address,String gender,int pNumber, String des, Double netSalary,String dept){
    super(uniqueID, fname, lname, address, gender, pNumber);
    this.uniqueID = uniqueID;
    this.fname = fname;
    this.lname = lname;
    this.add = address;
    this.gender = gender;
    this.pNumber = pNumber;
    this.Des = des;
    this.netSalary = netSalary;
    this.Dept=dept;
    }
    public String getDes(){
        return Des;
    }
    
    public double getNSalary(){
        return netSalary;
    }
    public String getUID(){
    return uniqueID;
    }
    public void setUID(String UID){
        this.uniqueID = UID;
    }
    public String getFName(){
    return fname;
    }

    public void changeFName(String name){
    this.fname = name;
    }
    public String getLName(){
    return lname;
    }
    
    public void changeLName(String name){
    this.lname = name;
    }
    public String getAddress(){
    return add;
    }
    
    public void changeAddress(String add){
    this.add = add;
    }
    
    public int getTelNumber(){
    return pNumber;
    }
    
    public void changeTelNumber(int tel){
    this.pNumber= tel;
    }
    
}
