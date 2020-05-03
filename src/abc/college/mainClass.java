/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc.college;

import java.util.Scanner;


public class mainClass {

    /**
     * @param args the command line arguments
     */
    
    private static int top = 0;
    private static int top1 = 0;
    private static student[] slist;
    private static teacher[] tlist;
    private static final int MAXENTRIES = 999;
    
    public String randomUID(){
        String s = "";
        double d;
        for(int i = 1; i<=16; i++){
            d = Math.random()*10;
            s = s+((int)d);
            if (i%4 == 0 && i !=16){
                s = s+"-";
            }
        }
        return s;
    }
    
    
    public static void main(String[] args) {
       mainClass mClass = new mainClass();
       Scanner in = new Scanner(System.in);
        int opt;
        do{
        System.out.println("ABC College");
        System.out.println("1) Student Entry");
        System.out.println("2) Teacher Entry");
        System.out.println("0) Exit");
        opt = in.nextInt();
        if (opt == 1){
            mClass.studentOpt();
        }else if(opt == 2){
            mClass.teacherOpt();
        }}while(opt != 0);
       
    }
    
    public mainClass(){
        slist = new student[MAXENTRIES];
        tlist = new teacher[MAXENTRIES];
    }
  
    public void studentOpt() {
        Scanner in = new Scanner(System.in);
        int opt;
        
        do{
        System.out.println("1) Add Student");
        System.out.println("2) View Student");
        System.out.println("3) Delete Student");
        System.out.println("4) Exit");
        opt = in.nextInt();
        in.nextLine();
        if (opt == 1){
            studentGetter();
            randomUID();
            
        } 
        else if (opt == 2){
            studententryViewer();
        }
        else if (opt == 3){
            studentEntryDelete();
        }
       
        }while(opt != 4);
        
        
    }
    public  void studentGetter(){
   
        try{
       Scanner in = new Scanner(System.in);
       String fname, lname, gender, address;
       int pNumber, nrMdl, nbrRptMdl, amtPd;
       System.out.println("First Name: ");
       fname = in.next();
       in.nextLine();
       System.out.println("Last Name: ");
       lname = in.next();
       in.nextLine();
       System.out.println("Gender: ");
       gender = in.next();
       in.nextLine();
       System.out.println("Address: ");
       address = in.next();
       in.nextLine();
       System.out.println("Phone Number: ");
       pNumber = in.nextInt();
       in.nextLine();
       System.out.println("Number of Modules: ");
       
       nrMdl = in.nextInt();
       in.nextLine();do{
           if(nrMdl > 6){
               System.out.println("Must not exceed 6 Modules!");
               System.out.println("Re enter how many modules again:");
               nrMdl = in.nextInt();
           }else{}
       }while(nrMdl > 6);
       
       
       System.out.println("Number of Repeated Modules: ");
       
       nbrRptMdl = in.nextInt();
       in.nextLine();do{
       if (nbrRptMdl+nrMdl > 6){
           int sum = nbrRptMdl+nrMdl;
           System.out.println("Must not exceed 6 Modules!");
           System.out.println("Module Count:" + sum);
           System.out.println("Previous module: "+ nrMdl);
           System.out.println("Inputed repeated Module: "+nbrRptMdl);
           System.out.println("Do you want to subtract by 1 in Current Module? Y/N");
           String input = in.next();
           in.nextLine();
           if(input == "y" || input == "Y"){
               nrMdl = nrMdl-1;
           }
           nbrRptMdl = in.nextInt();
           in.nextLine();
           
       }else{}
           }while(nbrRptMdl > 6);
       
       System.out.println("Amount Paid: ");
       amtPd = in.nextInt();
       in.nextLine();
      
       person abc = new person(randomUID(),fname, lname, address, gender, pNumber);
       student st = new student(randomUID(),fname, lname, address, gender, pNumber, nrMdl, nbrRptMdl, amtPd);
       slist[top] = st;
       top++;
       }
       catch(Exception ex){}
        
    }
    public void studententryViewer(){
        try{
        for(int index = 0; index<top; index++){
            System.out.println("ID: "+slist[index].getUID());
            System.out.println("Full Name: "+slist[index].getFName() +" "+ slist[index].getLName());
            System.out.println("Address: "+slist[index].getAddress());
            System.out.println("Phone Number: "+slist[index].getTelNumber());
            System.out.println("Modules Price: "+slist[index].getModule());
        }
        }catch(Exception ex){}
        }
    public void studentEntryDelete(){
        Scanner in = new Scanner(System.in);
        try{
        
        if(top == 0) {System.out.println("Entry is empty");}
                }catch(Exception ex){}
        try{
            studententryViewer();
            System.out.println("Index to delete: ");
            int index = in.nextInt();
            if (index<0 || index >= top){
                System.out.println("Out of bounds!");
            }else{
                for(int i=index; i<top; i++){
                    slist[i] = slist[i+1];
                }slist[top]=null;
                top--;
            }
        }catch(Exception ex){}
    }
    
    
    
    
    public void teacherOpt(){
           Scanner in = new Scanner(System.in);
        int option = 0;
        
        do{
        System.out.println("1) Add Teacher");
        System.out.println("2) View Teacher");
        System.out.println("3) Exit");
        option = in.nextInt();
        in.nextLine();
        if (option == 1){
            teacherGetter();
            randomUID();
            
        } else if (option == 2){
            teacherViewer();
        }
        }while(option!= 3);
    }
    
    public void teacherGetter(){
        String DHOF = "Head of Faculty(HOF)";
        String coor = "Coordinator";
        String lec = "Lecturer";
        double teachingHours;
        Scanner in = new Scanner(System.in);
        String fname, lname, gender, address, des, dept;
        int pNumber;
         try{
       
       System.out.println("First Name: ");
       fname = in.next();
       System.out.println("Last Name: ");
       lname = in.next();
       System.out.println("Gender: ");
       gender = in.next();
       System.out.println("Address: ");
       address = in.next();
       System.out.println("Phone Number: ");
       pNumber = in.nextInt();
       System.out.println("Department(Business or Computing): ");
       dept = in.next();
       
       
       if ("business".equals(dept) || "Business".equals(dept)){
            System.out.println("Designation(Head of Faculty(HOF), Coordinator(CO), Lecturer(L)): ");
       des = in.next();
       int opts = 0;
       if("HOF".equals(des) || "hof".equals(des)){
           opts = 1;
       } 
       else if ("CO".equals(des) || "co".equals(des)){
           opts = 2;
       }
       else if ("L".equals(des) || "l".equals(des)){
           opts = 3;
       }
       
       switch(opts){
           case 1: {
               int workinghours = 8;
               double teachingHoursOVERTIME,totalSalary,ha,ma,ta,NetSalary;
           System.out.println("Worked hours: ");
           teachingHours = in.nextDouble();
               
           if(teachingHours > 8){
                teachingHoursOVERTIME = teachingHours - workinghours;
                teachingHoursOVERTIME = teachingHoursOVERTIME * 325;
                totalSalary = 1200 + teachingHoursOVERTIME;
                ha = totalSalary * 0.10;
                ma = totalSalary * 0.03;
                ta = totalSalary * 0.05;
                NetSalary = totalSalary+ha+ma+ta;
                
           } 
           else{
                totalSalary = 1200;
                ha = totalSalary * 0.10;
                ma = totalSalary * 0.03;
                ta = totalSalary * 0.05;
                NetSalary = totalSalary+ha+ma+ta;
                
           }
               person abc = new person(randomUID(),fname, lname, address, gender, pNumber);
               teacher tch = new teacher(randomUID(),fname, lname, address, gender, pNumber,DHOF,NetSalary,dept);
               tlist[top1] = tch;
               top1++;
               break;
          
           }
           case 2: {
               int workinghours = 13;
               double NetSalary;
           System.out.println("Working hours: ");
           teachingHours = in.nextDouble();
           if(teachingHours > 8){
               double teachingHoursOVERTIME = teachingHours - workinghours;
               teachingHoursOVERTIME = teachingHoursOVERTIME * 325;
               double totalSalary = 1200 + teachingHoursOVERTIME;
               double ha = totalSalary * 0.10;
               double ma = totalSalary * 0.03;
               double ta = totalSalary * 0.05;
               NetSalary = totalSalary+ha+ma+ta;
           } else{
               int totalSalary = 1200;
               double ha = totalSalary * 0.10;
               double ma = totalSalary * 0.03;
               double ta = totalSalary * 0.05;
               NetSalary = totalSalary+ha+ma+ta;
               
           }
               person abc = new person(randomUID(),fname, lname, address, gender, pNumber);
               teacher tch = new teacher(randomUID(),fname, lname, address, gender, pNumber,coor,NetSalary,dept);
               tlist[top1] = tch;
               top1++;
                break;
           }
           case 3: {
                 int workinghours = 18;
                 double NetSalary;
           System.out.println("Working hours: ");
           teachingHours = in.nextDouble();
           if(teachingHours > 8){
               double teachingHoursOVERTIME = teachingHours - workinghours;
               teachingHoursOVERTIME = teachingHoursOVERTIME * 325;
               double totalSalary = 1200 + teachingHoursOVERTIME;
               double ha = totalSalary * 0.10;
               double ma = totalSalary * 0.03;
               double ta = totalSalary * 0.05;
                NetSalary = totalSalary+ha+ma+ta;
               
           } else{
               int totalSalary = 1200;
               double ha = totalSalary * 0.10;
               double ma = totalSalary * 0.03;
               double ta = totalSalary * 0.05;
                NetSalary = totalSalary+ha+ma+ta;
               
           }
               person abc = new person(randomUID(),fname, lname, address, gender, pNumber);
               teacher tch = new teacher(randomUID(),fname, lname, address, gender, pNumber,lec,NetSalary,dept);
               tlist[top1] = tch;
               top1++;
               break;
           }
       }
      
       }
       else if("computing".equals(dept) || "Computing".equals(dept)){
            System.out.println("Designation(Head of Faculty(HOF), Coordinator(CO), Lecturer(L)): ");
       des = in.next();
       int opts = 0;
       if("HOF".equals(des) || "hof".equals(des)){
           opts = 1;
       } 
       else if ("CO".equals(des) || "co".equals(des)){
           opts = 2;
       }
       else if ("L".equals(des) || "l".equals(des)){
           opts = 3;
       }
       
       switch(opts){
           case 1: {
               int workinghours = 8;
               double teachingHoursOVERTIME,totalSalary,ha,ma,ta,NetSalary;
           System.out.println("Worked hours: ");
           teachingHours = in.nextDouble();
               
           if(teachingHours > 8){
               
                teachingHoursOVERTIME = teachingHours - workinghours;
                teachingHoursOVERTIME = teachingHoursOVERTIME * 325;
                totalSalary = 1200 + teachingHoursOVERTIME;
                ha = totalSalary * 0.10;
                ma = totalSalary * 0.03;
                ta = totalSalary * 0.05;
                NetSalary = totalSalary+ha+ma+ta;
              
           } 
           else{
              
                totalSalary = 1200;
                ha = totalSalary * 0.10;
                ma = totalSalary * 0.03;
                ta = totalSalary * 0.05;
                NetSalary = totalSalary+ha+ma+ta;
                
           }
               person abc = new person(randomUID(),fname, lname, address, gender, pNumber);
               teacher tch = new teacher(randomUID(),fname, lname, address, gender, pNumber,DHOF,NetSalary,dept);
               tlist[top1] = tch;
               top1++;
               break;
          
           }
           case 2: {
               int workinghours = 13;
               double NetSalary;
           System.out.println("Working hours: ");
           teachingHours = in.nextDouble();
           if(teachingHours > 8){
               double teachingHoursOVERTIME = teachingHours - workinghours;
               teachingHoursOVERTIME = teachingHoursOVERTIME * 325;
               double totalSalary = 1200 + teachingHoursOVERTIME;
               double ha = totalSalary * 0.10;
               double ma = totalSalary * 0.03;
               double ta = totalSalary * 0.05;
               NetSalary = totalSalary+ha+ma+ta;
           } else{
               int totalSalary = 1200;
               double ha = totalSalary * 0.10;
               double ma = totalSalary * 0.03;
               double ta = totalSalary * 0.05;
               NetSalary = totalSalary+ha+ma+ta;
               
           }
               person abc = new person(randomUID(),fname, lname, address, gender, pNumber);
               teacher tch = new teacher(randomUID(),fname, lname, address, gender, pNumber,coor,NetSalary,dept);
               tlist[top1] = tch;
               top1++;
                break;
           }
           case 3: {
                 int workinghours = 18;
                 double NetSalary;
           System.out.println("Working hours: ");
           teachingHours = in.nextDouble();
           if(teachingHours > 8){
               double teachingHoursOVERTIME = teachingHours - workinghours;
               teachingHoursOVERTIME = teachingHoursOVERTIME * 325;
               double totalSalary = 1200 + teachingHoursOVERTIME;
               double ha = totalSalary * 0.10;
               double ma = totalSalary * 0.03;
               double ta = totalSalary * 0.05;
                NetSalary = totalSalary+ha+ma+ta;
               
           } else{
               int totalSalary = 1200;
               double ha = totalSalary * 0.10;
               double ma = totalSalary * 0.03;
               double ta = totalSalary * 0.05;
                NetSalary = totalSalary+ha+ma+ta;
               
           }
               person abc = new person(randomUID(),fname, lname, address, gender, pNumber);
               teacher tch = new teacher(randomUID(),fname, lname, address, gender, pNumber,lec,NetSalary,dept);
               tlist[top1] = tch;
               top1++;
               break;
           }
       }
      
       }
      
       
       }
       catch(Exception ex){}
    }
    
    public void teacherViewer(){
        try{
        for(int index = 0; index<top1; index++){
            System.out.println("ID: "+tlist[index].getUID());
            System.out.println("Full Name: "+tlist[index].getFName() +" "+ tlist[index].getLName());
            System.out.println("Address: "+tlist[index].getAddress());
            System.out.println("Phone Number: "+tlist[index].getTelNumber());
            System.out.println("Designation: "+tlist[index].getDes());
            System.out.println("Net Salary: "+tlist[index].getNSalary());
        }
        }catch(Exception ex){}
        }
    
    }

