/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc.college;

import java.util.Scanner;

/**
 *
 * @author joseph
 */
public class student extends person {
    private String fname,lname, add, gender;
    public int nbrMdl, nbrRptMdl,amtPD ,pNumber;
    private String uniqueID;
    public student(){
    fname = "";
    lname = "";
    add = "";
    gender = "";
    pNumber = 0;
    amtPD = 0;
    nbrMdl = 0;
    nbrRptMdl = 0;
    }
    public student(String uniqueID, String fname,String lname,String address,String gender,int pNumber,int nrMdl,int nrRptMdl,int amtPd){
    super(uniqueID, fname, lname, address, gender, pNumber);
    this.uniqueID = uniqueID;
    this.fname = fname;
    this.lname = lname;
    this.add = address;
    this.gender = gender;
    this.pNumber = pNumber;
    this.nbrMdl = nrMdl*525;
    this.nbrRptMdl = nrRptMdl*110;
    this.amtPD = amtPd;
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
/**
* changes the variable name
*/
    public void changeFName(String name){
    this.fname = name;
    }
    public String getLName(){
    return lname;
    }
/**
* changes the variable name
*/
    public void changeLName(String name){
    this.lname = name;
    }
/**
* returns the variable add
*/
    public String getAddress(){
    return add;
    }

/**
* changes the variable add
*/
    public void changeAddress(String add){
    this.add = add;
    }
/**
* returns the variable tel
*/
    public int getTelNumber(){
    return pNumber;
    }
/**
* changes the variable tel
*/
    public void changeTelNumber(int tel){
    this.pNumber= tel;
    }
    public int getModule(){
        return nbrMdl + nbrRptMdl;
    }
    }
    

