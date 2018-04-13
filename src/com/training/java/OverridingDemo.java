package com.training.java;

public class OverridingDemo {
    public static void main(String args[]){  
        Midwest  m=new  Midwest();  
        ICICI i=new ICICI();  
        AXIS a=new AXIS();  
        System.out.println("Midwest Rate of Interest: "+m.getRateOfInterest() + "%");  
        System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest() + "%");  
        System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest() + "%");  
    }
}

abstract class  Loan{
    int getRateOfInterest(){return 0;}
}

//abstract class  Loan1{
//    int getRateOfInterest(){return 0;}
//}
//interface Loan {
//    int getRateOfInterest();
//}
//
//interface Loan1 {
//    int getRateOfInterest();
//}

class Midwest extends Loan{
    int getRateOfInterest(){return 8;}
}

class ICICI  extends  Loan{  
    int getRateOfInterest(){return 7;}
    }
class AXIS extends  Loan{  
    int getRateOfInterest(){return 9;}
    }