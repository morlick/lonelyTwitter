package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

//import io.searchbox.annotations.JestId;

public abstract class Tweet implements Tweetable {
    /* public String getId() {
        return id;
    }
    */   // method never used so removed
    public void setId(String id) {
        this.id = id;
    }

    //@JestId
    private String id;
    private final String message; // added final modifier because it doesn't change
    private final Date date; // added final modifier because it doesn't change

    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    @Override
    public String toString(){
        return message;
    }

   /* public abstract Boolean isImportant(); */ // method never used so removed

    /*
    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140){
            //Do Something!
            throw new TweetTooLongException();
        }
        this.message = message;
    }
    */ // method never used so removed

    /*
    public void setDate(Date date) {
        this.date = date;
    }
    */  // method never used so removed

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }
}