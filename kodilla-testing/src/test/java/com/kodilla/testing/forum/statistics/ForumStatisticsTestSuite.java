package com.kodilla.testing.forum.statistics;

import com.kodilla.utilities.ColorizeText;
import forum.statistics.StatisticOperator;
import forum.statistics.Statistics;
import org.junit.*;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    @BeforeClass
    public static void beforAll() {
        System.out.println(ColorizeText.to.yellow("TESTS BEGIN:"));
    }

    @AfterClass
    public static void afterAll() {
        System.out.println(ColorizeText.to.yellow(":TESTS END"));
    }

    @Before
    public void before() {
        System.out.println(ColorizeText.to.cyan("TEST CASE BEGIN:"));
    }

    @After
    public void after() {
        System.out.println(ColorizeText.to.cyan(":TEST CASE END"));
    }

    @Test
    public void testPostsZero(){
        System.out.println(ColorizeText.to.purple("Amount of posts = 0"));
        Statistics statsMock = mock(Statistics.class);
        StatisticOperator operator = new StatisticOperator();
        ArrayList<String> users = new ArrayList<>();
        users.add("One");
        users.add("Two");
        users.add("Three");
        users.add("Four");
        when(statsMock.usersNames()).thenReturn(users);
        when(statsMock.postsCount()).thenReturn(0);
        when(statsMock.commentsCount()).thenReturn(20);
        operator.calculateAdvStatistics(statsMock);
        Assert.assertEquals(users.size(), operator.calculateAdvStatistics(statsMock).getAmountOfUsers());
        Assert.assertEquals(0, operator.calculateAdvStatistics(statsMock).getAmountOfPosts());
        Assert.assertEquals(20, operator.calculateAdvStatistics(statsMock).getAmountOfComments());
        Assert.assertEquals(0, operator.calculateAdvStatistics(statsMock).getAveragePostsPerUser(),1);
        Assert.assertEquals(20 / users.size(), operator.calculateAdvStatistics(statsMock).getAverageCommentsPerUser(),1);
        Assert.assertEquals(0, operator.calculateAdvStatistics(statsMock).getAverageCommentsPerPost(),1);
        operator.showStatistics();
    }

    @Test
    public void testPostsThousand(){
        System.out.println(ColorizeText.to.purple("Amount of posts = 1000"));
        Statistics statsMock = mock(Statistics.class);
        StatisticOperator operator = new StatisticOperator();
        ArrayList<String> users = new ArrayList<>();
        users.add("One");
        users.add("Two");
        users.add("Three");
        users.add("Four");
        when(statsMock.usersNames()).thenReturn(users);
        when(statsMock.postsCount()).thenReturn(1000);
        when(statsMock.commentsCount()).thenReturn(20);
        operator.calculateAdvStatistics(statsMock);
        Assert.assertEquals(users.size(), operator.calculateAdvStatistics(statsMock).getAmountOfUsers());
        Assert.assertEquals(1000, operator.calculateAdvStatistics(statsMock).getAmountOfPosts());
        Assert.assertEquals(20, operator.calculateAdvStatistics(statsMock).getAmountOfComments());
        Assert.assertEquals(1000 / users.size(), operator.calculateAdvStatistics(statsMock).getAveragePostsPerUser(),1);
        Assert.assertEquals(20 / users.size(), operator.calculateAdvStatistics(statsMock).getAverageCommentsPerUser(),1);
        Assert.assertEquals(20 / 1000d, operator.calculateAdvStatistics(statsMock).getAverageCommentsPerPost(),1);
        operator.showStatistics();
    }

    @Test
    public void testCommentsZero(){
        System.out.println(ColorizeText.to.purple("Amount of Comments = 0"));
        Statistics statsMock = mock(Statistics.class);
        StatisticOperator operator = new StatisticOperator();
        ArrayList<String> users = new ArrayList<>();
        users.add("One");
        users.add("Two");
        users.add("Three");
        users.add("Four");
        when(statsMock.usersNames()).thenReturn(users);
        when(statsMock.postsCount()).thenReturn(10);
        when(statsMock.commentsCount()).thenReturn(0);
        operator.calculateAdvStatistics(statsMock);
        Assert.assertEquals(users.size(), operator.calculateAdvStatistics(statsMock).getAmountOfUsers());
        Assert.assertEquals(10, operator.calculateAdvStatistics(statsMock).getAmountOfPosts());
        Assert.assertEquals(0, operator.calculateAdvStatistics(statsMock).getAmountOfComments());
        Assert.assertEquals(10 / users.size(), operator.calculateAdvStatistics(statsMock).getAveragePostsPerUser(),1);
        Assert.assertEquals(0 / users.size(), operator.calculateAdvStatistics(statsMock).getAverageCommentsPerUser(),1);
        Assert.assertEquals(0 / 10d, operator.calculateAdvStatistics(statsMock).getAverageCommentsPerPost(),1);
        operator.showStatistics();
    }

    @Test
    public void testMoreCommentsThenPosts(){
        System.out.println(ColorizeText.to.purple("More Comments then Posts"));
        Statistics statsMock = mock(Statistics.class);
        StatisticOperator operator = new StatisticOperator();
        ArrayList<String> users = new ArrayList<>();
        users.add("One");
        users.add("Two");
        users.add("Three");
        users.add("Four");
        when(statsMock.usersNames()).thenReturn(users);
        when(statsMock.postsCount()).thenReturn(20);
        when(statsMock.commentsCount()).thenReturn(200);
        operator.calculateAdvStatistics(statsMock);
        Assert.assertEquals(users.size(), operator.calculateAdvStatistics(statsMock).getAmountOfUsers());
        Assert.assertEquals(20, operator.calculateAdvStatistics(statsMock).getAmountOfPosts());
        Assert.assertEquals(200, operator.calculateAdvStatistics(statsMock).getAmountOfComments());
        Assert.assertEquals(20 / users.size(), operator.calculateAdvStatistics(statsMock).getAveragePostsPerUser(),1);
        Assert.assertEquals(200 / users.size(), operator.calculateAdvStatistics(statsMock).getAverageCommentsPerUser(),1);
        Assert.assertEquals(200 / 20d, operator.calculateAdvStatistics(statsMock).getAverageCommentsPerPost(),1);
        operator.showStatistics();
    }

    @Test
    public void testMorePostsThenComments(){
        System.out.println(ColorizeText.to.purple("MorePostsThenComments"));
        Statistics statsMock = mock(Statistics.class);
        StatisticOperator operator = new StatisticOperator();
        ArrayList<String> users = new ArrayList<>();
        users.add("One");
        users.add("Two");
        users.add("Three");
        users.add("Four");
        when(statsMock.usersNames()).thenReturn(users);
        when(statsMock.postsCount()).thenReturn(30);
        when(statsMock.commentsCount()).thenReturn(20);
        operator.calculateAdvStatistics(statsMock);
        Assert.assertEquals(users.size(), operator.calculateAdvStatistics(statsMock).getAmountOfUsers());
        Assert.assertEquals(30, operator.calculateAdvStatistics(statsMock).getAmountOfPosts());
        Assert.assertEquals(20, operator.calculateAdvStatistics(statsMock).getAmountOfComments());
        Assert.assertEquals(30 / users.size(), operator.calculateAdvStatistics(statsMock).getAveragePostsPerUser(),1);
        Assert.assertEquals(20 / users.size(), operator.calculateAdvStatistics(statsMock).getAverageCommentsPerUser(),1);
        Assert.assertEquals(20 / 30d, operator.calculateAdvStatistics(statsMock).getAverageCommentsPerPost(),1);
        operator.showStatistics();
    }

    @Test
    public void testUsersZero(){
        System.out.println(ColorizeText.to.purple("Amount of users = 0"));
        Statistics statsMock = mock(Statistics.class);
        StatisticOperator operator = new StatisticOperator();
        ArrayList<String> users = new ArrayList<>();
        when(statsMock.usersNames()).thenReturn(users);
        when(statsMock.postsCount()).thenReturn(101);
        when(statsMock.commentsCount()).thenReturn(20);
        operator.calculateAdvStatistics(statsMock);
        Assert.assertEquals(users.size(), operator.calculateAdvStatistics(statsMock).getAmountOfUsers());
        Assert.assertEquals(101, operator.calculateAdvStatistics(statsMock).getAmountOfPosts());
        Assert.assertEquals(20, operator.calculateAdvStatistics(statsMock).getAmountOfComments());
        Assert.assertEquals(0, operator.calculateAdvStatistics(statsMock).getAveragePostsPerUser(),1);
        Assert.assertEquals(0, operator.calculateAdvStatistics(statsMock).getAverageCommentsPerUser(),1);
        Assert.assertEquals(20 / 101d, operator.calculateAdvStatistics(statsMock).getAverageCommentsPerPost(),1);
        operator.showStatistics();
    }

    @Test
    public void testUsersHundred(){
        System.out.println(ColorizeText.to.purple("Amount of users = 100"));
        Statistics statsMock = mock(Statistics.class);
        StatisticOperator operator = new StatisticOperator();
        ArrayList<String> users = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            users.add("User " + i);
        }
        when(statsMock.usersNames()).thenReturn(users);
        when(statsMock.postsCount()).thenReturn(50);
        when(statsMock.commentsCount()).thenReturn(20);
        operator.calculateAdvStatistics(statsMock);

        Assert.assertEquals(users.size(), operator.calculateAdvStatistics(statsMock).getAmountOfUsers());
        Assert.assertEquals(50, operator.calculateAdvStatistics(statsMock).getAmountOfPosts());
        Assert.assertEquals(20, operator.calculateAdvStatistics(statsMock).getAmountOfComments());
        Assert.assertEquals(50 / users.size(), operator.calculateAdvStatistics(statsMock).getAveragePostsPerUser(),1);
        Assert.assertEquals(20 / users.size(), operator.calculateAdvStatistics(statsMock).getAverageCommentsPerUser(),1);
        Assert.assertEquals(20 / 50d, operator.calculateAdvStatistics(statsMock).getAverageCommentsPerPost(),1);

        operator.showStatistics();
    }
}
