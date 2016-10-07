package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;

/**
 * Created by orlick on 9/29/16.
 */
public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest() {
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    public void testAddTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding tweet");
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

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

    public void testDelete() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.add(tweet);
        list.delete(tweet);
        assertFalse(list.hasTweet(tweet));
    }

    public void testCorrectCount() {
        TweetList list = new TweetList();

        Tweet tweet = new NormalTweet("test");
        Tweet tweet2 = new NormalTweet("test 2");;
        list.add(tweet);
        list.add(tweet2);
        assertEquals(list.getCount(), 2);
    }

    public void testListHasTweet() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.add(tweet);
        assertTrue(list.hasTweet(tweet));

    }

    public void testGetTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test");
        tweets.add(tweet);
        Tweet returnedTweet = tweets.getTweet(0);
        assertEquals(returnedTweet.getMessage(), tweet.getMessage());
    }

    public void testHasTweet() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.add(tweet);
        assertTrue(list.hasTweet(tweet));
    }
}
