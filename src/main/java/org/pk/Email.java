package org.pk;

import java.util.Scanner;
public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String alternateEmail;
    private String department;
    private int mailboxCapacity = 100;
    private int defaultPassLen = 8;
    private String companySuffix = "company.dev"; 

    public Email(String firstName , String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.department = setDepartment();
        
        this.password = randompassword(this.defaultPassLen);

        this.email = this.firstName.toLowerCase() + this.lastName.toLowerCase() + "@" +this.department.toLowerCase() + companySuffix;
        // System.out.println("\nEmail\n" + this.email);
    }

    private String setDepartment() {
        System.out.println("Enter the department\n1 for sales\n2 for Development\n3 for Accounting\n0 for none");
        Scanner sc = new Scanner(System.in);
        int dept = sc.nextInt();
        // sc.close();
        switch (dept) {
            case 1:
                return "sales";
            case 2:
                return "developer";
            case 3:
                return "accountant";
            default:
                return  "";
        }
    }

    private String randompassword(int len) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%^&*()_+";
        char[] pass = new char[len];
        for (int i = 0; i < len; i++) {
            int ran = (int)(Math.random()*passwordSet.length());
            pass[i] = passwordSet.charAt(ran);
         }
         return new String(pass);
    }

    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailboxCapacity() {
        return this.mailboxCapacity;
    }

    public String getAlternateEmail() {
        return this.alternateEmail;
    }

    public String getPassword() {
        return this.password;
    }

    public String getEmail() {
        return this.email;
    }

    public String showInfo() {
        return "NAME : " + this.firstName + this.lastName + 
        "\nCOMPANY MAIL : " + this.email +
        "\nMAILBOX SIZE : " + this.mailboxCapacity + " mb";
    }
}