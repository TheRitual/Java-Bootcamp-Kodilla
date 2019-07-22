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
        if (statistics.usersNames().size() != 0) {
            this.averagePostsPerUser = (double) statistics.postsCount() / (double) statistics.usersNames().size();
            this.averageCommentsPerUser = (double) statistics.commentsCount() / (double) statistics.usersNames().size();
        }
        if (amountOfPosts != 0) {
            this.averageCommentsPerPost = (double) statistics.commentsCount() / (double) statistics.postsCount();
        }
    }

    public void showStatistics() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "STATISTICS: Users: " + amountOfUsers +
                " | Posts: " + amountOfPosts +
                " | Comments: " + amountOfComments +
                " | Average Posts per User: " + averagePostsPerUser +
                " | Average Comments per User: " + averageCommentsPerUser +
                " | Average Comments per Post: " + averageCommentsPerPost;
    }
}
