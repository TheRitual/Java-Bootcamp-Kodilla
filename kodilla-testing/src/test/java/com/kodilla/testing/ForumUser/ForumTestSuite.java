package com.kodilla.testing.ForumUser;

import org.junit.*;
import com.kodilla.utilities.ColorizeText;

public class ForumTestSuite {
    private static int testCounter = 0;
    private static ColorizeText ct = new ColorizeText(true);

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println(ct.cyan("This is the beginning of tests."));
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println(ct.cyan("All tests are finished."));
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println(ct.purple("Preparing to execute test #" + testCounter));
    }

    @Test
    public void testAddUser() {
        System.out.println(ct.yellow("test: Add User"));
        //Given
        Forum photoForum = new Forum();

        //When
        photoForum.addUser("Shinobi","Marcin Kawczyński");

        //Then
        Assert.assertEquals(1, photoForum.getUsersQuantity());
    }

    @Test
    public void testAddPost() {
        System.out.println(ct.yellow("test: Add Post"));
        //Given
        Forum photoForum = new Forum();
        photoForum.addUser("Shinobi","Marcin Kawczyński");

        //When
        photoForum.addPost(photoForum.getUser(0).getUuid(),"[Kitten Image]");

        //Then
        Assert.assertEquals(1, photoForum.getPostsQuantity());
    }

    @Test
    public void testAddComment() {
        System.out.println(ct.yellow("test: Add Comment"));
        //Given
        Forum photoForum = new Forum();
        photoForum.addUser("Shinobi","Marcin Kawczyński");
        photoForum.addPost(photoForum.getUser(0).getUuid(),"[Kitten Image]");

        //When
        photoForum.addComment(photoForum.getUser(0).getUuid(),photoForum.getPost(0).getUuid(),"How sweet it is!");

        //Then
        Assert.assertEquals(1, photoForum.getCommentsQuantity());
    }

    @Test
    public void testGetPost() {
        System.out.println(ct.yellow("test: Get Post"));
        //Given
        Forum photoForum = new Forum();
        photoForum.addUser("Shinobi","Marcin Kawczyński");
        photoForum.addPost(photoForum.getUser(0).getUuid(),"[Kitten Image]");

        //When
        ForumPost retrievedPost = photoForum.getPost(0);
        ForumPost thePost = new ForumPost("a","[Kitten Image]");

        //Then
        Assert.assertEquals(thePost.getBody(), retrievedPost.getBody());
    }

    @Test
    public void testGetComment() {
        System.out.println(ct.yellow("test: Get Comment"));
        //Given
        Forum photoForum = new Forum();
        photoForum.addUser("Shinobi","Marcin Kawczyński");
        photoForum.addPost(photoForum.getUser(0).getUuid(),"[Kitten Image]");
        photoForum.addComment(photoForum.getUser(0).getUuid(),photoForum.getPost(0).getUuid(),"How sweet it is!");

        //When
        ForumPost retrievedComment = photoForum.getPost(0);
        ForumComment theComment = new ForumComment("unknown","unknown" , "How sweet it is");

        //Then
        Assert.assertEquals(theComment.getBody(), retrievedComment.getBody());
    }

    @Test
    public void testRemovePostNotExist() {
        System.out.println(ct.yellow("test: Remove Post that doesn't exists"));
        //Given
        Forum photoForum = new Forum();
        photoForum.addUser("Shinobi","Marcin Kawczyński");
        photoForum.addPost(photoForum.getUser(0).getUuid(),"[Kitten Image]");

        //When
        boolean result = photoForum.removePost(0);

        //Then
        Assert.assertTrue(result);
    }

    @Test
    public void testRemovePostAndItsComments() {
        System.out.println(ct.yellow("test: Remove post with comments"));
        //Given
        Forum photoForum = new Forum();
        photoForum.addUser("Shinobi","Marcin Kawczyński");
        photoForum.addPost(photoForum.getUser(0).getUuid(),"[Kitten Image]");
        photoForum.addComment(photoForum.getUser(0).getUuid(),photoForum.getPost(0).getUuid(),"How sweet it is!");
        String postUuid = photoForum.getPost(0).getUuid();

        //When
        photoForum.removePost(0);
        ForumComment comment = photoForum.getCommentsStream().filter( c -> c.getPostUuid() == postUuid).findFirst().orElse(null);

        //Then
        Assert.assertNotNull(comment);
    }

    @Test
    public void testRemoveCommentNotExist() {
        System.out.println(ct.yellow("test: Remove comment that doesn't exists"));
        //Given
        Forum photoForum = new Forum();
        photoForum.addUser("Shinobi","Marcin Kawczyński");
        photoForum.addPost(photoForum.getUser(0).getUuid(),"[Kitten Image]");
        photoForum.addComment(photoForum.getUser(0).getUuid(),photoForum.getPost(0).getUuid(),"How sweet it is!");

        //When
        boolean result = photoForum.removeComment(0);

        //Then
        Assert.assertTrue(result);
    }
}
