package forum.statistics;

public class StatisticOperator {
    private int amountOfUsers = 0;
    private int amountOfPosts = 0;
    private int amountOfComments = 0;
    private double averagePostsPerUser = 0;
    private double averageCommentsPerUser = 0;
    private double averageCommentsPerPost = 0;

    public void calculateAdvStatistics(Statistics statistics) {
        this.amountOfUsers = statistics.usersNames().size();
        this.amountOfPosts = statistics.postsCount();
        this. amountOfComments = statistics.commentsCount();
        this.averagePostsPerUser = amountOfPosts / amountOfUsers;
        this.averageCommentsPerUser = amountOfComments / amountOfUsers;
        this.averageCommentsPerPost = amountOfComments / amountOfPosts;
    }

    public void showStatistics() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "STATISTICS: Users: " + amountOfUsers +
                "Posts: " + amountOfPosts +
                "Comments: " + amountOfComments +
                "Average Posts per User: " + averagePostsPerUser +
                "Average Comments per User: " + averageCommentsPerUser +
                "Average Comments per Post: " + averageCommentsPerPost;
    }
}
