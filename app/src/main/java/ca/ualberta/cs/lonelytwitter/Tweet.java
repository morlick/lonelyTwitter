package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by orlick on 9/15/16.
 */
public abstract class Tweet implements Tweetable{
    private String message;
    private Date date;
    private CurrentMood mood;

    public Tweet(String message) {
        this.message = message;

    }
    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    public abstract Boolean isImportant();

    public void setMood(CurrentMood mood){
        this.mood = mood;
        }



    public void setMessage(String mesage) throws TweetTooLongException {
        if(message.length() > 140){
            //do something
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    public void setDate(Date date) {

        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }

}