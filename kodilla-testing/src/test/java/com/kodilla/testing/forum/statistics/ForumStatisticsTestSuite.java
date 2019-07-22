package com.kodilla.testing.forum.statistics;

import com.kodilla.utilities.ColorizeText;
import forum.statistics.StatisticOperator;
import forum.statistics.Statistics;
import org.junit.*;

import static org.mockito.Mockito.mock;

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
        operator.calculateAdvStatistics(statsMock);
    }
}
