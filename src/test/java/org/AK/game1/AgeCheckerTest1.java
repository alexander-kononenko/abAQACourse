package org.AK.game1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AgeCheckerTest1 {
    @Test
    public void testAgedUsedCanPlay (){
        AgeChecker ageChecker = new AgeChecker();
        Assert.assertTrue(ageChecker.CanPlayGameAge(21), "User can Play");
    }
}
