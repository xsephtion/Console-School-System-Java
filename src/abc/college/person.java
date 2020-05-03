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
public class person {
    private String fname,lname, add, gender;
    private int pNumber;
    private String uniqueID;
    
 public person(){
     fname = "";
     lname = "";
     add = "";
     gender = "";
     pNumber = 0;
     uniqueID = "";
     
 }
public person(String uid, String fname, String lname, String addrs, String gender, int pNumb){
     this.fname=fname;
     this.lname=lname;
     this.add=addrs;
     this.gender=gender;
     this.pNumber = pNumb;
     this.uniqueID = uid;
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
 
}
