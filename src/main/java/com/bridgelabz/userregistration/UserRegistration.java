package com.bridgelabz.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public static boolean checkValidity(String value) {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,8}$");
        Matcher matcher = pattern.matcher(value);
        return matcher.matches();
    }

    public int Name(String firstName){
        int temp = 0;
        UserRegistration.checkValidity(firstName);
        if (UserRegistration.checkValidity(firstName)) {
            System.out.println("Happy");
            temp++;
        } else
            System.out.println("Sad");
        return temp;
    }

    public int emailId(String emailId) {
        int temp = 0;
        Pattern pattern = Pattern.compile("^abc([.+-]?[0-9]{3})*@[a-zA-Z0-9]{1,8}.[a-z]{3}.*([a-z]{2,3})*$");
        Matcher matcher = pattern.matcher(emailId);
        if (matcher.matches()) {
            System.out.println("Happy");
            temp++;
        } else
            System.out.println("Sad");
        return temp;
    }

    public int phNum(String phNum){
        int temp = 0;
        Pattern pattern = Pattern.compile("^[+]91[0-9]{10}$");
        Matcher matcher = pattern.matcher(phNum);
        if (matcher.matches()) {
            System.out.println("Happy");
            temp++;
        } else
            System.out.println("Sad");
        return temp;
    }

    public int password(String password){
        int temp = 0;
        Pattern pattern = Pattern.compile("^[A-Z][0-9][$&+,:;=?@#|'<>.-^*()%!][a-zA-Z0-9]{5}$");
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) {
            System.out.println("Happy");
            temp++;
        } else
            System.out.println("Sad");
        return temp;
    }

}
