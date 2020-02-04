package com.sparta.gwilymt;

import com.sun.jdi.InvalidTypeException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArmstrongNumberCheckerTest {
    @Test
    public void testThatThreeHundredAndSeventyIsAnArmstrongNumber(){
        Assertions.assertTrue(ArmstrongNumberChecker.isArmstrongNumber(370));
    }
    @Test
    public void testThatOneHundredAndTwentyThreeIsNotAnArmstrongNumber(){
        Assertions.assertFalse(ArmstrongNumberChecker.isArmstrongNumber(123));
    }
    @Test
    public void testThatTheArmstrongNumberOfThreeHundredAndSeventy(){
        Assertions.assertEquals(370, ArmstrongNumberChecker.calculateArmstrongNumber("370"));
    }
}