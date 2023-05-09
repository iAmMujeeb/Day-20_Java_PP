package com.bridgelabz.userregistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    static UserRegistration userRegistration;

    @BeforeAll
    public static void initialize() {
        userRegistration = new UserRegistration();
    }

    @Test
    void checkFirstName() {
        String firstName = "Mujeeb";
        int temp = userRegistration.Name(firstName);
        Assertions.assertEquals(1, temp);
    }

    @Test
    void checkLastName() {
        String lastName = "Saifi";
        int temp = userRegistration.Name(lastName);
        Assertions.assertEquals(1, temp);
    }

    @Test
    void checkEmailId(){
        String emailId = "abc+100@gmail.com";
        int temp = userRegistration.emailId(emailId);
        Assertions.assertEquals(1, temp);
    }

    @Test
    void checkPhNum(){
        String phNum = "+919702667788";
        int temp = userRegistration.phNum(phNum);
        Assertions.assertEquals(1, temp);
    }

    @Test
    void checkPassword(){
        String password = "M1@asdfg";
        int temp = userRegistration.password(password);
        Assertions.assertEquals(1, temp);
    }

}
