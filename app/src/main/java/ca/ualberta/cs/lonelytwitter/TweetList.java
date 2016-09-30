package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by orlick on 9/29/16.
 */
public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();
    private int count = 0;

    public TweetList() {

    }

    public boolean hasTweet(Tweet tweet) {
        return tweets.contains(tweet);
    }


    public void add(Tweet tweet) {
        if (this.hasTweet(tweet)){
            throw new IllegalArgumentException();
        }
        else {
            count += 1;
            tweets.add(tweet);
        }

    }

    public void delete(Tweet tweet) {
        tweets.remove(tweet);

    }

    public Tweet getTweet(int index) {
        return tweets.get(index);
    }

    public ArrayList<Tweet> getTweets() {
        return tweets;
    }

    public int getCount() {
        return count;
    }
}
