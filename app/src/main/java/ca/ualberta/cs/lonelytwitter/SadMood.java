package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by orlick on 9/15/16.
 */
public class SadMood extends CurrentMood{

    public SadMood(Date date) {
        super(date);
    }

    public SadMood() {
        super();
    }

    @Override
    public String myMood() {
        return "Sad";
    }
}
