package com.kodilla.testing.user;

import org.junit.*;

public class TestingUser {

    @Before
    public void before() {
        System.out.println("\tTest CASE begin:");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test SUITE begin:");
    }

    @After
    public void after() {
        System.out.println("\t:Test CASE end");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println(":Test SUITE end");
    }

    @Test
    public void testCaseUserName() {
        System.out.println("Testing Case User Name");
        //Given
        SimpleUser simpleUser = new SimpleUser("Spider-Man","Peter Parker");
        //When
        String result = simpleUser.getUsername();
        //Then
        Assert.assertEquals("Spider-Man", result);
    }

    @Test
    public void testCaseRealName() {
        System.out.println("Testing Case Real Name");
        //Given
        SimpleUser simpleUser = new SimpleUser("Spider-Man","Peter Parker");
        //When
        String result = simpleUser.getRealName();
        //Then
        Assert.assertEquals("Peter Parker", result);
    }
}
