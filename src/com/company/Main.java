/*
Project: CarDealership- SalesLeads
Purpose Details: create a functioning car dealership
Course: IST 242
Author: Mosam Ray
Date Developed: 3/13/19
Last Date Changed: 3/18/19
Rev: 2
 */


package com.company;

public class Main {

    public static void main(String[] args) {
        SalesLead s1 = new SalesLead(1, "Ravi", "Patel");
        s1.printAllInformation();

        SalesLead s2 = new SalesLead(2, "Mary", "Smith");
        s2.printAllInformation();

        SalesLead s3 = new SalesLead(3, "Johnny", "Jones");
        s3.printAllInformation();

    }
}



