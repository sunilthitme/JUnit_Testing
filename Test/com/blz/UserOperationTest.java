package com.blz;

import org.junit.Assert;
import org.junit.Test;

public class UserOperationTest {

    UserOperation userOperation = new UserOperation();
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean result = userOperation.firstName("Sunil");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFlase() {
        boolean result = userOperation.firstName("sunil");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        boolean result = userOperation.lastName("Thitame");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse() {
        boolean result = userOperation.lastName("thitame");
        Assert.assertEquals(false, result);

    }
    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        boolean result = userOperation.email("thitamesunil808@gmail.com");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmail_WhenNotProper_ShouldReturnFalse() {
        boolean result = userOperation.email("sunil&thitame@gmail.com");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
        boolean result = userOperation.phoneNumber("7219221821");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenPhoneNumber_WhenNotProper_ShouldReturnFalse() {
        boolean result = userOperation.phoneNumber("721922182");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenPPassword_WhenProper_ShouldReturnTrue() {
        boolean result = userOperation.password("Sunil@90");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenPassword_WhenNotProper_ShouldReturnFalse() {
        boolean result = userOperation.password("Sunil@2222");
        Assert.assertEquals(false, result);
    }
}
