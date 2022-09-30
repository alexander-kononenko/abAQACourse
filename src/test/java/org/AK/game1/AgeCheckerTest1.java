package org.AK.game1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AgeCheckerTest1 {
    @Test
    public void testAgedUserCanPlay (){
        AgeChecker ageChecker = new AgeChecker();
        Assert.assertTrue(ageChecker.CanPlayGameAge(18), "User can Play and is older than 18");
    }
    @Test
    public void testThatTooYongUsersCanNotPlay () {
        AgeChecker ageChecker = new AgeChecker();
        Assert.assertFalse(ageChecker.CanPlayGameAge(11), "User is too young");
    }
}

