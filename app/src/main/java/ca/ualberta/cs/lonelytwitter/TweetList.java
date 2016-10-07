package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by orlick on 9/29/16.
 *
 * This class is a list of tweets. It contains tweets of type Tweet.
 */
public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();
    private int count = 0;

    /**
     * Instantiates a new Tweet list.
     */
    public TweetList() {

    }

    /**
     * Has tweet boolean.
     *
     * @param tweet the tweet
     * @return the boolean
     */
    public boolean hasTweet(Tweet tweet) {
        return tweets.contains(tweet);
    }


    /**
     * Add a new tweet to the tweet list and increases the count for the number of tweets.
     *
     * @param tweet the tweet
     * @throws IllegalArgumentException
     */
    public void add(Tweet tweet) {
        if (this.hasTweet(tweet)){
            throw new IllegalArgumentException();
        }
        else {
            count += 1;
            tweets.add(tweet);
        }

    }

    /**
     * Deletes a tweet from the tweet list.
     *
     * @param tweet the tweet
     */
    public void delete(Tweet tweet) {
        tweets.remove(tweet);

    }

    /**
     * This method returns the tweet at the index provided.
     *
     * @param index the index
     * @return the tweet
     */
    public Tweet getTweet(int index) {
        return tweets.get(index);
    }

    /**
     * This method return the tweet list.
     *
     * @return the tweets
     */
    public ArrayList<Tweet> getTweets() {
        return tweets;
    }

    /**
     * Returns the number of tweets in the tweet list.
     *
     * @return the count
     */
    public int getCount() {
        return count;
    }
}
