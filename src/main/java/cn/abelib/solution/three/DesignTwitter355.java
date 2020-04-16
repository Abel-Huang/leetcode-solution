package cn.abelib.solution.three;

import org.junit.Test;

import java.util.*;

/**
 * @Author: abel.huang
 * @Date: 2020-04-13 21:31
 */
public class DesignTwitter355 {
    class Twitter {
        private Map<Integer, Set<Integer>> follows;
        private List<Integer> users;
        private List<Integer> tweets;
        /** Initialize your data structure here. */
        public Twitter() {
            follows = new HashMap<>();
            users = new ArrayList<>();
            tweets = new ArrayList<>();
        }

        /** Compose a new tweet. */
        public void postTweet(int userId, int tweetId) {
            Set<Integer> followers;
            if (!follows.containsKey(userId)) {
                followers = new HashSet<>();
            } else {
                followers = follows.get(userId);
            }
            followers.add(userId);
            follows.put(userId, followers);
            users.add(0, userId);
            tweets.add(0, tweetId);
        }

        /** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */
        public List<Integer> getNewsFeed(int userId) {
            List<Integer> feeds = new ArrayList<>();
            if (!follows.containsKey(userId)) {
                return feeds;
            }
            Set<Integer> userIds = follows.get(userId);
            for (int i = 0; i < users.size(); i++ ) {
                if (userIds.contains(users.get(i))) {
                    feeds.add(tweets.get(i));
                    if (feeds.size() == 10) {
                        break;
                    }
                }
            }
            return feeds;
        }

        /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
        public void follow(int followerId, int followeeId) {
            if (followeeId == followerId) {
                return;
            }
            Set<Integer> followers;
            if (!follows.containsKey(followerId)) {
                followers = new HashSet<>();
            } else {
                followers = follows.get(followerId);
            }
            followers.add(followeeId);
            follows.put(followerId, followers);
        }

        /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
        public void unfollow(int followerId, int followeeId) {
            if (followeeId == followerId) {
                return;
            }
            if (follows.containsKey(followerId)) {
                Set<Integer> followers = follows.get(followerId);
                followers.remove(followeeId);
                follows.put(followerId, followers);
            }
        }
    }

    @Test
    public void test1() {
        /**
         * Your Twitter object will be instantiated and called as such:
         * */
         Twitter twitter = new Twitter();
         twitter.postTweet(1, 5);
         List<Integer> feeds1 = twitter.getNewsFeed(1);
         System.err.println(feeds1);
         twitter.follow(1, 2);
         twitter.postTweet(2, 6);
         List<Integer> feeds2 = twitter.getNewsFeed(1);
         System.err.println(feeds2);
         twitter.unfollow(1, 2);
         List<Integer> feeds3 = twitter.getNewsFeed(1);
         System.err.println(feeds3);
    }
}
