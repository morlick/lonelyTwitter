package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by orlick on 9/15/16.
 */

public abstract class CurrentMood {

    private Date date;

    public CurrentMood(Date date){
        this.date = date;
    }

    public CurrentMood() {
        Date theDate = new Date();
        this.date = theDate;

    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract String myMood();

}
