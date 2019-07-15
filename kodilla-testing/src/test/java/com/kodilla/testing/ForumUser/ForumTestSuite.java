package com.kodilla.testing.ForumUser;

import org.junit.*;

public class ForumTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddPost() {
        //Given
        ForumUser forumUser = new ForumUser("Shinobi", "Marcin Kawczyński");

        //When
        forumUser.addPost();

        //Then
        Assert.assertEquals(1, forumUser.getPostsQuantity());
    }
}
