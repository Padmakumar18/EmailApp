package org.pk;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String departmant;
    private int mailboxCapacity;

    public Email(String firstName , String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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
}
