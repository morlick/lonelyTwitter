package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by watts1 on 9/15/16.
 *
 * This class is for tweets. There are normal and important tweets. A tweet has a message and a
 * date.
 * @see NormalTweet
 * @see NormalTweet
 */
public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;

    /**
     * Instantiates a new Tweet with a message and auto-fills the date.
     *
     * @param message the message
     */
    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    /**
     * Instantiates a new Tweet with a message and a date.
     *
     * @param message the message
     * @param date    the date
     */
    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    /**
     * This method returns the message of the tweet.
     * @return String
     */
    @Override
    public String toString() {
        return message;
    }

    /**
     * This method is implemented by classes that inherit from this one. They retrun true if the
     * tweet is important.
     *
     * @return  Boolean
     */
    public abstract Boolean isImportant();


    /**
     * This message sets the message of the tweet.
     *
     * @param message the message
     * @throws TweetTooLongException the tweet too long exception
     */
    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140){
            //Do Something!
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    /**
     * This method sets date of the tweet.
     *
     * @param date the date
     */
    public void setDate(Date date) {

        this.date = date;
    }

    /**
     * This method returns the message of the tweet
     *
     * @return String
     */
    public String getMessage() {
        return message;
    }

    /**
     * This method return teh date of the tweet.
     *
     * @return Date
     */
    public Date getDate() {
        return date;
    }
}
