package com.kodilla.testing.user;
import com.kodilla.utilities.ColorizeText;
import org.junit.*;

public class TestingUser {
    private ColorizeText ctxt = new ColorizeText(true);

    @Before
    public void before() {
        System.out.println(ctxt.cyan("Test CASE begin:"));
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test SUITE begin:");
    }

    @After
    public void after() {
        System.out.println(ctxt.cyan(":Test CASE end"));
    }

    @AfterClass
    public static void afterClass() {
        System.out.println(":Test SUITE end");
    }

    @Test
    public void testCaseUserName() {
        System.out.println(ctxt.purple("Testing Case User Name"));
        //Given
        SimpleUser simpleUser = new SimpleUser("Spider-Man","Peter Parker");
        //When
        String result = simpleUser.getUsername();
        //Then
        Assert.assertEquals("Spider-Man", result);
    }

    @Test
    public void testCaseRealName() {
        System.out.println(ctxt.purple("Testing Case Real Name"));
        //Given
        SimpleUser simpleUser = new SimpleUser("Spider-Man","Peter Parker");
        //When
        String result = simpleUser.getRealName();
        //Then
        Assert.assertEquals("Peter Parker", result);
    }
}
