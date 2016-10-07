package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;

/**
 * Created by orlick on 9/29/16.
 *
 * This class tests the tweet list and its methods.
 *
 * @see TweetList
 */
public class TweetListTest extends ActivityInstrumentationTestCase2 {

    /**
     * Instantiates the tweet list tests.
     */
    public TweetListTest() {
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    /**
     * Tests adding a tweet.
     */
    public void testAddTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding tweet");
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    /**
     *Tests adding a duplicate tweet and ensures that it throws an exception if that happens.
     */
    public void testDuplicate() {
        boolean thrown = false;
        try {
            TweetList list = new TweetList();
            Tweet tweet = new NormalTweet("test");
            list.add(tweet);
            list.add(tweet);
        } catch (IllegalArgumentException e){
            thrown = true;
        }
        assertTrue(thrown);
    }

    /**
     * Tests if the tweets are added in chronological order.
     */
    public void testChronologicalList() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        Tweet tweet2 = new NormalTweet("test 2");
        ArrayList<Tweet> tweets = new ArrayList<Tweet>();
        tweets.add(tweet);
        tweets.add(tweet2);
        list.add(tweet);
        list.add(tweet2);
        assertEquals(list.getTweets(), tweets);
    }

    /**
     * Tests deleting a tweet.
     */
    public void testDelete() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.add(tweet);
        list.delete(tweet);
        assertFalse(list.hasTweet(tweet));
    }

    /**
     * Tests to see if the number of tweets in the list matched the count.
     */
    public void testCorrectCount() {
        TweetList list = new TweetList();

        Tweet tweet = new NormalTweet("test");
        Tweet tweet2 = new NormalTweet("test 2");;
        list.add(tweet);
        list.add(tweet2);
        assertEquals(list.getCount(), 2);
    }

    /**
     * Tests if the tweet list contains a tweet when added.
     */
    public void testListHasTweet() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.add(tweet);
        assertTrue(list.hasTweet(tweet));

    }

    /**
     * Tests the tweet list message getter.
     */
    public void testGetTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test");
        tweets.add(tweet);
        Tweet returnedTweet = tweets.getTweet(0);
        assertEquals(returnedTweet.getMessage(), tweet.getMessage());
    }

    /**
     * Tests the  tweet list method that determines if the tweet is in the list.
     */
    public void testHasTweet() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.add(tweet);
        assertTrue(list.hasTweet(tweet));
    }
}
