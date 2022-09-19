package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailBoxCapacity;
    private String alternateEmail;

    //Constructor to receive the first name and last name
    public Email(String firstName, String lastName){
        this.firstName  = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " + this.firstName + "" + this.lastName);

        //Call a method asking for the department - return the department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        //Call a method that returns a random password
    }
    //Ask for the department
    private String setDepartment() {
       System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter the department code: ");
       Scanner in = new Scanner(System.in);
       int depChoice = in.nextInt();

       if (depChoice == 1){
           return "Sales";
       } else if (depChoice == 2){
           return "dev";
       } else if (depChoice == 3){
           return "acct";
       } else {return "";}


    }

    //Generate a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i =0; i<length; i++){
           int rand = (int) Math.random() * passwordSet.length();
           password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }


    // set the mailbox capacity

    //Set the alternate email

    // change the password

}
