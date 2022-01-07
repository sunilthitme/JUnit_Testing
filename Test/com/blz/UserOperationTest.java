package com.blz;

import org.junit.Assert;
import org.junit.Test;

public class UserOperationTest {

        UserOperation userRegistration = new UserOperation();
        @Test
        public void givenFirstName_WhenProper_ShouldReturnTrue() {
            boolean result = userRegistration.firstName("Sunil");
            Assert.assertEquals(true, result);
        }
}
