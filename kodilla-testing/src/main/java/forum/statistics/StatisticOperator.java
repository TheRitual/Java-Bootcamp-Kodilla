package forum.statistics;

public class StatisticOperator {
    private ImmutableStatistics statistics;

    public void calculateAdvStatistics(Statistics statistics) {
        double averagePostsPerUser = 0;
        double averageCommentsPerUser = 0;
        double averageCommentsPerPost = 0;
        if (statistics.usersNames().size() != 0) {
            averagePostsPerUser = (double) statistics.postsCount() / (double) statistics.usersNames().size();
            averageCommentsPerUser = (double) statistics.commentsCount() / (double) statistics.usersNames().size();
        }
        if (statistics.postsCount() != 0) {
            averageCommentsPerPost = (double) statistics.commentsCount() / (double) statistics.postsCount();
        }

        this.statistics = new ImmutableStatistics(statistics.usersNames().size(),statistics.postsCount(),statistics.commentsCount(),averagePostsPerUser,averageCommentsPerUser,averageCommentsPerPost);
    }

    public void showStatistics() {
        System.out.println(toString());
    }

    public ImmutableStatistics getStatistics() {
        return statistics;
    }

    @Override
    public String toString() {
        return "STATISTICS: Users: " + statistics.getAmountOfUsers() +
                " | Posts: " + statistics.getAmountOfPosts() +
                " | Comments: " + statistics.getAmountOfComments() +
                " | Average Posts per User: " + statistics.getAveragePostsPerUser() +
                " | Average Comments per User: " + statistics.getAverageCommentsPerUser() +
                " | Average Comments per Post: " + statistics.getAverageCommentsPerPost();
    }
}
