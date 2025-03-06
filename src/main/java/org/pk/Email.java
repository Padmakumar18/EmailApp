package org.pk;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private int defaultPassLen = 8;

    public Email(String firstName , String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.department = setDepartment();
        
        this.password = randompassword(this.defaultPassLen);
        System.out.println(this.password);
    }

    private String setDepartment() {
        System.out.println("Enter the department\n1 for sales\n2 for Development\n3 for Accounting\n0 for none");
        Scanner sc = new Scanner(System.in);
        int dept = sc.nextInt();
        sc.close();
        switch (dept) {
            case 1:
                return "Sales";
            case 2:
                return "Development";
            case 3:
                return "Accounting";
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
}
